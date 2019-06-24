package com.cizuss.asynclol.dto;

import lombok.Data;

@Data
public class BannedChampionDTO {
    private int pickTurn;
    private long championId;
    private long teamId;
}
