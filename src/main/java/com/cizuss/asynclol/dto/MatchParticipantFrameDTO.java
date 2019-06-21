package com.cizuss.asynclol.dto;

/*
totalGold	int
teamScore	int
participantId	int
level	int
currentGold	int
minionsKilled	int
dominionScore	int
position	MatchPositionDto
xp	int
jungleMinionsKilled	int
 */

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
