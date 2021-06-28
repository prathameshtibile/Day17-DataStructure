/**
 * @author PRATHAMESH TIBILE
 * @since 25-6-21
 */
package Day17_DataStructure;

import java.io.FileWriter;
import java.io.IOException;

import Day17_Algorithm.InputUtility;
import Day17_Algorithm.Utility;

public class UnOrderd_List {
	public static void main(String[] args) throws IOException 
	{

		LinkedListFinal<String> list = new LinkedListFinal<String>();

		System.out.println("Enter the word you want to search :");

		String item = InputUtility.inputStringLine();

		//read from file and assign into String s

		String path = Utility_Datastructure.readFromFile("C:\\Users\\PRATHAMESH TIBILE\\Desktop\\Java Programs\\BridgeLabz\\Unorderd.txt"); // hi gm its pratham here

		String []words = path.split(" ");

		//adding in data into linkedlist

		for (String word : words) 

			list.add(word);



		//to write into file

		FileWriter writer = new FileWriter("readFromFile");

		//logic to search the word,remove and add

		if (list.search(item) == true) 
		{
			list.removeItem(item);    
		} 
		else 
		{
			list.add(item);
		}

		list.display();

		int size = list.size();
		
		

		for (int i = 0; i < size-1; i++) 
		{
			writer.write(list.pop(0)+ " ");
		}
		writer.close();
	}

	

}
