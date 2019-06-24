package com.cizuss.asynclol.dto;

import lombok.Data;

@Data
public class MiniSeriesDTO {
    private String progress;
    private int losses;
    private int target;
    private int wins;
}
