package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

/*
clientRefreshInterval	long	The suggested interval to wait before requesting FeaturedGames again
gameList	List[FeaturedGameInfo]
 */

@Data
public class FeaturedGamesDTO {
    private long clientRefreshInterval;
    private List<FeaturedGameInfoDTO> gameList;
}
