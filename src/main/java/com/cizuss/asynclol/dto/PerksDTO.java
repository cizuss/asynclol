package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

@Data
public class PerksDTO {
    private long perkStyle;
    private List<Long> perkIds;
    private long perkSubStyle;
}
