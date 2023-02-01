package food;

import com.helper.CustomReader;

/**
 * Main class for Mid Term Project
 * 
 * @author michaelmiranda
 * @date Feb 1 2023
 */
public class Order {
	static int orderNum = 0;
	int items[][];
	int noOfItems;
	
	public Order() {
		this(CustomReader.readInt("Enter How Many Unique Items to Input:"));
	}
	
	public Order(int noOfItems) {
		this(CustomReader.readIntArray("Enter Food Number:",
				"Enter Quantity:", "", noOfItems), noOfItems);
	}

	public Order(int[][] items, int noOfItems) {
		super();
		this.items = items;
		this.noOfItems = noOfItems;
	}

	public static int getOrderNum() {
		return orderNum;
	}
	public static void setOrderNum(int orderNum) {
		Order.orderNum = orderNum;
	}
	public int[][] getItems() {
		return items;
	}
	public void setItems(int[][] items) {
		this.items = items;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}	
}
