import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    
    static final long PRIMERANGE = 100000L;
    private long primeFactor; 
    private PrimeArray primeArray;
    private List<Long> factors = new ArrayList<Long>();

    PrimeFactor(long num) {
        primeArray = new PrimeArray(PRIMERANGE);
        generatePrimeFactor(num);
    }

    private void generatePrimeFactor(long num) {
        
        long leastprimeFactor = leastPrimeFactor(num);
        long current = num / leastprimeFactor;
        factors.add(leastprimeFactor);
        
        while (true) {
            
            if (!PrimeArray.isPrime(current)) {
                leastprimeFactor = leastPrimeFactor(current);
                factors.add(leastprimeFactor);
                current = current / leastprimeFactor;
            }
            else 
            {
                factors.add(current);
                break;
            }
        }
        
        Long j = 1L;
        
        // multiply all prime factors in the factors list
        for (Long element: factors) {
            j *= element;
        }
        
        primeFactor = j;
    }
    
    private long leastPrimeFactor(long num) {
        
        for (Long element: primeArray.getPrimeArrayNums()) {
            if (num % element == 0) {	
                return element;
            }
        }
            
        return 0;
    }
    
    public List<Long> getFactors() {
        return factors;
    }

    public long getPrimeFactor() {
        return primeFactor;
    }
    
}
