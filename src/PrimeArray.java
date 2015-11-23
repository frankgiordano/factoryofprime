import java.util.ArrayList;
import java.util.List;

public class PrimeArray {
	
	private List<Long> primeArrayNums = new ArrayList<Long>();
	
	PrimeArray(long num) {
		
		generatePrimeArray(num);
		
	}
	
	private void generatePrimeArray(long num) {
		
		for (long i = 2; i <= num; i++) {
			
			if (isPrime(i)) {
				primeArrayNums.add(i);
			}
			
		}
		
	}
	
	public static boolean isPrime(long num) {
		
		long limit = (long) Math.sqrt(num);
		
		for (int i=2; i <= limit; i++) {
			
			if (num % i == 0) {
				return false;	
			}
			
		}
		
		return true;
		
	}

	public List<Long> getPrimeArrayNums() {
		return primeArrayNums;
	}

}
