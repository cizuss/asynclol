package com.cizuss.asynclol;

import com.cizuss.asynclol.api.MatchAPI;
import com.cizuss.asynclol.api.SummonerAPI;
import com.cizuss.asynclol.dto.MatchDTO;
import com.cizuss.asynclol.dto.MatchlistDTO;
import com.cizuss.asynclol.dto.SummonerDTO;
import com.twitter.util.Future;

public class Client {
    protected SummonerAPI summonerAPI;
    protected MatchAPI matchAPI;

    public Client(String host, String apiKey) {
        HttpClient httpClient = new HttpClient(host, apiKey);
        this.summonerAPI = new SummonerAPI(httpClient);
        this.matchAPI = new MatchAPI(httpClient);
    }

    public Future<SummonerDTO> getSummonerByName(String name) {
        return summonerAPI.getSummonerByName(name);
    }

    public Future<SummonerDTO> getSummonerByEncryptedAccountId(String encryptedAccountId) {
        return summonerAPI.getSummonerByEncryptedAccountId(encryptedAccountId);
    }

    public Future<SummonerDTO> getSummonerByEncryptedPUUID(String encryptedPUUID) {
        return summonerAPI.getSummonerByEncryptedPUUID(encryptedPUUID);
    }

    public Future<SummonerDTO> getSummonerByEncryptedSummonerId(String encryptedSummonerId) {
        return summonerAPI.getSummonerByEncryptedSummonerId(encryptedSummonerId);
    }

    public Future<MatchDTO> getMatchByMatchId(String matchId) {
        return matchAPI.getMatchByMatchId(matchId);
    }

    public Future<MatchlistDTO> getMatchlistBySummonerName(String summonerName) {
        return getSummonerByName(summonerName).flatMap(s -> matchAPI.getMatchlistByEncryptedAccountId(s.getAccountId()));
    }
}
