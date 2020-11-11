package IF;

import java.util.Date;
import java.util.Scanner;

public class Project5_윤년 {

	public static void main(String[] args) {
		// i 해가 윤년인가 ?
		// (4년단위로 윤년, 100년 마다 평년, 400년 마다 윤년 )
		//  4의 배수 		100의 배수	  400의 배수
		//   % 4 ==0	% 100 !=0	  % 400 == 0     => 윤년 조건 
		//ex) 2020 % 4 == 0  &&  2020 % 100 !=0  ||  2020 % 400 == 0 

		Scanner sc = new Scanner(System.in);
		System.out.print("몇년도? : ");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				System.out.println(year + "년은 평년");
			} else {
				System.out.println(year + "년은 윤년");
			}

		} else {
			System.out.println(year + "년은 평년");
		}
		
		/*		
  		if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		*/
		
	}  			

}
