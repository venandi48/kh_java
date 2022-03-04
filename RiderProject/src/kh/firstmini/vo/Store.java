package kh.firstmini.vo;

public class Store {
	private String storeID; // 매장고유번호
	private String storeName; // 매장명
	private String storeTel; // 전화번호
	private int riderTip; // 배달팁
	private int minOrderPrice; // 최소주문금액
	private String address; // 주소
	private String runTime; // 운영시간

	public Store() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Store(String storeID, String storeName, String storeTel, int riderTip, int minOrderPrice, String address,
			String runTime) {
		super();
		this.storeID = storeID;
		this.storeName = storeName;
		this.storeTel = storeTel;
		this.riderTip = riderTip;
		this.minOrderPrice = minOrderPrice;
		this.address = address;
		this.runTime = runTime;
	}

	public String getStoreID() {
		return storeID;
	}

	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreTel() {
		return storeTel;
	}

	public void setStoreTel(String storeTel) {
		this.storeTel = storeTel;
	}

	public int getRiderTip() {
		return riderTip;
	}

	public void setRiderTip(int riderTip) {
		this.riderTip = riderTip;
	}

	public int getMinOrderPrice() {
		return minOrderPrice;
	}

	public void setMinOrderPrice(int minOrderPrice) {
		this.minOrderPrice = minOrderPrice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRunTime() {
		return runTime;
	}

	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}

	@Override
	public String toString() {
		return "Store [storeID=" + storeID + ", storeName=" + storeName + ", storeTel=" + storeTel + ", riderTip="
				+ riderTip + ", minOrderPrice=" + minOrderPrice + ", address=" + address + ", runTime=" + runTime + "]";
	}

}
