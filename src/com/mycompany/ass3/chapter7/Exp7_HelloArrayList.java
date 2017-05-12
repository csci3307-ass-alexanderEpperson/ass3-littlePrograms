/**
 * 
 */
package com.mycompany.ass3.chapter7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author green
 *
 */
public class Exp7_HelloArrayList 
{
	public static void main(String[] args)
	{
		List<String>  strings;
		List<Integer> integers;
		strings = new ArrayList<String>();
		integers = new ArrayList<Integer>();
		List<Integer> integers2 = new ArrayList<Integer>();
		strings.add("Alex");
		strings.add("Epperson");
		strings.add(0, "Mr.");
		System.out.println("strings: " + strings);
		System.out.println("Do the strings contain 'Alex'? :" + strings.contains("Alex"));	
		System.out.println("index of 'Epperson' in strings:" + strings.indexOf("Epperson"));	
		System.out.println("Element at index 1 of strings:" + strings.get(1));			
		System.out.println("strings has " + strings.size() + " elements");		
		for (int i = 0; i < 5; i++)
		{
			integers.add(i);
		}
		System.out.println("integers:" + integers);
		int index = 0;
		for (Integer integer : integers) 
		{
			System.out.println("Element number " + index++ + " of integers: " + integer);
		}
		integers2.addAll(integers);
		System.out.println("AFTER adding all of integers to integers2, integer2:" + integers2);
		Integer[] intArray = {5,6,7,8,9,100,200};
		List<Integer> fixedSizeListBackedByArray = Arrays.asList(intArray);	
		integers2.addAll(Arrays.asList(intArray));
		System.out.println("AFTER adding all elements of intArray to integers2, integer2:" + integers2);	
		System.out.println("size of integers2:" + integers2.size());
		integers2.remove(new Integer(200));	
		System.out.println("AFTER removing 100 from integers2, integer2:" + integers2);	
		integers2.remove(10);	
		System.out.println("AFTER removing 100 at the 10th index from integers2, integer2:" + integers2);
		integers2.clear();	
		System.out.println("AFTER clearing integers2, integer2:" + integers2);
	}
}
