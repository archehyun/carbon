package donga.domain;

/**
 * @설명 항구 정보
 * @author archehyun
 *
 */
public class PortInfo {
	private String port_code;
	private String port_name;
	private int port_type;
	private int port_berth;
	public String getPort_code() {
		return port_code;
	}
	public void setPort_code(String port_code) {
		this.port_code = port_code;
	}
	public String getPort_name() {
		return port_name;
	}
	public void setPort_name(String port_name) {
		this.port_name = port_name;
	}
	public int getPort_type() {
		return port_type;
	}
	public void setPort_type(int port_type) {
		this.port_type = port_type;
	}
	public int getPort_berth() {
		return port_berth;
	}
	public void setPort_berth(int port_berth) {
		this.port_berth = port_berth;
	}
	public String toString()
	{
		return port_name;
	}

}
