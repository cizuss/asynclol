package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

@Data
public class MatchlistDTO {
    private List<MatchReferenceDTO> matches;
    private int totalGames;
    private int startIndex;
    private int endIndex;
}
