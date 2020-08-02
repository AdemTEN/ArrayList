/*Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, 
and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1,
then add all the words (in order) from wordList2. 
In other words, it is combining all the elements from the two parameters.
 * 
 */
package repl_ArrayList;

import java.util.ArrayList;

public class Repl_198_CombineArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list1.add("Adem");
		list2.add("Mehmet");
		

		ArrayList<String> newArrayList = combineAL(list1, list2);
		System.out.println(newArrayList.toString());
		
		
	}
	
	public static ArrayList<String> combineAL(ArrayList<String> list1, ArrayList<String> list2){
		
		ArrayList<String> newArrayList = new ArrayList<String>();
		
		for(String each: list1) {
			newArrayList.add(each);
		}
		
		for(String each : list2) {
			newArrayList.add(each);
		}
		
		
		return newArrayList;
	}

}
