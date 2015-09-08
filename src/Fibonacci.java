
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t0 = System.currentTimeMillis(); // O(1)
		
		fibonacci(50000000);
		long t1 = System.currentTimeMillis(); // O(1)
		
		System.out.println(t1 - t0 + " ms");		
	}
	
	public static int fibonacci(int n)  {//O(n)
		
	    int fibNumbers = 0;//O(1)
	    int prevFib = 0;//O(1)
	    int currentFib = 1;//O(1)
	    int newFib = 0;//O(1)
	    while(fibNumbers < n) {//O(n)
	    	
	    	newFib = prevFib + currentFib;//O(1)
	    	prevFib = currentFib;//O(1)
	    	currentFib = newFib;//O(1)
	    	fibNumbers++;//O(1)
	    } 
	    
	    return prevFib;	      
	}	
	
	
	/*Да се намери n-тото число на Фибоначи чрез алгоритъм,
 който има по-добра от експоненциална времева сложност.
 Да се намери тази сложност.*/
}
