package donga.carbon;

import java.util.Iterator;
import java.util.Vector;

import donga.dao.ResultDAO;

/**
 * @author archehyun
 *
 */
public abstract class CarbonServer  {
	
	
	public SimulationInfo getSimulationInfo()
	{
		return new SimulationInfo();
	}
	
	protected ResultDAO resultDAO;
	protected Vector<IFCarbonMonitor> monitors;
	protected boolean flag;
	protected int Deleay=1000;
	protected CarbonMessageBundle bundle;
	
	public CarbonServer() {
		monitors = new Vector<IFCarbonMonitor>();
		resultDAO = new ResultDAO();
		
		bundle = new CarbonMessageBundle();
	}
	
	/**@설명 모니터 추가
	 * @param carbonMonitor
	 */
	public void addMonitor(IFCarbonMonitor carbonMonitor)
	{
		monitors.add(carbonMonitor);
	}
	/**
	 * @설명 모니터 조회
	 * @param monitorID
	 * @return
	 */
	public IFCarbonMonitor getMonitor(String monitorID)
	{
		for(int i=0;i<monitors.size();i++)
		{
			if(monitors.get(i).getMonitorID().equals(monitorID))
			{
				return monitors.get(i);
			}
		}
		return null;
	}
	/**
	 *@설명 메세지 전달 
	 */
	public void notifyMonitors()
	{
		Iterator<IFCarbonMonitor> iter = monitors.iterator();
		
		while(iter.hasNext())
		{
			iter.next().handleMessage(bundle);
		}		
	}

	private int value;
	
	protected Thread thread;

	
	/**
	 * @throws Exception 
	 * @설명 메세지 생성 추상 메소드
	 */
	protected abstract void updateCarbonInfo() throws Exception;
	
	public abstract void start();


}
