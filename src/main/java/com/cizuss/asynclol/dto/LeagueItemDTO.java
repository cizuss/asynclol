package com.cizuss.asynclol.dto;

import lombok.Data;

@Data
public class LeagueItemDTO {
    private String summonerName;
    private boolean hotStreak;
    private MiniSeriesDTO miniSeries;
    private int wins;
    private boolean veteran;
    private int losses;
    private boolean freshBlood;
    private boolean inactive;
    private String rank;
    private String summonerId;
    private int leaguePoints;
}
