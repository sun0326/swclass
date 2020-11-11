package Method;

import java.util.Scanner;

public class Project04_bmi {

	public static void main(String[] args) {
	/*
		bmi 키, 몸무게는 main()에서 받고 
		계산은 메소드가 
		출력은 main()
	*/
		Scanner	sc = new Scanner(System.in);
		System.out.print("키 : ");
		int h = sc.nextInt();
		System.out.print("몸무게 : ");
		int w = sc.nextInt();
		
		bmi(h,w);
		String result = bmi(h,w);
		System.out.println(result);
	
	}

	private static String bmi(int h, int w) {
		double bmi = w / (h * h);
		String result;
		
		if(bmi >= 30) {
			result = "비만";
		} else if(bmi >=25) {
			result = "과체중";
		} else if(bmi >=20 ) {
			result = "정상";
		} else {
			result = "저체중";
		}
			return result;
	}

}
