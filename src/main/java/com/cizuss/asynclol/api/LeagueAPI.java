package com.cizuss.asynclol.api;

import com.cizuss.asynclol.HttpClient;
import com.cizuss.asynclol.dto.LeagueEntryDTO;
import com.cizuss.asynclol.dto.LeagueListDTO;
import com.cizuss.asynclol.util.EntityDeserializer;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.twitter.util.Future;

import java.util.List;

public class LeagueAPI implements EntityDeserializer {
    private HttpClient httpClient;

    public LeagueAPI(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Future<LeagueListDTO> getChallengerLeagueByQueue(String queue) {
        Future<String> jsonF = httpClient.doGet("/lol/league/v4/challengerleagues/by-queue/" + queue);
        return deserializeFromFuture(jsonF, LeagueListDTO.class);
    }

    public Future<List<LeagueEntryDTO>> getLeagueEntriesBySummonerId(String summonerId) {
        Future<String> jsonF = httpClient.doGet("/lol/league/v4/entries/by-summoner/" + summonerId);
        return jsonF.map(json -> new Gson().fromJson(json, new TypeToken<List<LeagueEntryDTO>>(){}.getType()));
    }

    public Future<List<LeagueEntryDTO>> getAllLeagueEntries(String queue, String tier, String division) {
        Future<String> jsonF = httpClient.doGet("/lol/league/v4/entries/" + queue + "/" + tier + "/" + division);
        return jsonF.map(json -> new Gson().fromJson(json, new TypeToken<List<LeagueEntryDTO>>(){}.getType()));
    }

    public Future<LeagueListDTO> getGrandmasterLeagueByQueue(String queue) {
        Future<String> jsonF = httpClient.doGet("/lol/league/v4/grandmasterleagues/by-queue/" + queue);
        return deserializeFromFuture(jsonF, LeagueListDTO.class);
    }

    public Future<LeagueListDTO> getLeagueById(String id) {
        Future<String> jsonF = httpClient.doGet("/lol/league/v4/leagues/" + id);
        return deserializeFromFuture(jsonF, LeagueListDTO.class);
    }

    public Future<LeagueListDTO> getMasterLeagueByQueue(String queue) {
        Future<String> jsonF = httpClient.doGet("/lol/league/v4/masterleagues/by-queue/" + queue);
        return deserializeFromFuture(jsonF, LeagueListDTO.class);
    }
}
