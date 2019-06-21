package com.cizuss.asynclol;

import com.twitter.finagle.Http;
import com.twitter.finagle.Service;
import com.twitter.finagle.http.Message;
import com.twitter.finagle.http.Request;
import com.twitter.finagle.http.RequestBuilder;
import com.twitter.finagle.http.Response;
import com.twitter.util.Future;
import scala.runtime.BoxedUnit;
import scala.runtime.Nothing$;

public class HttpClient {
    private String host;
    private Service<Request, Response> service;
    private String apiKey;

    private final RequestBuilder.RequestEvidence<RequestBuilder.Valid, Nothing$> requestEvidence = new RequestBuilder.RequestEvidence<RequestBuilder.Valid, Nothing$>() {
    };

    public HttpClient(String host, String apiKey) {
        this.host = host;
        this.apiKey = apiKey;
        this.service = Http.client().withTls(host).newService(host + ":443");
    }

    public Future<String> doGet(String url) {
        String resolvedUrl = "https://" + host + url;
        Request request = new RequestBuilder().url(resolvedUrl).buildGet(requestEvidence);
        request.headerMap().put("X-Riot-Token", apiKey);
        request.headerMap().put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36");

        return service.apply(request).map(Message::getContentString).onFailure(err -> {
            err.printStackTrace();
            return BoxedUnit.UNIT;
        });
    }
}
