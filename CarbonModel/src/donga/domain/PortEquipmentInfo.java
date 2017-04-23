package donga.domain;

/**
 * @항구장비
 * @author archehyun
 *
 */
public class PortEquipmentInfo extends PortInfo{
	private String equipment_type_name;
	private String equipment_code;// 장비 코드
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
	private String equipment_name;// 장비 이름
	private int equipment_count;
	private float carbon_value;
	private String area_type;
	

	public String getEquipment_type_name() {
		return equipment_type_name;
	}
	public void setEquipment_type_name(String equipment_type_name) {
		this.equipment_type_name = equipment_type_name;
	}
	public int getEquipment_count() {
		return equipment_count;
	}
	public void setEquipment_count(int equipment_count) {
		this.equipment_count = equipment_count;
	}
	public float getCarbon_value() {
		return carbon_value;
	}
	public void setCarbon_value(float carbon_value) {
		this.carbon_value = carbon_value;
	}
	public String getArea_type() {
		return area_type;
	}
	public void setArea_type(String area_type) {
		this.area_type = area_type;
	}


}
