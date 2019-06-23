package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

/*
freeChampionIdsForNewPlayers	List[int]
freeChampionIds	List[int]
maxNewPlayerLevel	int
 */

@Data
public class ChampionInfoDTO {
    private List<Integer> freeChampionIdsForNewPlayers;
    private List<Integer> freeChampionIds;
    private int maxNewPlayerLevel;
}
