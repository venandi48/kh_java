package kh.java.inheritance.product.after;

public class Desktop extends Product {

	private String os;

	private String monitor;
	private String keyboard;
	private String mouse;

	public Desktop() {
		super();
	}

	public Desktop(String brand, String code, String name, int price, String os, String monitor, String keyboard, String mouse) {
		
		// 1. setter 이용하여 private필드에 값대입
//		setBrand(brand);
//		setCode(code);
//		setName(name);
//		setPrice(price);
		
		// 2. 부모생성자 호출 : 생성자에 딱 한번, 맨 윗줄에서만 사용가능
		// this와 같이 사용불가. 생략해도 자동으로 super() 호출.
		super(brand, code, name, price);
		
		this.os = os;
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
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

	/**
	 * 
	 * brand, code, name, price는 상속받았어도 private필드라 직접접근 불가
	 * public method를 통해 접근할 수 있다.
	 */
	public String getDesktopInfo() {
		return getBrand() + ", " + getCode() + ", " + getName() + ", " + getPrice() + ", "
				+ os + ", " + monitor + ", " + keyboard + ", " + mouse;
	}
}
