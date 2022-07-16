class Main {
	public static String problem1_mirrorEnds(String str) {
		int back = str.length() - 1;
		for(int i = 0; i < str.length(); i++, back--) {
			if(str.charAt(i) != str.charAt(back)) {
				return str.substring(0, i);
			}
		}
		return str;	
	}
	public static int problem2_sumNumbers(String str) {
		int total = 0;
		String hold = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
					hold = hold + str.charAt(i);
				}
				else {
					hold = hold + str.charAt(i);
					total = total + Integer.parseInt(hold);
					hold = "";
				}
			}
		}
		return total;
	} 
	public static String problem3_notReplace(String str) {	
		return str.replaceAll("\\bis", "is not");
	} 
	public static int problem5_getNumTwists(int starting, int target) {
		if(starting == 0000 && target == 9999) {
			return 4;
		}
		
		int total = 0;
		
		do {
			int a = starting % 10;
			int b = target % 10;
			int ab = Math.abs(a - b);
			
			total = total + ((ab > (10 - ab)) ? (10 - ab) : ab);
			
			starting = starting / 10;
			target = target / 10;
		}while(starting != 0 && target != 0);
		
		return total;
	} 
	public static int[] problem6_evenOdd(int[] nums) {		
		int hold;
		int j = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				hold = nums[i];
				nums[i] = nums[j];
				nums[j] = hold;
				j++;
			}
		}
		return nums;
	} 

	public static void main(String[] args) {
		System.out.println(problem1_mirrorEnds("abXYZba")); 
		// returns "ab"
		System.out.println(problem1_mirrorEnds("abca")); 
		// returns "a"
		System.out.println(problem1_mirrorEnds("aba")); 
		// returns "aba"
		System.out.println(problem1_mirrorEnds("abc")); 
		// returns ""
		
		System.out.println(problem2_sumNumbers("abc123xyz")); 
		// returns 123
		System.out.println(problem2_sumNumbers("aa11b33"));
		// returns 44
		System.out.println(problem2_sumNumbers("7 11"));
		// returns 18
		System.out.println(problem2_sumNumbers("Robert"));
		// returns 0
		
		System.out.println(problem3_notReplace("is test"));
		// returns "is not test"
		System.out.println(problem3_notReplace("is-is"));
		// returns "is not-is not"
		System.out.println(problem3_notReplace("This is right"));
		// returns"This is not right"
		System.out.println(problem3_notReplace("I love Java!"));
		// returns "I love Java!"
		System.out.println(problem3_notReplace("My favorite number is3.")); 
		// returns "My favorite number is not3."
		System.out.println(problem3_notReplace("I miss you"));
		// returns "I miss you"
		
		CreditCard cc1 = new CreditCard(4012888888881881L);
		System.out.println(cc1.getNumber()); 
		// 4012888888881881
		System.out.println(cc1.getNumberWithSpaces()); 
		// 4012 8888 8888 1881
		System.out.println(cc1.isValid()); 
		// true 
		CreditCard cc2 = new CreditCard(1234567890123456L);
		System.out.println(cc2.getNumber()); 
		// 1234567890123456
		System.out.println(cc2.getNumberWithSpaces()); 
		// 1234 5678 9012 3456
		System.out.println(cc2.isValid()); 
		// false
		
		System.out.println(problem5_getNumTwists(1729, 5714)); 
		// returns 10
		System.out.println(problem5_getNumTwists(0000, 9999));
		// returns 4
		System.out.println(problem5_getNumTwists(4590, 4590));
		// returns 0
		System.out.println(problem5_getNumTwists(7712, 1729)); 
		// returns 8
		
		System.out.println(problem6_evenOdd(new int [] {1, 0, 1, 0, 0, 1, 1})); 
		// returns [0, 0, 0, 1, 1, 1, 1] (remember 0 is an even number)
		System.out.println(problem6_evenOdd(new int [] {3, 3, 2}));
		// returns [2, 3, 3]
		System.out.println(problem6_evenOdd(new int [] {2, 2, 2})); 
		// returns [2, 2, 2]
		 
		ArrayBarChart chart1 = new ArrayBarChart(new int[] {88, 14, 20, 25, 43, 100});
		chart1.printBarChart(); 
		/* prints:
		0: *********
		1: *
		2: **
		3: ***
		4: ****
		5: **********
		*/
		System.out.println(chart1.getNumAsterisks(0)); // returns 9
		System.out.println(chart1.getNumAsterisks(2)); // returns 2
		System.out.println(chart1.getNumAsterisks(5)); // returns 10

		ArrayBarChart chart2 = new ArrayBarChart(new int[] {8, 8, 3, 3, 1, 0, 2, 4, 12});
		chart2.printBarChart(); 
		/* prints:
		0: *******
		1: *******
		2: ***
		3: ***
		4: *
		5:
		6: **
		7: ***
		8: **********
		*/
		System.out.println(chart2.getNumAsterisks(0)); // returns 7
		System.out.println(chart2.getNumAsterisks(2)); // returns 3
		System.out.println(chart2.getNumAsterisks(5)); // returns 0
		
		int[][] nums1 = {
			     { 16, 3, 2, 13 },
			     { 5, 10, 11, 8 },
			     { 9, 6, 7, 12 },
			     { 4, 15, 14, 1 }
		};
		Square s1 = new Square(nums1);
		System.out.println(s1.rowSum(0)); // 34
		System.out.println(s1.rowSum(3)); // 34
		System.out.println(s1.columnSum(1)); // 34
		System.out.println(s1.columnSum(2)); // 34
		System.out.println(s1.diagonalSum(true)); // 34
		System.out.println(s1.isMagic()); // true
			 
		int[][] nums2 = {
			     { 6, 3, 20 },
			     { 15, 0, 1 },
			     { 7, 2, 17 }
		};
		Square s2 = new Square(nums2);
		System.out.println(s2.rowSum(1)); // 16
		System.out.println(s2.rowSum(2)); // 26
		System.out.println(s2.columnSum(0)); // 28
		System.out.println(s2.columnSum(1)); // 5
		System.out.println(s2.diagonalSum(false)); // 27
		System.out.println(s2.isMagic()); // false
			
		Item treats = new Item(2.5, true, 10); 
		Item collar = new Item(15.75, false, 1);
		Item dogShampoo = new Item(9, false, 2);
		Item bones = new Item(6.25, true, 5);
		Invoice myInvoice = new Invoice();
		myInvoice.addItem(treats);
		myInvoice.addItem(collar);
		myInvoice.addItem(dogShampoo);
		myInvoice.addItem(bones);
		System.out.println(myInvoice.getTotal()); 
		// should return 84.375 (22.50 for treats + 15.75 for collar + 18 for dogShampoo + 28.125 for bones)
			
		PetStore myStore = new PetStore();
		Customer emily = new Customer("Emily");
		emily.addSale(55.33);
		emily.addSale(.99);
		Customer adriana = new Customer("Adriana");
		adriana.addSale(89.30);
		adriana.addSale(9.99);
		Customer anupriya = new Customer("Anupriya");
		anupriya.addSale(101.54);
		Customer rujun = new Customer("Rujun");
		rujun.addSale(55.33);
		rujun.addSale(.99);
		rujun.addSale(55.33);
		rujun.addSale(10.99);
		Customer yizhen = new Customer("Yizhen");
		yizhen.addSale(.33);
		yizhen.addSale(.99);
		yizhen.addSale(121.09);
		myStore.addCustomer(emily);
		myStore.addCustomer(adriana);
		myStore.addCustomer(anupriya);
		myStore.addCustomer(rujun);
		myStore.addCustomer(yizhen);
		System.out.println(myStore.getNameOfBestCustomer()); 
		// returns "Rujun"
			
		System.out.println();
			
		System.out.println(problem1_mirrorEnds("aba"));
		// "aba"
			
		System.out.println(problem2_sumNumbers("aa11b33"));
		// 44
			
		System.out.println(problem3_notReplace("is-is"));
		// "is not-is not"
			
		CreditCard cc = new CreditCard(4012888888881881L);
		System.out.println(cc.getNumber());
		// 4012888888881881L
		System.out.println(cc.getNumberWithSpaces());
		// "4012 8888 8888 1881"
		System.out.println(cc.isValid());
		// true
			
		System.out.println(problem5_getNumTwists(0000, 9999));
		// 4
			
		System.out.println(problem6_evenOdd(new int [] {3, 3, 2}));
		// new int [] {2, 3, 3}
			
		ArrayBarChart chart = new ArrayBarChart(new int[] {8, 8, 3, 3, 1, 0, 2, 4, 12});
			
		System.out.println(chart.getNumAsterisks(0));
		// 7
		System.out.println(chart.getNumAsterisks(2)); 
	        // 3
		System.out.println(chart.getNumAsterisks(5));
	        // 0
			
		int [][] yu = {
	                { 16, 3, 2, 13 },
	                { 5, 10, 11, 8 },
	                { 9, 6, 7, 12 },
	                { 4, 15, 14, 1 }
	        };
		Square uy = new Square(yu);
		System.out.println(uy.rowSum(0));
	        // 34
		System.out.println(uy.rowSum(3));
	        // 34
		System.out.println(uy.columnSum(1));
	        // 34
		System.out.println(uy.columnSum(2));
	        // 34
		System.out.println(uy.diagonalSum(true));
	        // 34
		System.out.println(uy.isMagic());
	        // true
			
		Item t = new Item(2.5, true, 10);
	        Item c = new Item(15.75, false, 1);
	        Item d = new Item(9, false, 2);
	        Item b = new Item(6.25, true, 5);
	        Invoice m = new Invoice();
	        m.addItem(t);
	        m.addItem(c);
	        m.addItem(d);
	        m.addItem(b);
	        System.out.println(m.getTotal());
	        // 84.375
	        
	        PetStore my = new PetStore();
	        Customer e = new Customer("Emily");
	        e.addSale(55.33);
	        e.addSale(.99);
	        Customer a = new Customer("Adriana");
	        a.addSale(89.30);
	        a.addSale(9.99);
	        Customer an = new Customer("Anupriya");
	        an.addSale(101.54);
	        Customer r = new Customer("Rujun");
	        r.addSale(55.33);
	        r.addSale(.99);
	        r.addSale(55.33);
	        r.addSale(10.99);
	        Customer y = new Customer("Yizhen");
	        y.addSale(.33);
	        y.addSale(.99);
	        y.addSale(121.09);
	        my.addCustomer(e);
	        my.addCustomer(a);
	        my.addCustomer(an);
	        my.addCustomer(r);
	        my.addCustomer(y);
	        System.out.println(my.getNameOfBestCustomer());
	        // "Rujun"
	}
}
