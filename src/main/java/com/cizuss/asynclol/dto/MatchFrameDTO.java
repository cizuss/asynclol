package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MatchFrameDTO {
    private long timestamp;
    private Map<String, MatchParticipantFrameDTO> participantFrames;
    private List<MatchEventDTO> events;
}
