package array;

public class Project10 {

	public static void main(String[] args) { 
		/*
		// 입사시험에 나올만한문제
		 배열의 두수를 맞바꾸시오
		*/
		int [] k = {90,100};
		
		int tmp = k[0];
		k[0] = k[1];
		k[1] = tmp;
		
		for (int i = 0; i < k.length; i++) {
			
			System.out.println(k[i]);
		}
		
		/*
		 //zigzag
		int tmp = k[1];
		k[1] = k[0];
		k[0] = tmp;
			=> 지그재그순서로 내려옴 값을넣는 순서는 상관없음 
		*/

	}

}
