package kh.firstmini.vo;

import java.util.Objects;

public class Menu {
    private String storeID;
    private String menuName;
    private int price;
    
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public Menu(String storeID, String menuName, int price) {
        super();
        this.storeID = storeID;
        this.menuName = menuName;
        this.price = price;
    }
    
    public String getStoreID() {
        return storeID;
    }
    public String getMenuName() {
        return menuName;
    }
    public int getPrice() {
        return price;
    }
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Menu [storeID=" + storeID + ", menuName=" + menuName + ", price=" + price + "]";
    }
    
    
    public boolean equalsStoreID(Object o) {
    	Menu other = (Menu) o;
    	if (this.storeID.equals(other.storeID)) // 필드 비교
    		return true;
    	else
    		return false;
    }

}