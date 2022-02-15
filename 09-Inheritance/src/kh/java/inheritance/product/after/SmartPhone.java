package kh.java.inheritance.product.after;

public class SmartPhone extends Product {

	private String os;
	private String carrier; // 통신사

	public SmartPhone() {
		super();
	}

	// source - generate constructor using fields - super constructor to invoke 
	public SmartPhone(String brand, String code, String name, int price, String os, String carrier) {
		super(brand, code, name, price);
		this.os = os;
		this.carrier = carrier;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getSmartPhoneInfo() {
		return getProductInfo() + ", " + os + ", " + carrier;
	}
}
