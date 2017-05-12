/**
 * 
 */
package com.mycompany.ass3.chapter8;

/**
 * @author green
 *
 */
public class Exp8_HelloConstructor
{
	public static void main(String[] args) 
	{
		HasName namedChild = new Child();
		SpendsMoney moneySpendingChild = new Child();
		AsksForMoney moneyAskingChild = new Child();
		
		Child child1 = new Child(0, "Alex Jr.", "Epperson", 936, "tacos");
		Child child2a = new Child(0, child1.getName(), child1.getLastName(), 936, "tacos");
		Child child2b = new Child(child1);
	}
}
