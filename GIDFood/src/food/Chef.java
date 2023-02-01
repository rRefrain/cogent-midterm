package food;

/**
 * 
 * 
 * @author michaelmiranda
 * @date Feb 1 2023
 */
public abstract class Chef {
	private Menu menu;

	public Chef(Menu menu) {
		this.menu = menu;
	}
	
	@Deprecated
	void prepareOrder(Order order, String vegRnonVeg) {
		//Non Implemented Method
	}
	
	void prepareOrder(int[] item) {
		System.out.println("Making: " + item[1] + " servings of: " + menu.getList()[item[0]]);
		callWaiter();
	}	
	
	void callWaiter() {
		System.out.println("Dish Done, giving to Waiter");
	}
	@Deprecated
	void callWaiter(String vegRnonVeg) {
		//Non Implemented Method
	}
}
