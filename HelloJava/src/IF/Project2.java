package IF;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		
		System.out.println(10/3);
		/*
		 정수/정수 =정수
		 정수/실수=실수
		 실수/정수=실수
		 실수/실수=실수
		*/
		
		//짝수 판별 : 수를 2로나눠서 나머지가 0 일때
		System.out.println(10%3); //1
		// %연산자 -나머지를 구하는 연산자 
		
		//and &&
		//or  ||
		
		int i = 100;
		if(i%3 ==0) {
			System.out.println("3의배수");
		} else if(i%5 == 0) {
			System.out.println("5의배수");
		} else {
			System.out.println("3의배수, 5의배수가 아님");
		}
			
		
		
	}
}

