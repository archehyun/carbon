package donga.domain;

public class EquipmentTypeInfo extends CarbonInfo{
	
	private String equipment_type_code;// 타입 코드
	
	private String equipment_type_name;// 타입 이름
		
	
	private float consumption;

	
	public String getEquipment_type_code() {
		return equipment_type_code;
	}
	public void setEquipment_type_code(String equipment_type_code) {
		this.equipment_type_code = equipment_type_code;
	}
	public String getEquipment_type_name() {
		return equipment_type_name;
	}
	public void setEquipment_type_name(String equipment_type_name) {
		this.equipment_type_name = equipment_type_name;
	}

	public float getConsumption() {
		return consumption;
	}
	public void setConsumption(float consumption) {
		this.consumption = consumption;
	}
	


}
