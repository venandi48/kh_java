package kh.java.polymorphism.product;

public class Tv extends Product {

	private String resolution; // 해상도 FHD/UHD
	private int size; // 인치 정보

	public Tv() {
		super();
	}

	public Tv(String brand, String code, String name, int price, String resolution, int size) {
		// 1. Product필드가 private인 경우
		super(brand, code, name, price);
		
		// 2. Product필드가 protected인 경우 패키지가 달라도 자식클래스에서 직접 접근할 수 있다.
//		this.brand = brand;
//		this.code = code;
//		this.name = name;
//		this.price = price;
		
		this.resolution = resolution;
		this.size = size;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getTvInfo() {
		return getProductInfo() + ", " + resolution + ", " + size;
	}

	@Override
	public String getProductInfo() {
		return super.getProductInfo() + ", " + resolution + ", " + size;
	}
}
