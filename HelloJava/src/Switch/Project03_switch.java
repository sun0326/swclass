package Switch;

import java.util.Scanner;

public class Project03_switch {

	public static void main(String[] args) {
		// 월을 입력받아 해당월의 날짜수를 출력하느 프로그램을 작성 
		
		Scanner	sc = new Scanner(System.in);
		System.out.print("몇월? :");
		int mon =sc.nextInt();
		switch(mon) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
		case 2:
			System.out.println("28일");
			break;
		default:
			System.out.println("31일");
		}
		
	}

}
