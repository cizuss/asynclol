package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

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
