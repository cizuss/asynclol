package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

@Data
public class FeaturedGameInfoDTO {
    private long gameId;
    private long gameStartTime;
    private String platformId;
    private String gameMode;
    private long mapId;
    private String gameType;
    private List<BannedChampionDTO> bannedChampions;
    private ObserverDTO observers;
    private List<FeaturedGameParticipantDTO> participants;
    private long gameLength;
    private long gameQueueConfigId;
}
