package Method;

import java.util.Scanner;

public class Project02_2형식 {	// 메소드 2형식	=> 인자있음 

	public static void main(String[] args) {
	/*
		메소드2형식을 사용하여 윤년인지 알아내시오 , 
		이때 윤년알아내기하는 비서에게 교통비 10000원도 전달하시오
		단, 이때 인자는 2개 사용함 년도입력은 main에서함 
		출력형식:		차비 10000원 받았음
					2020년은 윤년
	 */
		Scanner sc = new Scanner(System.in);
		System.out.print("년도입력: ");
		int i = sc.nextInt();
		System.out.print("차비: ");
		int chabi = sc.nextInt();
		kajayoon(i, 10000); // 메소트 호출문 2형식 // 괄호안에 인자(인수,argument)를 받는다

	}// main-end

	private static void kajayoon(int i, int chabi) { // 메소드 정의문
		System.out.println("차비" + chabi + "원 받음");

		if (i % 4 == 0) {
			if (i % 100 == 0 && i % 400 != 0) {
				System.out.println(i + "년은 평년");
			} else {
				System.out.println(i + "년은 윤년");
			}
		} else {
			System.out.println(i + "년은 평년");
		}
	}
}
