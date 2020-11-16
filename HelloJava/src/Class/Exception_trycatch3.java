package Class;

import java.util.Scanner;

public class Exception_trycatch3 {	//예외처리
public static void main(String[] args) {
	
	try {
	Scanner	sc = new Scanner(System.in);
	System.out.print("첫번째수는 : ");
	int soo1 =Integer.parseInt(sc.nextLine());
	System.out.print("두번째 수는 : ");
	int soo2 =Integer.parseInt(sc.nextLine());
	System.out.println(soo1/soo2);

	// 세부적인 에러체크를 할경우 catch를 여러개 사용할수있음 
	// 주의할점 ? : 조상보다는 후손을 앞에쓰? ........ 
	/*		ArithmeticException의
			조상클래스는 RuntimeException이고
			그 위에 조상클래스가 Exception임	
	*/
	} catch (NumberFormatException e){	 
		System.out.println("숫자로 입력!!!!!"); 
	} catch (ArithmeticException e) {
		System.out.println("0이 아닌 값으로 입력");
	} catch (Exception e) {	
		System.out.println("다른예외처리");
		System.out.println(e);	
		System.out.println(e.getMessage());	 
	} finally {
		System.out.println("goood :)");
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
