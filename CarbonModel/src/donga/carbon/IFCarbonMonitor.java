package donga.carbon;

/**
 * @author archehyun
 *
 */
public interface IFCarbonMonitor {
	public void handleMessage(CarbonMessageBundle bundle);
	public void handleAreaCarbonMessage(CarbonMessageBundle bundle);
	public void handleEquipmentCarbonMessage(CarbonMessageBundle bundle);
	public String getMonitorID();
}
