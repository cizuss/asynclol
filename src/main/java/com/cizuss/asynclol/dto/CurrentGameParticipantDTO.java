package com.cizuss.asynclol.dto;

import lombok.Data;

import java.util.List;

/*
profileIconId	long	The ID of the profile icon used by this participant
championId	long	The ID of the champion played by this participant
summonerName	string	The summoner name of this participant
gameCustomizationObjects	List[GameCustomizationObject]	List of Game Customizations
bot	boolean	Flag indicating whether or not this participant is a bot
perks	Perks	Perks/Runes Reforged Information
spell2Id	long	The ID of the second summoner spell used by this participant
teamId	long	The team ID of this participant, indicating the participant's team
spell1Id	long	The ID of the first summoner spell used by this participant
summonerId	string	The encrypted summoner ID of this participant
 */

@Data
public class CurrentGameParticipantDTO {
    private long profileIconId;
    private long championId;
    private String summonerName;
    private List<GameCustomizationObjectDTO> gameCustomizationObjects;
    private boolean bot;
    private PerksDTO perks;
    private long spell2Id;
    private long teamId;
    private long spell1Id;
    private String summonerId;
}
