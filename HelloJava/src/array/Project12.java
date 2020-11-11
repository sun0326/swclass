package array;

public class Project12 {

	public static void main(String[] args) {
		// bubble sort - for문으로 
		// 10 ,90 , 100, 60, 70, 23
		//	0	1	 2	 3 	 4	 5	=> index
		// (01)(12)(23)(34)(45)	-> 5번값을구함  => 90	100	60	70	23	10
		// (01)(12)(23)(34)		-> 4번값을구함  => 100	90	70	60	23	10
		// (01)(12)(23)					
		// (01)(12)
		// (01)
		// 	=> 줄을 i, 열을 j라고할떄  열을 5번 , 줄을 5번 돌리면됨 
		// 100, 90, 70, 60, 23, 10 

		
		int[] k = {10, 90, 100, 60, 70, 23 };

		int tmp;
		for (int i = 0; i<k.length-1; i++) {		// 행
			for (int j = 0; j <k.length-1-i; j++) {	// 열
				if(k[j]<k[j+1]) {
					tmp = k[j];
					k[j] = k[j+1];
					k[j+1] = tmp;
				} //if-end		
			} //for-j-end =>한번돌때 한줄을 다 비교 :)
		}//for-i-end
		
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");
		}

		/*
		// sort여부를 sw로 확인후 sort되어있는 상태면 for문을 돌리지않고 break;
		int tmp;
		for (int i = 0; i<k.length-1; i++) {		// 행
			int sw=0;
			for (int j = 0; j <k.length-1-i; j++) {	// 열
				if(k[j]<k[j+1]) {
					tmp = k[j];
					k[j] = k[j+1];
					k[j+1] = tmp;
					sw = 1;
				} 	
			} 
			if(sw==0)
				break;
		}
		*/		
		
	}			
}
