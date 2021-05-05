package Entities;

import java.time.LocalDate;

public class Sale {
	private int id;
	private int memberId;
	private int gameId;
	private int campaignId;
	private LocalDate date;
	
	public Sale() {
		
	}

	public Sale(int id, int memberId, int gameId, int campaignId, LocalDate date) {
		this.id = id;
		this.memberId = memberId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
