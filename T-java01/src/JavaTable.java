public class JavaTable {
	public static void main(String[] args) {
		// �ݖ�P
		System.out.println("==�ݖ�P==");
		System.out.print("1�`10�̋����́@= ");
		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				System.out.print(a);
			}
		}
		System.out.println();
		System.out.println();

		// �ݖ�2
		System.out.println("==�ݖ�2==");
		int b2 = 0;
		int b3 = 0;
		for (int b = 1; b <= 10; b++) {
			if (b % 2 == 0) {
				b3 = b3 + b;
				b2++;
			}
		}
		System.out.println("�����̌��� = " + b2);
		System.out.println("�����̍��v�� = " + b3);
		System.out.println();
		System.out.println();

		// �ݖ�3
		System.out.println("==�ݖ�3==");
		System.out.print("1�`10�@���������с@= ");
		for (int c = 1; c <= 10; c++) {
			System.out.print(" " + c);
		}

		System.out.println();
		System.out.println();

		// �ݖ�4
		System.out.println("==�ݖ�4==");
		int[] hai = new int[20];
		int kasan = 0;
		for (int g = 0; g <= hai.length; g++) {
			kasan += 5;
			hai[g] += kasan;

			if(g <= 10) {
				if(hai[g] % 2 != 0) {
					System.out.println("�z��ԍ� : " + g + " �l��" + hai[g] + ",");
				}else {
					System.out.println("�z��ԍ� : " + g + " �l��" + hai[g]);
				}
			}else{
				if(hai[g] % 2 == 0) {
					System.out.println( "�z��ԍ� : " + g + " �l��" + hai[g] + ",");
				}else {
					System.out.println("�z��ԍ� : " + g + " �l��" + hai[g]);
				}
				
			}
		}
	}
}
