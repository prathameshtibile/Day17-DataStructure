/**
 * @author PRATHAMESH TIBILE
 * @since 25-6-21
 */
package Day17_DataStructure;

import java.io.FileWriter;
import java.io.IOException;

import Day17_Algorithm.InputUtility;
import Day17_Algorithm.Utility;

public class OrderList {
	public static void main(String[] args) throws IOException 
	{
		LinkedListFinal<Integer> list = new LinkedListFinal<>(); // LinkedList Object Created
		
		
		System.out.println("Enter a Number to Search: ");
		int number = InputUtility.inputInteger();
		
		
		String path = Utility.readFromFile("C:\\Users\\PRATHAMESH TIBILE\\Desktop\\Java Programs\\BridgeLabz\\Unorderd.txt	");
		String [] strArray = path.split(" "); //Splitting spaces from the file and storing in an array
		int size = strArray.length;
		System.out.println(size+" size");
		int []array = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			array[i] = Integer.parseInt(strArray[i]);	//Reading Each Array from "strArray"
		}
		
		int [] sorted = Utility.bubbleSort(array);	//passing "array & it's size" to BubbleSort in Utility Class 
		for(int num : sorted)
			list.add(num);
		
		//to write into file

	    FileWriter writer = new FileWriter("C:\\Users\\PRATHAMESH TIBILE\\Desktop\\Java Programs\\BridgeLabz\\orderd.txt");
	    if (list.search(number) == true)
	    {
	    	list.removeItem(number);	//If given number found then remove
	    }
	    else
	    {
	    	list.add(number);	//if given number not found then add
	    }
	    list.display();
	    int length = list.size();
	    System.out.println("length "+length);
	    list.display();
	    
	    //Writing the list elements into file by popping each elements from the list
	    
		for (int i = 0; i < length; i++) 
		{
			writer.write(list.pop(0) + " ");
		}
		writer.close();
	}

	
	

}
