package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

/*
matches	List[MatchReferenceDto]
totalGames	int
startIndex	int
endIndex	int
 */

@Data
public class MatchlistDTO {
    private List<MatchReferenceDTO> matches;
    private int totalGames;
    private int startIndex;
    private int endIndex;
}
