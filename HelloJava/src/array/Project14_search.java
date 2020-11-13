package array;

import java.util.Arrays;

public class Project14_search {

	public static void main(String[] args) {
	/*
 		<검색의 종류>
 		순차검색 (sequence search)
 		1시도  1번째 찾음
 		2시도 100번째 찾음 
 		평균검색 횟수 :(1+100) /2 =50		=> (n+1)/2
 		
 		이진검색 (binary search) 업다운 ? 
 		-반드시 sort된 상태에서!
 		가운데와 비교해서
 		평균 검색 속도 : log2n+1 
	*/
		int [] arr = {11,84,45,78,34,9,2};
		int sw = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==-78) {
				System.out.println("0번째 부터 시작해서 " + i + " 번째 있다.");
				sw = 1;
			}
		}
		if(sw == 0) {
			System.out.println("없댜");
		}
		
		// Arrays.binarysearch() -------- 있는것찾아보쟈 
		Arrays.sort(arr);
		System.out.println("78은 " + Arrays.binarySearch(arr, 78)+ " 번쨰있다.");
			// 없는수를 찾을땐 문제가생김 ! 
		
		//값이있는경우
		if (Arrays.binarySearch(arr, 78)>=0) { // 값이있냐고 물어봄
			System.out.println("찾음");
			System.out.println("0번부터시작해서 "+ Arrays.binarySearch(arr, 78)+ "번째에 있다");
		} else //없으면 이것이 답
			System.out.println("없다");
		
	}

}
