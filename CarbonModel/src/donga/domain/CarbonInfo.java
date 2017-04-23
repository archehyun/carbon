package donga.domain;

import java.util.Date;

public class CarbonInfo {
	
	
	private int value_id;
	public int getValue_id() {
		return value_id;
	}
	public void setValue_id(int value_id) {
		this.value_id = value_id;
	}


	private String energy_name;// 에너지이름
	private String energy_code;// 에너지 코드
	private String energy_unit;// 
	private float conversion_factor;//
	private float kg_factor;//
	private float ton_factor;//
	public String getEnergy_name() {
		return energy_name;
	}
	public void setEnergy_name(String energy_name) {
		this.energy_name = energy_name;
	}
	public String getEnergy_code() {
		return energy_code;
	}
	public void setEnergy_code(String energy_code) {
		this.energy_code = energy_code;
	}
	public String getEnergy_unit() {
		return energy_unit;
	}
	public void setEnergy_unit(String energy_unit) {
		this.energy_unit = energy_unit;
	}
	public float getConversion_factor() {
		return conversion_factor;
	}
	public void setConversion_factor(float conversion_factor) {
		this.conversion_factor = conversion_factor;
	}
	public float getKg_factor() {
		return kg_factor;
	}
	public void setKg_factor(float kg_factor) {
		this.kg_factor = kg_factor;
	}
	public float getTon_factor() {
		return ton_factor;
	}
	public void setTon_factor(float ton_factor) {
		this.ton_factor = ton_factor;
	}
	
	
	private String id;// 아이디
	public CarbonInfo(String equipmentID, int value) {
		this.id =equipmentID;
		this.carbon_value = value;
	}
	public CarbonInfo() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	private String areaName;// 지역 이름
	private int area_id;// 지역 아이디
	private int carbon_value;// 배출값
	private Date updateTime;
	private Date inputDate;// 입력 시간
	
	public int getCarbon_value() {
		return carbon_value;
	}
	public void setCarbon_value(int carbon_value) {
		this.carbon_value = carbon_value;
	}
	
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	private String equipment_code;// 장비 아이디
	
	public String getEquipment_id() {
		return equipment_code;
	}
	public void setEquipment_code(String equipment_code) {
		this.equipment_code = equipment_code;
	}	
	public Date getInputDate() {
		return inputDate;
	}
	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public int getArea_id() {
		return area_id;
	}
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}
	

}
