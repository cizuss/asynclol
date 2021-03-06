package com.cizuss.asynclol.dto;


import lombok.Data;

@Data
public class SummonerDTO {
    private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private long revisionDate;
    private String id;
    private String accountId;
}
