package donga.carbon;

import java.util.HashMap;

import donga.domain.CarbonInfo;

public class CarbonMessage {
	
	
	private HashMap<String, CarbonInfo> areaList;
	private HashMap<String, CarbonInfo> equipmentList;
	private int totalCarvonValue;
	public int getTotalCarvonValue() {
		return totalCarvonValue;
	}
	public void setTotalCarvonValue(int totalCarvonValue) {
		this.totalCarvonValue = totalCarvonValue;
	}
	public CarbonMessage() {
		equipmentList = new HashMap<String, CarbonInfo>();
		areaList = new HashMap<String, CarbonInfo>();
	}
	public void insertEquipmentCarbonValue(String equipmentID, int value)
	{
		
		
		if(equipmentList.containsKey(equipmentID))
		{
			CarbonInfo info=equipmentList.get(equipmentID);
			info.setCarbon_value(value);
		}
		else
		{
			
			equipmentList.put(equipmentID, new CarbonInfo(equipmentID,value));
		}			
	}
	
	

	CarbonInfo carbonInfo;
	
	
	
	
	public void setCarbonInfo(CarbonInfo carbonInfo) {
		this.carbonInfo = carbonInfo;
	}
	public CarbonInfo getCarbonInfo() {
		
		return carbonInfo;		
	}
	/**
	 * @설명 영역별 탄소 정보 추가
	 * @param areaID
	 * @param value
	 */
	public void insertAreaCarbonValue(String id, int value) {
		if(areaList.containsKey(id))
		{
			CarbonInfo info=areaList.get(id);
			info.setCarbon_value(value);
		}
		else
		{
			
			areaList.put(id, new CarbonInfo(id,value));
		}
	}
	public CarbonInfo searchEquipmentCarbonInfo(String id)
	{
		return equipmentList.get(id);
	}
	public CarbonInfo searchAreaCarbonInfo(String id)
	{
		return areaList.get(id);
	}
}
