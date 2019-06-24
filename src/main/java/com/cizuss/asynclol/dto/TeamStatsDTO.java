package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

@Data
public class TeamStatsDTO {
    private boolean firstDragon;
    private boolean firstInhibitor;
    private List<TeamBansDTO> bans;
    private int baronKills;
    private boolean firstRiftHerald;
    private boolean firstBaron;
    private int riftHeraldKills;
    private boolean firstBlood;
    private int teamId;
    private boolean firstTower;
    private int vilemawKills;
    private int inhibitorKills;
    private int towerKills;
    private int dominionVictoryScore;
    private String win;
    private int dragonKills;
}
