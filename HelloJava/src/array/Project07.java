package array;

public class Project07 {

	public static void main(String[] args) {
		// 1,4,7
		// 2,5,8
		// 3,6,9

		int [][] num = new int [3][3];
		
//		int sum = 0;
		for (int i = 0; i < num.length; i++) {		//열 
			for (int j = 0; j < num[i].length; j++) {		//행
				num[i][j] = 1+i+j*3;
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
	
	}

}
