package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

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
