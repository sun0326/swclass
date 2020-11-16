package Class;

import java.util.Scanner;

public class Exception_trycatch {	//예외처리
public static void main(String[] args) {
	/*	try {
		에러가 날수도있는 부분을 묶어줌
	} catch (Exception e) {
		에러가 났을때 처리하는 부분 
	} finally {
		에러유무와 상관없이 무조건 처리 
	}
	 */
	
	try {
	Scanner	sc = new Scanner(System.in);
	System.out.print("첫번째수는 : ");
	String one1 =sc.nextLine();
	//빈칸포함 한줄 다 입력 
	//nextLine()은  i love you 한줄 다읽음 
	//but next()는 i 만 입력됨 
	
	int soo1 =Integer.parseInt(one1);
	
	System.out.print("두번째 수는 : ");
	String two1 =sc.nextLine();
	int soo2 =Integer.parseInt(two1);
	System.out.println(soo1/soo2);
	} catch (Exception e){	// catch 부분 없이 에러가 날경우 프로그램에서 에러메세지가 뜸 
		System.out.println("에러났댜  " + e); //e로 에러메세지를 받음 !
	} finally {// 생략가능
		System.out.println("goood :)");
	}
	
	
}
}
