public class Item {
	private double money;
	private boolean eat;
	private int amount;
	
	public Item(double price, boolean edible, int quantity) {
		money = price;
		eat = edible;
		amount = quantity;
	}
	public double getPrice() {
		return money;
	}
	public boolean isEdible() {
		return eat;
	}
	public int getQuantity() {
		return amount;
	}
} 