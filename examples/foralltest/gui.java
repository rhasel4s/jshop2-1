import JSHOP2.JSHOP2;
import JSHOP2.JSHOP2GUI;

public class gui{
	public static void main(String[] args) {
		JSHOP2 jshop2 = new JSHOP2();
		JSHOP2GUI jshop2Gui = new JSHOP2GUI();
		
		jshop2.registerPlanObserver(jshop2Gui);
		
		System.out.println(problem.getPlans(jshop2));
		
		jshop2Gui.run();
	} 
}
