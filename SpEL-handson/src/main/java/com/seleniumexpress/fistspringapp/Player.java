package com.seleniumexpress.fistspringapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
	
	@Value("#{'abhilash'.toUpperCase}")
	private String playerName;
	
	@Value("40")
	private String playerAge;
	
	@Value("#{@country.countryName}")
	private String playerCountryName;
	
	@Value("#{${player.state}.toUpperCase()}")
	private String state;
	
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(String playerAge) {
		this.playerAge = playerAge;
	}
	public String getPlayerCountryName() {
		return playerCountryName;
	}
	public void setPlayerCountryName(String playerCountryName) {
		this.playerCountryName = playerCountryName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
