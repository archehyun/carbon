package donga.carbon;

public abstract class CarbonClient implements IFCarbonMonitor{

	private String clientID;
	
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public void startSimulation()
	{
		
	}
	public void endSimulation()
	{
		
	}
	public abstract void getServerInfo(SimulationInfo info);
	
	private int areaID; // 지역 아이디
	
	private String areaName; // 지역 이름
	
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getAreaID() {
		return areaID;
	}

	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}

	public CarbonClient(String clientID) {
		this.clientID = clientID;
	}

}
