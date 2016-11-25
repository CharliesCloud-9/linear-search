package linearSearch;

public class LinearSearch {
	
	public int linearSearchMethod(int[] list, int target) {
		for (int i = 0; i < list.length; i++) {			//***for loop*** -Control Flow using logical operators = and <
			//System.out.println(list[i]); 				Optional: here to show how many guesses/steps it takes. However far in the list target is, thats how many steps/guesses it will take because its Linear.
			if (list[i] == target) {					//***if statement*** -Control Flow using logical operators ==
				return i;
			}
		}
		return -1;										//Fail-safe in case the target number is not in the list.
	}
	
	public static void main(String arg[]) {
		int[] list = {1,4,3,5,6,8,9,3};
		LinearSearch lsObj = new LinearSearch();
		System.out.println("Found target at index: " + lsObj.linearSearchMethod(list, 8));	
	}
}
