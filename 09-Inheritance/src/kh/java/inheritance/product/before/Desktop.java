package kh.java.inheritance.product.before;

public class Desktop {
	private String brand;
	private String code;
	private String name;
	private int price;

	private String os;

	private String monitor;
	private String keyboard;
	private String mouse;

	// source - Generate constructor form super class
	public Desktop() {

	}

	// source - Generate constructor using fields
	public Desktop(String brand, String code, String name, int price, String os, String moitor, String keyboard,
			String mouse) {
		super(); //생략가능
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.os = os;
		this.monitor = moitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	// source - Generate getters and stters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getMoitor() {
		return monitor;
	}

	public void setMoitor(String moitor) {
		this.monitor = moitor;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	
	
	// 필드정보 확인용
	public String getDesktopInfo() {
		return brand + ", " + code + ", " + name + ", " + price + ", "
				+ os + ", " + monitor + ", " + keyboard + ", " + mouse;
	}

}
