package array;

import java.util.Arrays;

public class Project11_sort {

	public static void main(String[] args) {
		// 다음 배열을 소트하여 오름차순 및 내림차순으로 출력하시오
		// sort (정렬) :key(기준) , 차순(ascending, discending) => 둘다있어야함
			//내부소트 (memory sort)	: radix, selection, bubble, insertion, shell, ....
				//selection : 1번자리부터 값을비교해서 제일높은 값을 1번자리로
				//bubble	: 옆자리랑비교해서 위치를 맞바꿈
				//quick		: 
			//외부소트 :disk등 외부장치를 이용해서 정렬	: 2-way merge sort , k-way .... 
		
		int [] bae = {10,90,100,60,70};	
		
		Arrays.sort(bae);		//import 안되면 ctrl+shift+o
		// 오름차순 	//배열의 대표명
		
		for (int i = 0; i < bae.length; i++) {
			System.out.print(bae[i]+"\t");
		}
		System.out.println();
		
	// 내림차순은 없으므로 오름차순으로 정렬훈 역순으로 출ㄹㄹㄹ력 
		for (int i = bae.length-1; i >=0 ; i--) {
			System.out.print(bae[i]+" ");
		}
		System.out.println();
		
	}
}
