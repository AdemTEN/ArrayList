/*Create a static method that:
is called repeatAL
returns nothing
takes in a single parameter - an ArrayList of Booleans

This method should modify its ArrayList parameter by repeating its ArrayList values.  

For example, if the parameter is 
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false) 
 */
package repl_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_206_RepeatAll {

	public static void main(String[] args) {

		ArrayList<Boolean> bl = new ArrayList<Boolean>(Arrays.asList(true, false, false));

		repeatAL(bl);
		System.out.println(bl);

	}

	public static void repeatAL(ArrayList<Boolean> bl) {

		//bl.addAll(bl);
		int limit = bl.size();
		for(int i=0;i<limit;i++) {
			
			bl.add(bl.get(i));
			
		}

	

	}
}
