/*
		// have to print the largest prime factor of i                                                                                                                                    }                        nput
 * No package must be added here because some Online Judges don't support it
 * please remove, if any.
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Only classes with 'Main' name are accepted in CodeChef and some other online judges
 */
public class Problem4 { 

	/*
	 * In a Programming contest, you are expected to print the output at the
	 * end, so `output` variable will hold all the processed results till the
	 * end
	 */
	public static String output = "";

	// Program's starting point
	public static void main(String[] args) {

		/*
		 * A Scanner class slows down Input/Output a LOT ,thereby increasing
		 * your code execution time , Hence for best results that is Fast I/O
		 * try to use BufferedReader
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * Generally Code Chef, Hacker Rank gives X number of test cases so we
		 * process the input for each.
		 */
		final int cases;
		try {
			/*
			 * Logic of the program must be separated from the meta code to
			 * increase readability and help debugging easier
			 * Also note that Solver object is created inside for loop to
			 * avoid multiple object creation that drastically increases 
			 * execution time and memory usage
			 */
			Solver solver = new Solver();
			solver.solve(br.readLine());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Print the final output
		System.out.println(output);
	}

}
/*
 * Some basic rules while coding in Programming Contests:
 * Try to follow at least 80% of them
	Correctness
		- final declaration for required data types
		- avoid Object creation 
		- Scanner slows down, use InputReader
		- avoid too many static functions	
	Efficiency
		- use library functions as much as possible		
		- assertEquals("RESULT", functionToCall())
	Debugging-ability
		- avoid too many global variables 
		- Separate logic from meta-processing
		- variable/function pneumonics must make sense
 * 
 */
class Solver {

	/*
	 * Logic goes here ...
	 * Add to the global variables after processing the input
	 * Maybe reverse a string or parse to an integer or , etc.
	 */	
	public void solve(String input) {					
		// fiind the largest palindrome from 2 3 digit numbers
		int i = 999;
		int max = 0;
		while(i >= 100){
				
			int j = 999;
			while(j >=100){
				if(isPalindrome(i*j)){
					if(i*j > max){
						max = i*j;
					}
				}
				j--;
			}
			i--;
		}	
		System.out.println(max);
	}

public static boolean isPalindrome(int integer) {
    int palindrome = integer;
    int reverse = 0;

    // Compute the reverse
    while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }

    // The integer is palindrome if integer and reverse are equal
    return integer == reverse; // Improved by Peter Lawrey
	
}
}
