/*Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains 
every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 * 
 */
package repl_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_215_2TimesRepeat {

	public static void main(String[] args) {
	
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,3,5,7));
		ArrayList<Integer> nums = twoTimes(arr);
		System.out.println(arr.toString());
		System.out.println(nums.toString());

	}
	
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr ){
		
		ArrayList<Integer> nums = new ArrayList<>(arr);
		//nums.addAll(arr);
		for(int i=0;i<nums.size();i++) {
			nums.add(i, nums.get(i));
			i++;
		}
		return nums;
	}

}
