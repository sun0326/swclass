package array;

public class Project08_Q1 {

	public static void main(String[] args) {
		// 1, 2, 4, 7,11 		1 2 3 4
		// 3, 5, 8,12,16		2 3 4 4
		// 6, 9,13,17,20		3 4 4 4
		//10,14,18,21,23		4 4 3 2
		//15,19,22,24,25		4 3 2 1
										
		//빗줄기배열ㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹ
		//2가지방법있음
				// 풀어서 그룹으로 만드는방법 / ij비교해서하는방법 
		
		int[][]	num =new int [5][5];
		
		int n =1;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j]=n++;
			}
			System.out.println();
		}
		
		for (int k = 0; k < num.length; k++) {
			for (int k2 = 0; k2 < num[k].length; k2++) {
				System.out.print(num[k][k2] + " ");
			}
			System.out.println();
		}
		
	}

}
