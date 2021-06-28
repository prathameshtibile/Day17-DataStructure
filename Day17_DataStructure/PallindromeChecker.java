package Day17_DataStructure;

import Day17_Algorithm.InputUtility;

/**
 * @author PRATHAMESH TIBILE
 *@since 27-6-21
 *to check the word is palindrome or not . like level, receiver etc.
 */


public class PallindromeChecker {
	public static boolean checkPallindrome(String str2) 
	{
		Dequeue<Character> dequeue = new Dequeue<>();	// creating an object of Dequeue class

		for (int i = 0; i < str2.length(); i++) 
		{
			char ch = str2.charAt(i);
			dequeue.addFront(ch);
		}
		
		String reverse = "";
		
		for (int i = 0; i < str2.length(); i++)
		{
			reverse = reverse + dequeue.removeFront();
			
		}

		if (reverse.equals(str2)) 
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{

		System.out.println("Enter a String : ");
		String str = InputUtility.inputStringLine();
		
		if(PallindromeChecker.checkPallindrome(str))
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");

	}

}
