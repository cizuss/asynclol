package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

@Data
public class FeaturedGamesDTO {
    private long clientRefreshInterval;
    private List<FeaturedGameInfoDTO> gameList;
}
