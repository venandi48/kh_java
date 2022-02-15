package kh.java.inheritance.product;

import kh.java.inheritance.product.parent.Tv;

public class ProductAfterMain {
	public static void main(String[] args) {
		Desktop desktop = new Desktop("삼성", "ss-1234567", "울트라데스크탑", 1_000_000, "windows11", "커브드모니터", "기계식키보드",
				"버티컬마우스");
		System.out.println(desktop.getDesktopInfo());
		
		SmartPhone smartPhone = new SmartPhone("애플", "app-2483547", "iPhone13-Pro", 1_300_000, "ios15", "kt");
		System.out.println(smartPhone.getSmartPhoneInfo());
		
		Tv tv = new Tv("Lg", "lg-3351831", "QLED TV", 3_000_000, "UHD", 80);
		System.out.println(tv.getTvInfo());
	}
}
