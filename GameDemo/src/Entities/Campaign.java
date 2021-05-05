package Entities;

public class Campaign {
	private int id;
	private int gameId;
	private double discountPercent;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, int gameId, double discountPercent) {
		this.id = id;
		this.gameId = gameId;
		this.discountPercent = discountPercent;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getGameId() {
		return gameId;
	}
	
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	
	public double getDiscountPercent() {
		return discountPercent;
	}
	
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
}
