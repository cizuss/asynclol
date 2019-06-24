package com.cizuss.asynclol.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LeagueEntryDTO implements Serializable {
    private String queueType;
    private String summonerName;
    private boolean hotStreak;
    private MiniSeriesDTO miniSeries;
    private int wins;
    private boolean veteran;
    private int losses;
    private String rank;
    private String leagueId;
    private boolean inactive;
    private boolean freshBlood;
    private String tier;
    private String summonerId;
    private int leaguePoints;
}
