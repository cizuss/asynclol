package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

@Data
public class MatchEventDTO {
    private String eventType;
    private String towerType;
    private int teamId;
    private String ascendedType;
    private int killerId;
    private String levelUpType;
    private String pointCaptured;
    private List<Integer> assistingParticipantIds;
    private String wardType;
    private String monsterType;
    private String type;
    private int skillSlot;
    private int victimId;
    private long timestamp;
    private int afterId;
    private String monsterSubType;
    private String laneType;
    private int itemId;
    private int participantId;
    private String buildingType;
    private int creatorId;
    private MatchPositionDTO position;
    private int beforeId;
}