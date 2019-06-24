package com.cizuss.asynclol.api;

import com.cizuss.asynclol.HttpClient;
import com.cizuss.asynclol.dto.CurrentGameInfoDTO;
import com.cizuss.asynclol.dto.FeaturedGamesDTO;
import com.cizuss.asynclol.util.EntityDeserializer;
import com.twitter.util.Future;

public class SpectatorAPI implements EntityDeserializer {
    private HttpClient httpClient;

    public SpectatorAPI(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public Future<CurrentGameInfoDTO> getGameInformationBySummonerId(String summonerId) {
        Future<String> jsonF = httpClient.doGet("/lol/spectator/v4/active-games/by-summoner/" + summonerId);
        return deserializeFromFuture(jsonF, CurrentGameInfoDTO.class);
    }

    public Future<FeaturedGamesDTO> getListOfFeaturedGames() {
        Future<String> jsonF = httpClient.doGet("/lol/spectator/v4/featured-games");
        return deserializeFromFuture(jsonF, FeaturedGamesDTO.class);
    }
}
