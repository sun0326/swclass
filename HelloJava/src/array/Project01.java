package array;

public class Project01 {

	public static void main(String[] args) {
		// 배열 : 기억창고를 한꺼번에 잡아주는것 ; (아파트)
		
		// 선언후 값을넣을때
		int [] jum;
		jum =new int[3];
		
		// 선언하고 바로 값넣을때 
		int[] k = new int[3]; 
		int a [] = new int [3];
				// 크기가 3인 k배열 , a배열 선언 
		
		//index : 첨자 ( 0부터 시작 ~) 
		k[0] = 100;
		k[1] = 90;
		k[2] = 95;
		
		int tot = k[0]+k[1]+k[2];
		System.out.println(tot);

	}

}
