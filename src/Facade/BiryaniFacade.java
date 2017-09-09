package Facade;

public class BiryaniFacade {

	private Salt salt;
	private Pepper pepper;
	private Spices spices;
	private Vegetables veges;
	private Rice rice;
	private int amount;
	
	public BiryaniFacade(Salt salt, Pepper pepper, Spices spices, Vegetables veges, Rice rice) {
		super();
		this.salt = salt;
		this.pepper = pepper;
		this.spices = spices;
		this.veges = veges;
		this.rice = rice;
		amount = salt.getAmount() + pepper.getAmount() + spices.getAmount() + veges.getAmountLB() + rice.getAmountLB();
	}
	
	public void spicify()
	{
		this.spices.spiceUp(2);
	}
	
	public void saltify()
	{
		this.salt.addSalt(2);
	}
	
	public int moreBiryani()
	{
		veges.moreVeges(20);
		rice.moreRice(20);
		salt.addSalt(1);
		pepper.addPepper(1);
		spices.spiceUp(1);
		return amount = salt.getAmount() + pepper.getAmount() + spices.getAmount() + veges.getAmountLB() + rice.getAmountLB();
	}
	
}

class Salt{
	private int amount = 2;

	public int getAmount() {
		return amount;
	}
	
	public int addSalt(int amount){
		return this.amount += amount;
	}	
}

class Pepper{
	private int amount = 2;

	public int getAmount() {
		return amount;
	}
	
	public int addPepper(int amount){
		return this.amount += amount;
	}
}

class Spices{
	private Salt salt;
	private Pepper pepper;
	private int amount;
	
	public Spices()
	{
		this.salt = new Salt();
		this.pepper = new Pepper();
		this.amount += salt.getAmount() + pepper.getAmount();
	}
	
	public int getAmount() {
		return amount;
	}
	
	public int spiceUp(int amount){
		this.pepper.addPepper(amount);
		return this.salt.getAmount() + this.pepper.getAmount();
	}
}

class Vegetables{
	private int amountLB = 100;
	public int getAmountLB(){
		return this.amountLB;
	}
	
	public int moreVeges(int amount){
		return this.amountLB += amount; 
	}
}

class Rice{
	
	private int amountLB = 100;
	public int getAmountLB(){
		return this.amountLB;
	}
	public int  moreRice(int amount){
		return this.amountLB += amount; 
	}
}