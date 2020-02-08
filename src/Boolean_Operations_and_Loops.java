
public class Boolean_Operations_and_Loops {

	public static void main(String[] args) {
		
		boolean isHotOutside = true;
		boolean isWeekDay = true;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.99;
		double moneyInWallet = 20.00;
		int thirstLevel = 3;
		
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekDay;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekDay;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk * 2;
		
		System.out.println(shouldBuyIceCream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		
		int a = 0;
		while (a < 100) {
			a = a + 2;
			System.out.println("all even numbers: " + a);
		}
		
		int b = 100;
		while (b > 0) {
			b = b - 3;
			if (b % 3 == 1)
			System.out.println("every third number: " + b);
		}
		
		for (int i = 1; i <= 100; i ++) {
			i = i + 2;
			if (i != 102)
			System.out.println("every other number:  " + i);
		}
		
		for (int i = 0; i <= 100; i ++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Hello World");
			}else if (i % 3 == 0) {
				System.out.println("Hello");
			}else if (i % 5 == 0) {
				System.out.println("World");
		 	}
		}

	}

}
