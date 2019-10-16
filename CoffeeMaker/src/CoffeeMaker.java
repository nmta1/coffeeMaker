#public class CoffeeMaker {

	/** Inventory in the coffee maker */
	private int coffee;
	private int milk;
	private int chocolate;

	/**
	 * Creates a coffee maker object with empty containers.
	 */
	public CoffeeMaker() {
		this.coffee = 0;
		this.milk = 0;
		this.chocolate = 0;
	}

	/**
	 * Returns the current number of chocolate units in 
	 * the coffee maker.
	 * @return int
	 */
	public int getChocolate() {
		return chocolate;
	}

	/**
	 * Returns the current number of coffee units in
	 * the coffee maker.
	 * @return int
	 */
	public int getCoffee() {
		return coffee;
	}

	/**
	 * Returns the current number of milk units in
	 * the coffee maker.
	 * @return int
	 */
	public int getMilk() {
		return milk;
	}

	/**
	 * Returns a string describing the current contents 
	 * of the inventory.
	 * @return String
	 */
	public String checkIngredients() {
		// TODO: code this method
		StringBuffer buf = new StringBuffer();
		buf.append("Not yet implemented");
		buf.append("\n");
		return buf.toString();
	}

	/**
	 * Cleanup coffee maker emptying all its content
	 */
	public void cleanup() {
		
		// TODO: code this method
	}

	/**
	 * Adds ingredients to the coffee maker
	 * @param amtCoffee
	 * @param amtMilk
	 * @param amtChocolate
	 * @return boolean
	 */
	public void addIngredients(int amtCoffee, int amtMilk, int amtChocolate) throws Exception {

		if(amtChocolate < 0|| amtCoffee < 0  || amtMilk < 0)
		{
			throw new IllegalArgumentException();
		}

		this.coffee = amtCoffee;
		this.milk = amtMilk;
		this.chocolate = amtChocolate;



		// TODO: code this method

	}

	/**
	 * Make an espresso and return the change, or
	 * the user's money if the espresso cannot be made.
	 * An espresso uses one unit of coffee and costs one pound.
	 * @param amtPaid
	 * @return int
	 */
	public int makeEspresso(int amtPaid) {
int costOfEspresso =1;
if(this.coffee <1){ return amtPaid;
}else{ if (amtPaid >= costOfEspresso){
int change = amtpaid - costOfEspresso;
this.coffee--;
return change;
}
		// TODO: code this method
return amtPaid;
	}
}

	/**
	 * Make a latte and return the change, or
	 * the user's money if the latte cannot be made.
	 * A latte uses two units of coffee and one unit of milk.
	 * @param amtPaid
	 * @return int
	 */
	public int makeLatte(int amtPaid) {
		int costOfLatte = 2;
		if (this.coffee < 2 && this.milk < 1)
		{
			return amtPaid;
		}
		if (amtPaid >= costOfLatte){
			int change = amtPaid - costOfLatte;
			this.coffee = this.coffee - 2;
			this.milk--;
			return change;
		} 
}
