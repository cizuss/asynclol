package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

/*
gameId	long	The ID of the game
gameStartTime	long	The game start time represented in epoch milliseconds
platformId	string	The ID of the platform on which the game is being played
gameMode	string	The game mode
mapId	long	The ID of the map
gameType	string	The game type
bannedChampions	List[BannedChampion]	Banned champion information
observers	Observer	The observer information
participants	List[CurrentGameParticipant]	The participant information
gameLength	long	The amount of time in seconds that has passed since the game started
gameQueueConfigId	long	The queue type (queue types are documented on the Game Constants page)
 */

@Data
public class CurrentGameInfoDTO {
    private long gameId;
    private long gameStartTime;
    private String platformId;
    private String gameMode;
    private long mapId;
    private String gameType;
    private List<BannedChampionDTO> bannedChampions;
    private ObserverDTO observers;
    private List<CurrentGameParticipantDTO> participants;
    private long gameLength;
    private long gameQueueConfigId;
}
