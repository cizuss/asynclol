package com.cizuss.asynclol.dto;

import lombok.Data;

/*
summonerName	string
hotStreak	boolean
miniSeries	MiniSeriesDTO
wins	int
veteran	boolean
losses	int
freshBlood	boolean
inactive	boolean
rank	string
summonerId	string	Player's summonerId (Encrypted)
leaguePoints	int
 */

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
