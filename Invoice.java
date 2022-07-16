public class Invoice {
	private double sum;
	private double hold;
	
	public void addItem(Item item) {
		sum += item.getPrice() * item.getQuantity();
		hold = item.getPrice() * item.getQuantity();
		
		if(item.isEdible() == true) {
			sum -= (double)(hold / 100) * 10;
		}
	}
	public double getTotal() {
		return sum;
	}
}