package com.cizuss.asynclol.api;

import com.cizuss.asynclol.HttpClient;
import com.cizuss.asynclol.dto.ChampionMasteryDTO;
import com.cizuss.asynclol.util.EntityDeserializer;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.twitter.util.Future;

import java.util.List;

public class ChampionMasteryAPI implements EntityDeserializer {
    private HttpClient httpClient;

    public ChampionMasteryAPI(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Future<List<ChampionMasteryDTO>> getAllChampionMasteries(String summonerId) {
        Future<String> jsonF = httpClient.doGet("/lol/champion-mastery/v4/champion-masteries/by-summoner/" + summonerId);
        return jsonF.map(j -> new Gson().fromJson(j, new TypeToken<List<ChampionMasteryDTO>>(){}.getType()));
    }

    public Future<ChampionMasteryDTO> getChampionMasteryByPlayerIdAndChampionId(String summonerId, int championId) {
        Future<String> jsonF = httpClient.doGet("/lol/champion-mastery/v4/champion-masteries/by-summoner/" + summonerId + "/by-champion/" + championId);
        return deserializeFromFuture(jsonF, ChampionMasteryDTO.class);
    }

    public Future<Integer> getTotalMasteryScoreBySummonerId(String summonerId) {
        Future<String> jsonF = httpClient.doGet("/lol/champion-mastery/v4/scores/by-summoner/" + summonerId);
        return deserializeFromFuture(jsonF, Integer.class);
    }
}
