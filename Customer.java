public class Customer {
	private String iD;
	private double cost;
	    
	public Customer(String name) {
		iD = name;	
		cost = 0;
	}
	public String getName() {
		return iD;
	}
	public double getAmountSpent() {
		return cost;
	}
	public void addSale(double amount) {
		cost += amount;
	}
}