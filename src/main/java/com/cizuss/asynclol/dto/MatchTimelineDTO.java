package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

@Data
public class MatchTimelineDTO {
    private List<MatchFrameDTO> frames;
    private long frameInterval;
}
