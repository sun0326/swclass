package For;

public class Project05_for {

	public static void main(String[] args) {
	/*
		별찍기
		*****
		*****
		*****
		 => 1. 패턴 : 열 -> 행 순서로 변함  (먼저변하는게 안쪽!!!! ) 
		 	2. 시작점과 끝점 확인
	 */
		for (int i = 1; i <=3; i++) {	// 가로
			for (int j = 1; j <=5; j++) {		// 세로
				System.out.print("*");
			}
			System.out.println(); 	//line-skip
		}
		
		System.out.println("==========================");
		
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 	=>1. 패턴 :열 ->행 순서로 변함 
		 	  2. 행 : 1->5 , 열: 1 ~ 변함 => 변하면 비워둠 ^^;
		 	  						나중에 찾는걸로...
		*/
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		/*
		    *
		   ** 
		  *** 
		 ****
		*****

		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			
		}
		
		
		System.out.println("==========================");
		
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 	=>1. 패턴 :열 ->행 순서로 변함 
		 	  2. 행 : 1->5 , 열: 5 ~ 변함 		 	  						나중에 찾는걸로...
		*/
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j-i >= 1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
