package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

/*
firstDragon	boolean	Flag indicating whether or not the team scored the first Dragon kill.
firstInhibitor	boolean	Flag indicating whether or not the team destroyed the first inhibitor.
bans	List[TeamBansDto]	If match queueId has a draft, contains banned champion data, otherwise empty.
baronKills	int	Number of times the team killed Baron.
firstRiftHerald	boolean	Flag indicating whether or not the team scored the first Rift Herald kill.
firstBaron	boolean	Flag indicating whether or not the team scored the first Baron kill.
riftHeraldKills	int	Number of times the team killed Rift Herald.
firstBlood	boolean	Flag indicating whether or not the team scored the first blood.
teamId	int	100 for blue side. 200 for red side.
firstTower	boolean	Flag indicating whether or not the team destroyed the first tower.
vilemawKills	int	Number of times the team killed Vilemaw.
inhibitorKills	int	Number of inhibitors the team destroyed.
towerKills	int	Number of towers the team destroyed.
dominionVictoryScore	int	For Dominion matches, specifies the points the team had at game end.
win	string	String indicating whether or not the team won. There are only two values visibile in public match history. (Legal values: Fail, Win)
dragonKills	int	Number of times the team killed Dragon.
 */

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
