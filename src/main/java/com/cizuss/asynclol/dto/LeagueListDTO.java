package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

/*
leagueId	string
tier	string
entries	List[LeagueItemDTO]
queue	string
name	string
 */
@Data
public class LeagueListDTO {
    private String leagueId;
    private String tier;
    private List<LeagueItemDTO> entries;
    private String queue;
    private String name;
}
