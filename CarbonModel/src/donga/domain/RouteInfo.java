package donga.domain;

public class RouteInfo {
	
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getAgvID() {
		return agvID;
	}
	public void setAgvID(int agvID) {
		this.agvID = agvID;
	}
	public int getStartX() {
		return startX;
	}
	public void setStartX(int startX) {
		this.startX = startX;
	}
	public int getStartY() {
		return startY;
	}
	public void setStartY(int startY) {
		this.startY = startY;
	}
	public int getEndX() {
		return endX;
	}
	public void setEndX(int endX) {
		this.endX = endX;
	}
	public int getEndY() {
		return endY;
	}
	public void setEndY(int endY) {
		this.endY = endY;
	}
	private int orderID;
	private int agvID;
	private int startX;
	private int startY;
	private int endX;
	private int endY;
	
	

}
