package com.cizuss.asynclol.dto;

import lombok.Data;

@Data
public class MatchReferenceDTO {
    private String lane;
    private long gameId;
    private int champion;
    private String platformId;
    private int season;
    private int queue;
    private String role;
    private long timestamp;
}
