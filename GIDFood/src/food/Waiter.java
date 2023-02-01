package food;

/**
 * @author michaelmiranda
 * @date Feb 1 2023
 */
public class Waiter {
	private Menu menu;
	private VegChef vChef;
	private NonVegChef chef;

	public Waiter(Menu menu, VegChef vChef, NonVegChef chef) {
		super();
		this.menu = menu;
		this.vChef = vChef;
		this.chef = chef;
	}

	void menu() {
		for(String item: menu.getList()) {
			System.out.println(item);
		}
	}

	void takeOrder(Customer customer) {
		System.out.println(customer.getCustomerName() + " is ordering!!!");
		menu();
		PlaceOrderToChef(customer.OrderingItems());
		customer.eat();
	}

	void PlaceOrderToChef(Order order) {
		for (int[] item : order.items) {
			if (!menu.getList()[item[0] - 1].startsWith("[veg]")) {
				vChef.vegSection(item);
			} else {
				chef.nonVegSection(item);
			}
		}
	}
}