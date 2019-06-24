package com.cizuss.asynclol;

import com.cizuss.asynclol.api.*;
import com.cizuss.asynclol.dto.*;
import com.cizuss.asynclol.enums.APIHost;
import com.twitter.util.Future;

import java.util.List;

public class Client {
    protected SummonerAPI summonerAPI;
    protected MatchAPI matchAPI;
    protected LeagueAPI leagueAPI;
    protected ChampionAPI championAPI;
    protected ChampionMasteryAPI championMasteryAPI;
    protected SpectatorAPI spectatorAPI;

    public Client(APIHost host, String apiKey) {
        HttpClient httpClient = new HttpClient(host, apiKey);
        this.summonerAPI = new SummonerAPI(httpClient);
        this.matchAPI = new MatchAPI(httpClient);
        this.leagueAPI = new LeagueAPI(httpClient);
        this.championAPI = new ChampionAPI(httpClient);
        this.championMasteryAPI = new ChampionMasteryAPI(httpClient);
        this.spectatorAPI = new SpectatorAPI(httpClient);
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

    public Future<MatchTimelineDTO> getMatchTimelineByMatchId(String matchId) {
        return matchAPI.getMatchTimelineByMatchId(matchId);
    }

    public Future<List<Long>> getMatchIdsByTournamentCode(String tournamentCode) {
        return matchAPI.getMatchIdsByTournamentCode(tournamentCode);
    }

    public Future<MatchDTO> getMatchByMatchIdAndTournamentCode(String matchId, String tournamentCode) {
        return matchAPI.getMatchByMatchIdAndTournamentCode(matchId, tournamentCode);
    }

    public Future<LeagueListDTO> getChallengerLeaguesByQueue(String queue) {
        return leagueAPI.getChallengerLeagueByQueue(queue);
    }

    public Future<List<LeagueEntryDTO>> getLeagueEntriesBySummonerName(String summonerName) {
        return getSummonerByName(summonerName).flatMap(s -> leagueAPI.getLeagueEntriesBySummonerId(s.getId()));
    }

    public Future<List<LeagueEntryDTO>> getAllLeagueEntries(String queue, String tier, String division) {
        return leagueAPI.getAllLeagueEntries(queue, tier, division);
    }

    public Future<LeagueListDTO> getGrandmasterLeagueByQueue(String queue) {
        return leagueAPI.getGrandmasterLeagueByQueue(queue);
    }

    public Future<LeagueListDTO> getLeagueById(String id) {
        return leagueAPI.getLeagueById(id);
    }

    public Future<LeagueListDTO> getMasterLeagueByQueue(String queue) {
        return leagueAPI.getMasterLeagueByQueue(queue);
    }

    public Future<ChampionInfoDTO> getChampionRotation() {
        return championAPI.getChampionRotation();
    }

    public Future<List<ChampionMasteryDTO>> getAllChampionMasteries(String summonerName) {
        return getSummonerByName(summonerName).flatMap(s -> championMasteryAPI.getAllChampionMasteries(s.getId()));
    }

    public Future<ChampionMasteryDTO> getChampionMasteryBySummonerNameAndChampionId(String summonerName, int championId) {
        return getSummonerByName(summonerName).flatMap(s -> championMasteryAPI.getChampionMasteryByPlayerIdAndChampionId(s.getId(), championId));
    }

    public Future<Integer> getTotalMasteryScoreBySummonerName(String summonerName) {
        return getSummonerByName(summonerName).flatMap(s -> championMasteryAPI.getTotalMasteryScoreBySummonerId(s.getId()));
    }

    public Future<CurrentGameInfoDTO> getCurrentGameInformationBySummonerName(String summonerName) {
        return getSummonerByName(summonerName).flatMap(s -> spectatorAPI.getGameInformationBySummonerId(s.getId()));
    }

    public Future<FeaturedGamesDTO> getListOfFeaturedGames() {
        return spectatorAPI.getListOfFeaturedGames();
    }
}
