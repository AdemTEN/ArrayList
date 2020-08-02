/*Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.
 */
package repl_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_202_Multiply2 {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10));
		timesTwo(nums);
		System.out.println(nums);
	}

	public static void timesTwo(ArrayList<Integer> nums) {

		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);

		}
	}

}
