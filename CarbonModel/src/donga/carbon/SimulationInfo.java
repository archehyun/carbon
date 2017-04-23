package donga.carbon;

import java.awt.Point;

public class SimulationInfo {

	public String getIP() {
		// TODO Auto-generated method stub
		return "168.115.112.12";
	}

	public int getPort() {
		// TODO Auto-generated method stub
		return 10000;
	}

	public String getDB() {
		// TODO Auto-generated method stub
		return "ÀúÅº¼Ò";
	}
	public Point getNewPoint(int x1, int y1, int x2, int y2)
	{
		return new Point(x1,y2);
	}
	public static void main(String[] args) {
		SimulationInfo info = new SimulationInfo();
		System.out.println(info.getNewPoint(1,1, 2, 2));
		
				
	}



}
