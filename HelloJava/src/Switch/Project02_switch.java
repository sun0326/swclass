package Switch;

import java.util.Scanner;

public class Project02_switch {

	public static void main(String[] args) {
		/*		
		switch(조건(i)) {
			case 1(실수 x, 문자 o):
					..
					break;
			case 2:
					break;
			default:

		}

		 */
		/*
			점수가 73인 학생의 학점을 구하시오 
		 	90-100	a
		 	80-89	b
		 	70-79	c
		 	60-69	d
		 	나머지는 	f
		 */		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		switch (score/10) {  //정수/정수 = 정수 
		case 6: 
			System.out.println("D");
			break;
		case 7:
			System.out.println("C");
			break;
		case 8:
			System.out.println("B");
			break;
		case 9: 		//break를 안쓰면 다음 케이스로 넘어감! 
		case 10:
			System.out.println("A");
			break;
		default:
			System.out.println("F");
		
		}
		
		
		
		
		
		
		
		
	}

}
