/*Create a static method that:
is called removeAll
returns nothing
takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord

This method should go through every element of wordList 
and remove every instance of targetWord from the ArrayList.

Example:

ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

removeAll(wordList,"hi");

now wordList is ["hey","yo"]
 */
package repl_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Repl_199_removeAll {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("hi", "hi", "hi", "yo", "yes", "no", "hi" ));
		String str = "hi";
		
		removeAlle(list, str);

	}

	public static void removeAlle(ArrayList<String> wordList, String targetWord) {

		int count = 0;
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).equalsIgnoreCase(targetWord)) {
				count++;
			}
		}
		
		for(int i=0; i<count;i++) {
		 wordList.remove(targetWord);
		}

		System.out.println(wordList.toString());
	}

}
