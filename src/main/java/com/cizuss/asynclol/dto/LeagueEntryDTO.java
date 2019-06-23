package com.cizuss.asynclol.dto;

import lombok.Data;

import java.io.Serializable;

/*
queueType	string
summonerName	string
hotStreak	boolean
miniSeries	MiniSeriesDTO
wins	int
veteran	boolean
losses	int
rank	string
leagueId	string
inactive	boolean
freshBlood	boolean
tier	string
summonerId	string	Player's summonerId (Encrypted)
leaguePoints	int
 */

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
