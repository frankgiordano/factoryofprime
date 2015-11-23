import java.util.ArrayList;
import java.util.List;

import junit.framework.*;

public class TestPrime extends TestCase {

	 public void testPrimeFactor() {
		 	//  13195 are 5, 7, 13 and 29.
		 	Long num = 13195L;
		 	List<Long> total = new ArrayList<Long>();
		 	total.add(5L);
		 	total.add(7L);
		 	total.add(13L);
		 	total.add(29L);
		 	
			PrimeFactor primeFactor = new PrimeFactor(num);				  
		 
		  	assertEquals(primeFactor.getFactors(), total);
		  }
	
	
}
