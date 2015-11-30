
public class Lab11avst {

	private static final boolean False = false;
	private static final boolean True = true;

	public static void main(String[] args) 
	{
		// This main method needs additions for the 100 point version.
		//Scanner input = new Scanner(System.in); 
		final int MAX = 100;
		boolean primes[];
		int num[];
		num = new int[MAX];
		primes = new boolean[MAX];
		computePrimes(primes , num);
		displayPrimes(primes , num);
	}

	public static void computePrimes(boolean primes[], int num[]){
		
		final int MAX = 100;
		int stop = MAX;
		
		for(int loop: num){
			int num = (int) MAX;
		}
		
		for(int first: num){
			System.out.print(num[first] + " , ");
		/*for(int k = 0; k != stop; k++){
				int temp;
				temp = first*k;
				if (first == temp){
					primes[first] = False;
					stop = temp;
				}
				else {
					primes[first] = True;
				}
			}*/
		}
	}    
	
	public static void displayPrimes(boolean primes[], int num[]){
		
		for(int first : num){	
			//System.out.print(num[first] + " , ");
			//if (primes[first] = True){
				//System.out.print(num[first] + " , ");
			//}	
		}
	}
}
