import java.util.ArrayList;

public class PetStore {
	ArrayList<String> name;
	ArrayList<Double> money;
	
	public PetStore() {
		name = new ArrayList<>(); 
		money = new ArrayList<>();
	}
	public void addCustomer(Customer c) {
		name.add(c.getName());
		money.add(c.getAmountSpent());		
	}	
	public String getNameOfBestCustomer() {
		int size = name.size();
		int place = 0;
		double max = money.get(0);
		
		for (int i = 1; i < size; i++) { 
            if(money.get(i) > max) {
            	max = money.get(i);
            	place = i;
            }
        } 
		return name.get(place);
	}
} 