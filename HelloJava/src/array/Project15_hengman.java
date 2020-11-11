package array;

import java.util.Scanner;

public class Project15_hengman {

	// 이번주까지 풀어서 내기 
	// ----- ㅇㅖ상글자입력:
	// a
	// a---- 1번시도
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] apple = "apple".split("");
		
		for (int i = 0; i <13; i++) {
			System.out.println("_____");
			System.out.print("예상글자입력:");
			String a = sc.nextLine();
			if(apple[i].equals(a)) {
				System.out.println([i]);
			}
		}
		
		
		

	}

}
