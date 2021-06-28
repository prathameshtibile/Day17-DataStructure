/**
 * @author PRATHAMESH TIBILE
 *@since 27-6-21
 *to check the given equation is balenced or unbalenced.
 */


package Day17_DataStructure;

import Day17_Algorithm.InputUtility;

public class BalancedParentheses {
	
	public static boolean checkParentheses(char [] arr, int length) 
	{
		Stack stack = new Stack();
		
		
		for (int i = 0; i < length; i++) 
		{
		
			if(arr[i] == '{' || arr[i] == '(' || arr[i] == '[')
				stack.push(arr[i]);
			if(arr[i] == '}' || arr[i] == ')' || arr[i] == ']')
			{
				if (stack.isEmpty()) 
				{
					return false;
				}
				else
				{

				if(!matchingPair((char)stack.pop(),(char) arr[i]))
				{
					return true;
				}
				}
			}
			
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
		
	}
	public static boolean matchingPair(char ch1, char ch2)
	{
		if((ch1 == '(') && ( ch2 == ')'))
			return true;
		else if(ch1 == '{' && ch2 == '}')
			return true;
		else if(ch1 == '[' && ch2 == ']')
			return true;
		else 
			return false;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the expression : ");
		char []exp = InputUtility.inputStringLine().toCharArray();
		int length = exp.length;

		//checking the parenthesis is balanced or not
		if(checkParentheses(exp,length))
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");
	}

}
