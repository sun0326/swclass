package Class;

import java.util.ArrayList;

public class generic_AddSet {
	public static void main(String[] args) {
/*	<generic>
	  배열과 컬렉션의 장점을 따서 만들어보자 
	  가변길이 배열 + one data type
	  
	  형식은 (문자열만 들어갈 경우)
	  ArrayList <String> arr3 = new ArrayList<String>();
	  객체만 들어가게 할 경우
	  ArrayList <SMarket> arr3 =new ArrayList<SMarket>();
	  			//객체 클래스명
*/	
		// 문자열만 들어가는 ArrayList 객체 arr1생성하기
					// generic
		ArrayList<String> arr1 = new ArrayList<String>();
		System.out.println(arr1.size());
		
		//arr1.add(30);
		arr1.add("빵");
		arr1.add("라면");
		arr1.add("우유");
		arr1.add("김밥");
		
//		System.out.println(arr1.size());   -> 4
		
		// 내용 수정은 set, 삭제는 remove
		arr1.set(1, "과자");	// 1번을 라면 -> 과자로 수정
		arr1.remove(2);		// 2번 우유 삭제
		arr1.remove("빵");	// 0번 빵삭제 
		// 결국 있는것은 과자, 김밥  / 삭제시 길이도 줄어듬 
		
//		System.out.println(arr1.size()); 	-> 2
		
		// ArrayList 입력은 add()  출력은 get(i)
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));	// 과자, 김밥
		}
		for(String imsi: arr1) { 
			// for : => ?arr1에서 첫번째것을 꺼내서 imsi에 넣고 출력 , 반복  , 다 출력될때까지 
			// 갯수를 모를때사용 (size를 모를때? 쓸수없을떄? ) 
			System.out.println(imsi);// 과자, 김밥
		}
	}
}