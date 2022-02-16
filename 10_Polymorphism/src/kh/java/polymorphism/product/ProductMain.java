package kh.java.polymorphism.product;

public class ProductMain {
	public static void main(String[] args) {
		ProductMain main = new ProductMain();
		Product[] products = main.test1(); // Product[3] Desktop, SmartPhone, Tv

//		for (Product product : products)
//			main.test2(product); // 제품별 정보출력

		for (Product product : products)
			main.test3(product); // 제품별 정보출력 동적바인딩

	}

	// 동적바인딩
	/**
	 * 동적바인딩 적용
	 * 
	 * 상속관계, 메소드Override, 다형성
	 */
	public void test3(Product product) {
		System.out.println(product.getProductInfo());
	}

	public void test2(Product product) {
		if (product instanceof Desktop)
			System.out.println(((Desktop) product).getDesktopInfo());
		else if (product instanceof SmartPhone)
			System.out.println(((SmartPhone) product).getSmartPhoneInfo());
		else if (product instanceof Tv)
			System.out.println(((Tv) product).getTvInfo());
	}

	public Product[] test1() {
		Product[] pd = new Product[3];

		pd[0] = new Desktop("삼성", "ss-1234567", "울트라데스크탑", 1_000_000, "windows11", "커브드모니터", "기계식키보드", "버티컬마우스");
		pd[1] = new SmartPhone("애플", "app-2483547", "iPhone13-Pro", 1_300_000, "ios15", "kt");
		pd[2] = new Tv("Lg", "lg-3351831", "QLED TV", 3_000_000, "UHD", 80);

		return pd;
	}

}
