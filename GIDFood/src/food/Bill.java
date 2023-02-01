package food;

/**
 * Main class for Mid Term Project
 * 
 * @author michaelmiranda
 * @date Feb 1 2023
 */
public class Bill {
	Order order;
	int bill = 0;
	int count;
	static int TotalBill = 0;
	Menu menu;
	int[] menuBill;
	
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static int getTotalBill() {
		return TotalBill;
	}
	
	public Bill(Order order, Menu menu, int[] menuBill) {
		super();
		this.order = order;
		this.menu = menu;
		this.menuBill = menuBill;
		TotalBill += 1;
		for (int [] item: order.getItems()) {
			this.bill += menuBill[item[0]] * item[1];
			this.count += item[1];
		}
	}
	
	public void printBill() {
		System.out.println(generateBill());
	}
	
	public String generateBill() {
		StringBuilder str = new StringBuilder("\n--------------\nBill # " + TotalBill);
		for(int i = 0; i < order.getItems().length; i ++) {
			str.append("\n");
			str.append(menu.getList()[order.getItems()[i][0]]);
			str.append(" x ");
			str.append(order.getItems()[i][1]);
			str.append(" * ");
			str.append(menuBill[i]);
			str.append(" = ");
			str.append((menuBill[i] * order.getItems()[i][1]));
		}
		str.append("\nTotal Count:\t");
		str.append(count);
		str.append("\nTotal Bill:\t");
		str.append(bill);
		
		return str.toString();
	}
}
