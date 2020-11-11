package array;

public class Project06 {

	public static void main(String[] args) {
		/*
		 	1,2,3
		 	4,5,6
		 	7,8,9
		*/
		int [][] pyo = new int[3][3];
		
		
		int num=1;
		for (int i = 0; i < pyo.length; i++) {
			for (int j = 0; j < pyo[i].length; j++) {
				pyo[i][j] = num++;
			}
		}
		for (int i = 0; i < pyo.length; i++) {
			for (int j = 0; j < pyo[i].length; j++) {
				System.out.print(pyo[i][j]+" ");
			}
			System.out.println();
		}

	}

}
