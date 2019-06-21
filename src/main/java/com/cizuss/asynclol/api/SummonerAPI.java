package com.cizuss.asynclol.api;

import com.cizuss.asynclol.HttpClient;
import com.cizuss.asynclol.dto.SummonerDTO;
import com.cizuss.asynclol.util.EntityDeserializer;
import com.twitter.util.Future;

public class SummonerAPI implements EntityDeserializer {
    private HttpClient httpClient;

    public SummonerAPI(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Future<SummonerDTO> getSummonerByName(String name) {
        Future<String> jsonF = httpClient.doGet("/lol/summoner/v4/summoners/by-name/" + name);
        return deser(jsonF);
    }

    public Future<SummonerDTO> getSummonerByEncryptedAccountId(String encryptedAccountId) {
        Future<String> jsonF = httpClient.doGet("/lol/summoner/v4/summoners/by-account/" + encryptedAccountId);
        return deser(jsonF);
    }

    public Future<SummonerDTO> getSummonerByEncryptedPUUID(String encryptedPUUID) {
        Future<String> jsonF = httpClient.doGet("/lol/summoner/v4/summoners/by-puuid/" + encryptedPUUID);
        return deser(jsonF);
    }

    public Future<SummonerDTO> getSummonerByEncryptedSummonerId(String encryptedSummonerId) {
        Future<String> jsonF = httpClient.doGet("/lol/summoner/v4/summoners/" + encryptedSummonerId);
        return deser(jsonF);
    }

    private Future<SummonerDTO> deser(Future<String> jsonF) {
        return deserializeFromFuture(jsonF, SummonerDTO.class);
    }
}
