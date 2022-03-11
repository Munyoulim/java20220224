package Private;

import java.util.Scanner;

public class ScannerMaxNumberExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int i = 0;
		int max = 0;
		
		while (true) {
			System.out.println("정수를 입력하세요. (999입력시 종료)");
			num = scanner.nextInt();
			
			if (num == 999) {
				break;
			} else if (num > max) {
				max = num;
			}
		}
		System.out.println("입력된수 :" + i + "최대값:" + max);
		scanner.close();
	}
}
