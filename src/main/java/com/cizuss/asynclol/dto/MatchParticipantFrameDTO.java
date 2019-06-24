package com.cizuss.asynclol.dto;

import lombok.Data;

@Data
public class MatchParticipantFrameDTO {
    private int totalGold;
    private int teamScore;
    private int participantId;
    private int level;
    private int currentGold;
    private int minionsKilled;
    private int dominionScore;
    private MatchPositionDTO position;
    private int xp;
    private int jungleMinionsKilled;
}
