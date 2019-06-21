package com.cizuss.asynclol.api;

import com.cizuss.asynclol.HttpClient;
import com.cizuss.asynclol.dto.MatchDTO;
import com.cizuss.asynclol.dto.MatchTimelineDTO;
import com.cizuss.asynclol.dto.MatchlistDTO;
import com.cizuss.asynclol.util.EntityDeserializer;
import com.twitter.util.Future;

import java.util.List;

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

    public Future<MatchTimelineDTO> getMatchTimelineByMatchId(String matchId) {
        Future<String> jsonF = httpClient.doGet("/lol/match/v4/timelines/by-match/" + matchId);
        return deserializeFromFuture(jsonF, MatchTimelineDTO.class);
    }

    public Future<List<Long>> getMatchIdsByTournamentCode(String tournamentCode) {
        Future<String> jsonF = httpClient.doGet("/lol/match/v4/matches/by-tournament-code/" + tournamentCode + "/ids");
        return deserializeFromFutureToList(jsonF);
    }

    public Future<MatchDTO> getMatchByMatchIdAndTournamentCode(String matchId, String tournamentCode) {
        Future<String> jsonF = httpClient.doGet("/lol/match/v4/matches/" + matchId + "/by-tournament-code/" + tournamentCode);
        return deserializeFromFuture(jsonF, MatchDTO.class);
    }
}
