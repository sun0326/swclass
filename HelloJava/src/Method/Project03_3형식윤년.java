package Method;

import java.util.Scanner;

public class Project03_3형식윤년 {

	public static void main(String[] args) {
		/*
		 * 메소드 3형식을 사용하여 윤년인지 알아내시오 
		 * 단, 년도입력은 main()에서 / 윤년,평년 계산은 정의문에서 
		 * 윤년, 평년의 출력은 main()에서 하세욤
		 * 
		 * 출력형식 : 년도입력 : 2020
		 * 			아하~ 2020년도는 윤년
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하시오. : ");
		int i = sc.nextInt();
//		kajayoon(i); 	=> 2형식
		
		// => 3형식
			// 값을 받아서 변수명에 저장해서 사용하는 경우 
		String st = kajayoon(i);	
		System.out.println("아하 " + i + "년도는 " + st);
			// 값을 바로 출력하는경우  
		System.out.println(kajayoon(i));
		
	}
					// 반환형 (return type)
	private static String kajayoon(int i) {

		if (i % 4 == 0 && i % 100 != 0 && i % 400 == 0) {
			return "윤년";
//			System.out.println(i + "년은 윤년");
		} else {
			return "평년";
//			System.out.println(i + "년은 평년");
		}
	}

}
