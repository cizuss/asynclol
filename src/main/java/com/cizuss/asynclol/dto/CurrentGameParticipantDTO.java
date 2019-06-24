package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

@Data
public class CurrentGameParticipantDTO {
    private long profileIconId;
    private long championId;
    private String summonerName;
    private List<GameCustomizationObjectDTO> gameCustomizationObjects;
    private boolean bot;
    private PerksDTO perks;
    private long spell2Id;
    private long teamId;
    private long spell1Id;
    private String summonerId;
}
