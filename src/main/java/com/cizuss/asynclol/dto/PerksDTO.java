package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

/*
perkStyle	long	Primary runes path
perkIds	List[long]	IDs of the perks/runes assigned.
perkSubStyle	long
 */

@Data
public class PerksDTO {
    private long perkStyle;
    private List<Long> perkIds;
    private long perkSubStyle;
}
