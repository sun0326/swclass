package IF;

import java.util.Scanner;

public class Project6_bmi {

	public static void main(String[] args) {
		// bmi = 몸무게 / 키(m)의제곱
		// 30 이상 비만 25~30 과체중 20~25이상 정상 20미만 저체중

		Scanner sc = new Scanner(System.in);
		System.out.print("키 :");
		double h = sc.nextInt() * 0.01;
		System.out.print("몸무게 :");
		int w = sc.nextInt();

		double bmi = w / (h * h);
		// Math.pow(double a,double b) double a의 doubleb승
		// double bmi = w / Math.pow(h, 2)
		System.out.printf("bmi는 %.2f \n", bmi);

		if (bmi > 20) {
			if (bmi < 25) {
				System.out.println("정상");
			} else if (bmi < 30) {
				System.out.println("과체중");
			} else if (bmi > 30) {
				System.out.println("비만");
			}
		} else {
			System.out.println("저체중");
		}
		
	/*
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
		System.out.println(result);
 	*/

	}
}
