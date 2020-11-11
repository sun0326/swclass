package While;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// 1.짜장 , 2.짬뽕 => 맛있게드세요
		// 다른번호 => 다시메뉴출ㄹ력
		Scanner sc = new Scanner(System.in);
		String num;
 
		do {
			System.out.println("====메뉴선택====");
			System.out.println("1.짜장 , 2.짬뽕");
			System.out.print("선택메뉴 :");
			num = sc.nextLine();
			

		} while (!num.equals("1") && !num.equals("2"));     //값(내용)비교!
			System.out.println("맛있게드세요");
		
	}

}
