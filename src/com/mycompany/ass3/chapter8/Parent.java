/**
 * 
 */
package com.mycompany.ass3.chapter8;

/**
 * @author green
 *
 */
public class Parent extends Grandparent
{
protected float wealth;
	public Parent()
	{
		super();
	}
	public Parent(float _debt, String _name, String _lastName, float _wealth)
	{
		super(_debt, _name, _lastName);
		wealth = _wealth;
	}
}