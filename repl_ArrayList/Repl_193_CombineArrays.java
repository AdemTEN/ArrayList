/*combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 * 
 */
package repl_ArrayList;

import java.util.ArrayList;

public class Repl_193_CombineArrays {

	public static void main(String[] args) {

		String[] r1 = { "f", "o", "o","avb" };
		String[] r2 = { " b", "a", "r" };
		System.out.println(combineRs(r1, r2));
		
	}

	public static String combineRs(String[] r1, String[] r2) {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < r1.length; i++) {
			list.add(r1[i]);
		}
		for (String each : r2) {
			list.add(each);
		}
		String newStr = "";
		for (int i = 0; i < list.size(); i++) {
			newStr += list.get(i);
		}
		return newStr;
	}

}
