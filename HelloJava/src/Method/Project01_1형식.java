package Method;

import java.util.Scanner;

public class Project01_1형식 { //메소드 호출해서 윤년 구하기
								// 메소드 1형식   = > 인자없는 메소드 

	public static void main(String[] args) {
		kajayoon();
		kajayoon();
		

	}

	private static void kajayoon() {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇년도? : ");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				System.out.println(year + "년은 평년");
			} else {
				System.out.println(year + "년은 윤년");
			}
		} else {
			System.out.println(year + "년은 평년");
		}

	}
}