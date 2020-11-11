package array;

public class Project04 {

	public static void main(String[] args) {
	/*
		5개수를 배열을 사용하여 전달한후 배열 역순으로 출력하시오
	*/
		
//		int[] num = new int[5];		//1 차원 배열 (단층아파트)
		int [] num = {1,2,3,4,5};
		
		kaja(num);
		}

	private static void kaja(int[] num) {
		
		for (int i = num.length -1; i >= 0; i--) {
			System.out.print(num[i]);
		}
	}
	
	

}
