package String;

import java.util.Scanner;

public class Project02_indexof {

	public static void main(String[] args) {
		// indexOf("ondal") ->문자를 포함하는 ,문자가 몇번째자리에있는지 찾는것
		/*
		 * 책이름을 배열에 넣은후 java책을 모두 검색하는 순차 검색 프로그램을 작성 (자바책이 있을경우 결과 _ java Programming
		 * easy java programming Master of JAVA C Language and java oracle and Java_JDBC
		 * (자바책이 없을 경우 _ 검색하신 책은 재고가 없습니다.
		 * 
		 */
		String[] title = { "java Programming", "C# programming", "easy java programming", "Master of JAVA",
				"C Language and java", "oracle and Java_JDBC" };

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();	// java 입력받음
		str = str.toUpperCase();	// 대문자로저장 
		
		int sw = 0;
		for (int i = 0; i < title.length; i++) { 
									// 찾는 문자가 있으면 >=0 , indexOf 에서는 없으면 -1 ,!= -1도됨
			if (title[i].toUpperCase().indexOf(str) >= 0) {
				System.out.println(title[i]);
				sw = 1;
			} // if-end
		} // for-end
		if (sw == 0) {
			System.out.println("재고없음");
		}

	}
}
