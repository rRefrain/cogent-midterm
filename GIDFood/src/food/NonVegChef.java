package food;

/**
 * Main class for Mid Term Project
 * 
 * @author michaelmiranda
 * @date Feb 1 2023
 */
public class NonVegChef  extends Chef{

	public NonVegChef(Menu menu) {
		super(menu);
	}
	
	@Deprecated
	public void nonVegSection(Order order) {
		//non-implemented method
	}
	
	public void nonVegSection(int[] item) {
		System.out.println("Non Vegen Chef is Preparing: ");
		prepareOrder(item);
	}	
}
