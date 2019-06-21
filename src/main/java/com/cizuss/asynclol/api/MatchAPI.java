package com.cizuss.asynclol.api;

import com.cizuss.asynclol.HttpClient;
import com.cizuss.asynclol.dto.MatchDTO;
import com.cizuss.asynclol.dto.MatchlistDTO;
import com.cizuss.asynclol.util.EntityDeserializer;
import com.twitter.util.Future;

public class MatchAPI implements EntityDeserializer {
    private HttpClient httpClient;

    public MatchAPI(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Future<MatchDTO> getMatchByMatchId(String matchId) {
        Future<String> jsonF = httpClient.doGet("/lol/match/v4/matches/" + matchId);
        return deserializeFromFuture(jsonF, MatchDTO.class);
    }

    public Future<MatchlistDTO> getMatchlistByEncryptedAccountId(String encryptedAccountId) {
        Future<String> jsonF = httpClient.doGet("/lol/match/v4/matchlists/by-account/" + encryptedAccountId);
        return deserializeFromFuture(jsonF, MatchlistDTO.class);
    }
}
