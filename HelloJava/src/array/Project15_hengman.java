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
		String [] answer = {"_","_","_","_","_"};
		
		while(true) {
			System.out.println("_____");
			System.out.print("예상글자입력:");
			String alp = sc.nextLine();
			for (int j = 0; j < answer.length; j++) {
				if(apple[j].equals(alp)) {
					answer[j] =alp;
//					System.out.print(answer[i]);
				
			}
				}
			}
		}
		
		
		

	}

}
