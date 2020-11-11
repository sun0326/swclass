package array;

import java.util.Arrays;

public class Project13 {

	public static void main(String[] args) {
		// 로또  중복배제
											//1~45		=> ceil 올림 , floor : 내림  ,round : 반올림 
											//0.00005~44.77777..  =>45*
											//0.00001~0.99999     =>Math.random
							//(int)Math.ceil(45*Math.random())
		
		int [] lo = new int [6];
		
		for (int i = 0; i < lo.length; i++) {
			lo[i] =(int)Math.ceil(45*Math.random());
			for (int j = 0; j < i; j++) {// 중복이되면 		// 처음엔 j<0 이므로 아예 안돌고 넘어감
				if(lo[i] ==lo[j]){
					i--;				// i--로 i위치를 다시 추출할수있게한다.
				}
			}
		}
		
		Arrays.sort(lo);	// 오름차순으로으로 sort
		
		for (int i = 0; i < lo.length; i++) {
			System.out.print(lo[i] + " ");
		}



		
		
		
		
		
		
		
		
		
/*		Random r = new Random();
		
		for (int i = 0; i < lo.length; i++) {
			lo[i] = r.nextInt(45)+1;
		}
		for (int i = 0; i < lo.length; i++) {
			
			System.out.print(lo[i]+",");
		}*/

	}

}
