package String;

import java.util.Scanner;

public class toCharArray {

	public static void main(String[] args) {
	/*
	 문자열을 입력받아 첫번째, 3번쨰 글자를 바꾸어 출력하시오 ( 메소드 2형식 사용 
	 예 ) ondal-> oadnl	단, String과 char[]사용
	 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("글자입력");
//		String name =sc.nextLine();
//		kaja(name);
		
		kaja(args);///// String [] aa = {"ondla","kongjoo"}
								// ㄴargs []  
	}

	private static void kaja(String [] str) {
		char [] ch = str[0].toCharArray();	//toCharArray-> 문자열이 하나씩 잘라져서 char배열로 들어감 
		//배열의 위치변경
		char tmp= ch[1] ;
		ch[1] =ch[3];
		ch[3] =tmp;
		
		for (int j = 0; j < str[0].length(); j++) {
			System.out.print(ch[j]+"\t");
		}
		System.out.println();
		
		//잘라진 배열을 하나로 묶어주는것 [String 변수명 = new String (쪼개진char배열) ] -> for문을 돌리지않고도 출력가능 
		String str2 = new String(ch);
		System.out.println(str2);
		
	}
	
	 

}
