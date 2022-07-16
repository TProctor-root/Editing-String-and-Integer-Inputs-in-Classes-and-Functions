public class ArrayBarChart {
	private int [] myArray;
	
	public ArrayBarChart(int[] arr) {  
		myArray = new int[0];
		myArray = new int[arr.length];
		
		for(int i = 0; i <= myArray.length - 1; i++) {
			myArray[i] = arr[i];
		}
	}
	public void printBarChart() {
		int good = 0;
		if(myArray[0] >= 10) {
			good = 1;
		}
		if(good == 1) {
			for(int i = 0; i <= myArray.length - 1; i++) {  
				System.out.print(i);
				System.out.print(": ");
				int save = myArray[i] / 10;
				int round = myArray[i] % 10;
				if(round >= 5 ) {
					save++;
				}
				for(int j = 0; j < save && j < 10; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else {
			for(int i = 0; i <= myArray.length - 1; i++) {  
				System.out.print(i);
				int save = myArray[i];
				if(save >= 4 ) {
					save--;
				}
				System.out.print(": ");		
				for(int j = 0; j < save && j < 10; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	public int getNumAsterisks(int index) {
		int a = 0;
		int round = 0;
		if(myArray[0] > 10) {
			a = myArray[index] / 10;
			round = myArray[index] % 10;
			if(round >= 5) {
				a++;
			}	
			if(a >= 11) {
				a = 10;
			}
			return a;
		}
		else {
			if(myArray[index] >= 11) {
				return 10;
			}
			else {
				if(myArray[index] >= 4 ) {
					return myArray[index] - 1;
				}
				else {
					return myArray[index]; 
				}
			}
		}
	}
} 