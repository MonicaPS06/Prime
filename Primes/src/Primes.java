
public class Primes {
	    public static void main(String[] args) {
	        int nValues = 50;

	        for (int i = 2; i <= nValues; i++) 
	        {
	            boolean isPrime = true;
	            int sqrt = (int) Math.sqrt(i);
	            outerLoop:
	            for (int j = 2; j <= sqrt; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    continue outerLoop; // Continue to the next i
	                }
	            }

	            if (isPrime) {
	                System.out.println(i);
	            }
	        }
	    }
	}


