package For;

public class Project06_for {

	public static void main(String[] args) {
		/*
	////*
	///** 
	//*** 
	/****
	*****
	
	=>  행이 더 천천히 도니깐 행(i)를 바깥쪽에 
		 j ㅑ

	*/
/*
		for (int i = 1; i <= 5  ; i++) {
		
		for (int j = 4; j >=i    ; j--) {
			System.out.print(" ");
		}
		for (int k = 1; k <= i ; k++) {
			System.out.print("*");
		}
		System.out.println();
		
		}
*/	
		/*	i(열)	j(/)	k(*)
		 	1		4		1
		 	2		3		2
		 	3		2		3
		 	4		1		4
		 	5		0		5
		 		=>j = 5-i	=> k =i 
		*/

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=5-i ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	}

}
