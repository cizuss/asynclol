package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

/*
seasonId	int	Please refer to the Game Constants documentation.
queueId	int	Please refer to the Game Constants documentation.
gameId	long
participantIdentities	List[ParticipantIdentityDto]	Participant identity information.
gameVersion	string	The major.minor version typically indicates the patch the match was played on.
platformId	string	Platform where the match was played.
gameMode	string	Please refer to the Game Constants documentation.
mapId	int	Please refer to the Game Constants documentation.
gameType	string	Please refer to the Game Constants documentation.
teams	List[TeamStatsDto]	Team information.
participants	List[ParticipantDto]	Participant information.
gameDuration	long	Match duration in seconds.
gameCreation	long	Designates the timestamp when champion select ended and the loading screen appeared, NOT when the game timer was at 0:00.
 */

@Data
public class MatchDTO {
    private int seasonId;
    private int queueId;
    private long gameId;
    private List<ParticipantIdentityDTO> participantIdentities;
    private String gameVersion;
    private String platformId;
    private String gameMode;
    private int mapId;
    private String gameType;
    private List<TeamStatsDTO> teams;
    private List<ParticipantDTO> participants;
    private long gameDuration;
    private long gameCreation;
}
