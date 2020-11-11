package IF;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		
//		int soo1 = 2147483648;   => 범위가 넘어가서 에러
		int soo1 = 2147483647;
		int soo2 = 1;
		
		int soo3 = soo1 + soo2;
		
		System.out.println(soo3); 
		
		/*
		 i2갑을 입력받아 i2가 3의 배수이면 "거봐", 5의 배수이면 "아하", 
		 3과5의 공배수이면 "동시배수"를 출력하는 프로그램 작성 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int i2 = sc.nextInt();	// 키보드에 입력받은 문자 //30
				//int i2 = Integer.parseInt(sc.next());
				// 이것도 가능 
				// 입력받을땐 문자임! 문자를 숫자로 바꿔쥼   
		
			/*
			 c언어)getchar()를 연속해서 사용할경우 값을 getchar를 쓰는만큼 값을 넣어줘야하는데 
			  여러개의 값을 넣고 마지막 엔터에서 값이 저장이됨 그래서 연속으로 받을경우엔 
			  값, 엔터 , 값 만 들어가는 경우가 있음 
			  이런경우를 방지하기 위해서 java에서도 nextInt()를 여러번쓰면 같은 에러가 발생할수있으므로
			  [Integer.parseInt(sc.next());]로 문자로 받아서 숫자로 바꿔주는 메소드를 사용하는게 좋음  
			*/
		
		if (i2 % 3 == 0 && i2 % 5 == 0)
			System.out.println("동시배수");
		else if(i2 % 3 ==0)
			System.out.println("거봐");
		else
			System.out.println("아하");
		
		/*
		 1~100사이의 정수를 입력받아 50이상이 들어왔으면 50보다 커를 출력
		*/
		System.out.print("숫자입력1~100 :");
		int num =sc.nextInt();
		if(num>50) {
			System.out.println("50보다크다");
			}
		else {
			System.out.println("50보다 크거나 같다");
		}
		
	}

}
