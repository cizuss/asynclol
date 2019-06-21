package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

@Data
public class ParticipantDTO {
    private ParticipantStatsDTO stats;
    private int participantId;
    private List<RuneDTO> runes;
    private ParticipantTimelineDTO timeline;
    private int teamId;
    private int spell2Id;
    private List<MasteryDTO> masteries;
    private String highestAchievedSeasonTier;
    private int spell1Id;
    private int championId;
}
