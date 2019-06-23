package com.cizuss.asynclol.dto;

import lombok.Data;

/*
rogress	string
losses	int
target	int
wins	int
 */

@Data
public class MiniSeriesDTO {
    private String progress;
    private int losses;
    private int target;
    private int wins;
}
