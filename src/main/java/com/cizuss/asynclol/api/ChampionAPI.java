package com.cizuss.asynclol.api;

import com.cizuss.asynclol.HttpClient;
import com.cizuss.asynclol.dto.ChampionInfoDTO;
import com.cizuss.asynclol.util.EntityDeserializer;
import com.twitter.util.Future;

public class ChampionAPI implements EntityDeserializer {
    private HttpClient httpClient;

    public ChampionAPI(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Future<ChampionInfoDTO> getChampionRotation() {
        Future<String> jsonF = httpClient.doGet("/lol/platform/v3/champion-rotations");
        return deserializeFromFuture(jsonF, ChampionInfoDTO.class);
    }
}
