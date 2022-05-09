public class JavaTable {
	public static void main(String[] args) {
		// 設問１
		System.out.println("==設問１==");
		System.out.print("1～10の偶数は　= ");
		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				System.out.print(a);
			}
		}
		System.out.println();
		System.out.println();

		// 設問2
		System.out.println("==設問2==");
		int b2 = 0;
		int b3 = 0;
		for (int b = 1; b <= 10; b++) {
			if (b % 2 == 0) {
				b3 = b3 + b;
				b2++;
			}
		}
		System.out.println("偶数の個数は = " + b2);
		System.out.println("偶数の合計は = " + b3);
		System.out.println();
		System.out.println();

		// 設問3
		System.out.println("==設問3==");
		System.out.print("1～10　整数横並び　= ");
		for (int c = 1; c <= 10; c++) {
			System.out.print(" " + c);
		}

		System.out.println();
		System.out.println();

		// 設問4
		System.out.println("==設問4==");
		int[] hai = new int[20];
		int kasan = 0;
		for (int g = 0; g <= hai.length; g++) {
			kasan += 5;
			hai[g] += kasan;

			if(g <= 10) {
				if(hai[g] % 2 != 0) {
					System.out.println("配列番号 : " + g + " 値は" + hai[g] + ",");
				}else {
					System.out.println("配列番号 : " + g + " 値は" + hai[g]);
				}
			}else{
				if(hai[g] % 2 == 0) {
					System.out.println( "配列番号 : " + g + " 値は" + hai[g] + ",");
				}else {
					System.out.println("配列番号 : " + g + " 値は" + hai[g]);
				}
				
			}
		}
	}
}
