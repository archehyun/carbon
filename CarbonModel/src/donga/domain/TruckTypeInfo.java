package donga.domain;

public class TruckTypeInfo {
	
	private String truck_type_code;
	private String truck_type_name;
	private String energy_code;
	
	private float move_consumption;
	private float wait_consumption;
	private float move_time;
	private float wait_time;
	
	private String energy_name;
	private String energy_unit;
	private float conversion_factor;
	private float kg_factor;
	private float ton_factor;
	


	public String getEnergy_code() {
		return energy_code;
	}
	public void setEnergy_code(String energy_code) {
		this.energy_code = energy_code;
	}

	public String getEnergy_name() {
		return energy_name;
	}
	public void setEnergy_name(String energy_name) {
		this.energy_name = energy_name;
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
	public String getTruck_type_code() {
		return truck_type_code;
	}
	public void setTruck_type_code(String truck_type_code) {
		this.truck_type_code = truck_type_code;
	}
	public String getTruck_type_name() {
		return truck_type_name;
	}
	public void setTruck_type_name(String truck_type_name) {
		this.truck_type_name = truck_type_name;
	}
	public float getMove_consumption() {
		return move_consumption;
	}
	public void setMove_consumption(float move_consumption) {
		this.move_consumption = move_consumption;
	}
	public float getWait_consumption() {
		return wait_consumption;
	}
	public void setWait_consumption(float wait_consumption) {
		this.wait_consumption = wait_consumption;
	}
	public float getMove_time() {
		return move_time;
	}
	public void setMove_time(float move_time) {
		this.move_time = move_time;
	}
	public float getWait_time() {
		return wait_time;
	}
	public void setWait_time(float wait_time) {
		this.wait_time = wait_time;
	}


}
