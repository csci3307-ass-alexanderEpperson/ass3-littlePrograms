/**
 * 
 */
package com.mycompany.ass3.chapter8;

/**
 * @author green
 *
 */
public class Child extends Parent implements AsksForMoney, SpendsMoney 
{
	private String favoriteFood;
	public Child()
	{
	}
	public Child(float _debt, String _name, String _lastName, float _wealth, String _favoriteFood)
	{
		super(_debt, _name, _lastName, _wealth);
		favoriteFood = _favoriteFood;
	}
	public Child(Child c)
	{
		this(c.getDebt(), c.getName(), c.getLastName(), c.wealth, c.favoriteFood);
	}
	@Override
	public float investInMe(float amountToAsk) 
	{
		return 0;
	}
	@Override
	public boolean spendMoney(float moneyToSpend) 
	{
		boolean retVal = false;
		if (moneyToSpend <= wealth)
		{
			wealth -= moneyToSpend;
			retVal = true;
		}
		return retVal;
	}
}
