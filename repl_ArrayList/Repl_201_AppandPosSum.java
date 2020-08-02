/*Create a static method that:

is called appendPosSum,
returns an ArrayList of Integers,
takes one parameter: an ArrayList of Integers.
 
This method should:
Create a new ArrayList of Integers,
Add only the positive Integers to the new ArrayList,
Sum the positive Integers in the new ArrayList and add the Sum as the last element.

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
 the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  
The original ArrayList should remain unchanged.
 */
package repl_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_201_AppandPosSum {

	public static void main(String[] args) {

		ArrayList<Integer> original = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
		ArrayList<Integer> newOiginal = appendPosSum(original);
		System.out.println(newOiginal.toString());

	}

	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> original) {

		ArrayList<Integer> newOriginal = new ArrayList<>();

		for (int i = 0; i < original.size(); i++) {
			if (original.get(i) > 0) {
				newOriginal.add(original.get(i));
			}
		}
		int sum = 0;
		for (int i = 0; i < newOriginal.size(); i++) {
			sum += newOriginal.get(i);
		}
		newOriginal.add(sum);
		return newOriginal;

	}

}
