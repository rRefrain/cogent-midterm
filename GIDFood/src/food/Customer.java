package food;

/**
 * @author michaelmiranda
 * @date Feb 1 2023
 */
public class Customer {
	private String customerName;
	private int customerTableNumber;
	private Order order = null;
	
	public Customer(String customerName, int customerTableNumber) {
		this.customerName = customerName;
		this.customerTableNumber = customerTableNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	Order OrderingItems() {
		this.order = new Order();
		return order;
	}
	
	Order getOrder() {
		return order;
	}
	
	void eat() {
		System.out.println("Table Number#" + 
				customerTableNumber + "\t customerName" + 
					"\tis eating!");
	}
}
