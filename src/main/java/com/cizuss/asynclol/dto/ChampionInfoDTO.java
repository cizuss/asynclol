package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;


@Data
public class ChampionInfoDTO {
    private List<Integer> freeChampionIdsForNewPlayers;
    private List<Integer> freeChampionIds;
    private int maxNewPlayerLevel;
}
