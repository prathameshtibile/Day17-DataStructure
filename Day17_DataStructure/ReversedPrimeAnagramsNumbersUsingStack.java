/**
 * @author PRATHAMESH TIBILE
 *@since 27-6-21
 */

package Day17_DataStructure;

import Day17_Algorithm.Utility;

public class ReversedPrimeAnagramsNumbersUsingStack {

	// Main method
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>();
		// logic to push the prime number into stack
		for (int i = 2; i <= 1000; i++) 
		{
			if (Utility.isPrime(i)) 
			{
				stack.push(i);
			}
		}

		// logic to store prime numbers from stack to array
		int size = stack.size();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) 
		{
			array[i] = stack.pop();
		}

		// logic to check prime numbers are anagram or not
		System.out.println("Anagrams \t Primes");
		for (int i = 0; i < size; i++) 
		{
			for (int j = i + 1; j < size; j++) 
			{
				if (Utility.isAnagram(array[i],array[j]) && array[i] != 0 && array[j] != 0) 
				{
					System.out.println(array[i] + " \t\t " + array[j]);
				}
			}
		}
	}

}
