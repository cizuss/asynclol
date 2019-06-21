package com.cizuss.asynclol.dto;

import lombok.Data;
import java.util.Map;

@Data
public class ParticipantTimelineDTO {
    private String lane;
    private int participantId;
    private Map<String, Double> csDiffPerMinDeltas;
    private Map<String, Double> goldPerMinDeltas;
    private Map<String, Double> xpDiffPerMinDeltas;
    private Map<String, Double> creepsPerMinDeltas;
    private Map<String, Double> xpPerMinDeltas;
    private String role;
    private Map<String, Double> damageTakenDiffPerMinDeltas;
    private Map<String, Double> damageTakenPerMinDeltas;
}
