package donga.domain;

public class EquipmentInfo extends EquipmentTypeInfo{
	
	private String equipment_code;// 장비 코드
	private String equipment_name;// 장비 이름
	private String equipment_num;// 장비 번호
	private String equipment_model;// 연식
	public String getEquipment_model() {
		return equipment_model;
	}
	public void setEquipment_model(String equipment_model) {
		this.equipment_model = equipment_model;
	}
	public String getEquipment_code() {
		return equipment_code;
	}
	public void setEquipment_code(String equipment_code) {
		this.equipment_code = equipment_code;
	}
	public String getEquipment_name() {
		return equipment_name;
	}
	public void setEquipment_name(String equipment_name) {
		this.equipment_name = equipment_name;
	}
	public String getEquipment_num() {
		return equipment_num;
	}
	public void setEquipment_num(String equipment_num) {
		this.equipment_num = equipment_num;
	}

}
