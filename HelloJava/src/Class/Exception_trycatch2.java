package Class;

import java.util.Scanner;

public class Exception_trycatch2 {	//예외처리
public static void main(String[] args) {
	
	try {
	Scanner	sc = new Scanner(System.in);
	System.out.print("첫번째수는 : ");
	String one1 =sc.nextLine();
	int soo1 =Integer.parseInt(one1);
	System.out.print("두번째 수는 : ");
	String two1 =sc.nextLine();
	int soo2 =Integer.parseInt(two1);
	System.out.println(soo1/soo2);
	
	int bada = kaja(soo1,soo2);	
	System.out.println(bada);
	
	} catch (Exception e){	// 예외처리 조상 클래스이름은 Exception / -> Exception 클래스의 객체 e 
		System.out.println("에러났댜  "); 
		System.out.println("여기서 에러를 처리한다!");
		System.out.println("0이아닌 두개의 정수를 입력하세요");
		System.out.println(e);	//.toString();
		System.out.println(e.getMessage());	//by zero -> 0으로 나눴댜 
		//c: errno 4069 자바: message
	} finally {
		System.out.printl
		n("goood :)");
		//Db접속시 close , 파일 close 
	}
	
	
}

private static int kaja(int soo1, int soo2) 
		throws ArithmeticException{  //-> try catch를 줄여쓴것  / 둘중하나 사용ㅇ 
		// 에러 처리 부분이 없음 					// 에러처리부분이있음 	
		// 둘다 같은용도로 사용 되므로 에러처리부분이 없으면 throws로 사용 ㄱㄱ 
//	if (soo2 ==0) {
//		System.out.println("0으로 나눌수없다 ");
//		throw new ArithmeticException(); // throw
//	}
//	else
		return soo1 / soo2; 
/*	
  	throws ArithmeticException = try{ } catch(ArithmeticException e) {   }
  	
  	throw(메소드내 상위블럭으로 예외를 던짐) , throws (에러를  상위 메소드로(main) 던져서 상위에서 처리)
  	
*/	
}
}
