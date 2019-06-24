package com.cizuss.asynclol.dto;

import lombok.Data;

@Data
public class ChampionMasteryDTO {
    private boolean chestGranted;
    private int championLevel;
    private int championPoints;
    private long championId;
    private long championPointsUntilNextLevel;
    private long lastPlayTime;
    private int tokensEarned;
    private long championPointsSinceLastLevel;
    private String summonerId;
}
