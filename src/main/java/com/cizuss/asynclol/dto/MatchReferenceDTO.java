package com.cizuss.asynclol.dto;

import lombok.Data;

/*
lane	string
gameId	long
champion	int
platformId	string
season	int
queue	int
role	string
timestamp	long
 */

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
