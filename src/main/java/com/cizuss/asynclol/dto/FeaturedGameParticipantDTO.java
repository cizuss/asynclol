package com.cizuss.asynclol.dto;

import lombok.Data;

@Data
public class FeaturedGameParticipantDTO {
    private long profileIconId;
    private long championId;
    private String summonerName;
    private boolean bot;
    private long spell2Id;
    private long teamId;
    private long spell1Id;
}
