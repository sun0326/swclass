package array;

public class Project05_2차원 {

	public static void main(String[] args) {
		//2차원배열 
		// 10ㅁㅁ	=> 0층 (0호,1호,2호)
		// ㅁ50ㅁ  	=> 1층 (0호,1호,2호)
		
//		int [][] pyo = new int [2][3];
						 //층수(행), 호수(열)
		
//		pyo[0][0] = 10;
//		pyo[1][2] = 50;

//		int [][] pyo = {10,20,30,40,50,60}; -error
//		=> 2차원배열이여도 1차원배열개념으로 처리가 되기때문에 안됨
		
		int[][] pyo = {
				{10,20,30},		//10 20 30   =>열이먼저변하고 행이변함
				{40,50,60}		//40 50 60	
		}; //층을나눠주는 부분을 알려줘야함
			
		for (int i = 0; i < 2; i++) {		// 배열은 무조건 0~ 작다로
			for (int j = 0; j < 3; j++) {	// => 먼저변하는데를 안쪽으로오오 
				System.out.print(pyo[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
								// -> 층수! 배열의 길이는 층수! 
		for (int i = 0; i < pyo.length; i++) {	
			for (int j = 0; j < pyo[i].length; j++) {	//->열의 길이는 배열[층]의 길이로! 
				System.out.print(pyo[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
