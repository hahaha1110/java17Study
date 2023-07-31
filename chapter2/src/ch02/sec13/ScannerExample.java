package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x 값 입력");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.println("y 값 입력");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y = " + result);
		System.out.println();

		while (true) { // 무한반복
			System.out.println("입력 문자열 : ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break; // q 이면 반복문 중지
			}
			
			System.out.println("출력 문자열 : " + data);
			System.out.println();
		}
		
		System.out.println("종료");
	}

}
