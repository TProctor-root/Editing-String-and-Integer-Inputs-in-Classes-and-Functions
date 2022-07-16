public class Square {
	private int [][] twoD;
	
	public Square(int[][] nums) {
		twoD = new int[0][0];
		twoD = new int[nums.length][];
		
		for(int i = 0; i < twoD.length; i++) {
			twoD[i] = new int[nums[i].length];
			for(int j = 0; j < twoD[i].length; j++) {
				twoD[i][j] = nums[i][j];
			}
		}
	}
	public int rowSum(int i) {
		int sum = 0;
		
		for(int j = 0; j < twoD[i].length; j++) {
			sum += twoD[i][j];
		}
        return sum;
		
	}
	public int columnSum(int i) {
		int sum = 0;
		
		for(int j = 0; j < twoD[i].length; j++) {
			sum += twoD[j][i];
		}
        return sum;
	}
	public int diagonalSum(boolean mainDiagonal) {	
		if(mainDiagonal == true) {
			int sum = 0;
	        for (int i = 0; i < twoD.length; i++) { 
	            for (int j = 0; j < twoD.length; j++) { 
	                if (i == j) 
	                    sum += twoD[i][j]; 
	            } 
	        }
			return sum;
		}
		else {
			int sum = 0; 
	        for (int i = 0; i < twoD.length; i++) { 
	            for (int j = 0; j < twoD.length; j++) {                 
	                if ((i + j) == (twoD.length - 1)) 
	                    sum += twoD[i][j]; 
	            } 
	        }
	        return sum;
		}
	}
	public boolean isMagic() {		
		int one = 0;
		int two = 0;  
	
		for (int j = 0; j < twoD.length; j++) {
        	two += twoD[j][twoD.length - 1 - j];
        }
        for (int i = 0; i < twoD.length; i++) {
        	one += twoD[i][i]; 
        }
                   
        for (int i = 0; i < twoD.length; i++) { 
            int hold = 0; 
            for (int j = 0; j < twoD.length; j++) {
                hold += twoD[j][i]; 
            } 
            if (hold != one) {
                return false; 
            }
        } 
             
        for (int i = 0; i < twoD.length; i++) { 
            int store = 0; 
            for (int j = 0; j < twoD.length; j++) {
                store += twoD[i][j]; 
            }
            if (store != one) {
                return false; 
            }
        } 
         
        if(one != two) {
        	return false;
        }
        
        return true;
	}
}