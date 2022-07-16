public class CreditCard {
	long num;
	long save;
	
	public CreditCard(long number) {
		num = number;
		save = number;
	}
	public long getNumber() {
		return num;
	}
	public String getNumberWithSpaces() {
		String a = String.valueOf(save);
		StringBuilder str = new StringBuilder(a);
		
		for (int i = 4; i <= str.length(); i += 4) {
            str = str.insert(i, ' ');
            i++;
        }
		return str.toString();
	}
	public boolean isValid() {
		int one = 0;
		String a = String.valueOf(save);
		for(int i = 0; i < a.length(); i++) {
			one += Integer.parseInt(a.charAt(i) + "");
		}
			
		int two = 0;
		String b = String.valueOf(save);
		for(int i = 0; i < b.length(); i += 2) {
			two += Integer.parseInt(b.charAt(i) + "");
		}
		
		int four = 0;
		String c = String.valueOf(save);
		for(int i = 0; i < c.length(); i += 2) {
			if(Integer.parseInt(c.charAt(i) + "") > 4) {
				four++;
			}
		}
		
		int total = one + two + four;
		
		if(total % 10 == 0) {
			return true;
		}
		else {
			return false;
		} 
	}
}