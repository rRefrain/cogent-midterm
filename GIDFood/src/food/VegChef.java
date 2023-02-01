package food;

/**
 * Main class for Mid Term Project
 * 
 * @author michaelmiranda
 * @date Feb 1 2023
 */
public class VegChef extends Chef {

	public VegChef(Menu menu) {
		super(menu);
	}
	
	@Deprecated
	public void vegSection(Order order) {
		//Non Implement Method
	}
	
	public void vegSection(int[] item) {
		System.out.println("Vegen Chef is Preparing: ");
		prepareOrder(item);
	}

	
}
