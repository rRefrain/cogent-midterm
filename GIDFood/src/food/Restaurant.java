package food;

import com.helper.CustomReader;

/**
 * Main class for Mid Term Project
 * 
 * @author michaelmiranda
 * @date Feb 1 2023
 */
public class Restaurant {
	public static void main(String[] args) {
		String[] menuSTR = new String[6];
		int[] menuBill = new int[6];
		menuSTR[0] = "[veg] 1. Vegan Ramen";
		menuBill[0] = 800;
		
		menuSTR[1] = "2. Shio Ramen";
		menuBill[1] = 890;
		
		menuSTR[2] = "[veg] 3. Sesame Salad";
		menuBill[2] = 740;
		
		menuSTR[3] = "4. Karaage";
		menuBill[3] = 530;
		
		menuSTR[4] = "[veg] 5. Sweet Potato";
		menuBill[5] = 300;
		
		menuSTR[5] = "6. Katsu";
		menuBill[5] = 550;
		
		Menu menu = new Menu(menuSTR);
		Customer customer01 = new Customer(CustomReader.read("Customer Name: "), 1);
		Waiter waiter01 = new Waiter(menu, new VegChef(menu), new NonVegChef(menu));
		
		waiter01.takeOrder(customer01);
		Bill bill = new Bill(customer01.getOrder(), menu, menuBill);
		bill.printBill();
	}
}