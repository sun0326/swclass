package Class;

import java.util.ArrayList;

public class Wrapper2 {

	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		System.out.println(arr1.size());	// 0 	/값을 넣으면 크기가 늘어남 ! -> 가변길이 
							//arraylist의 길이확인
		// Arraylist는 객체를 다룸 (객체화 시켜서 값을 넣음 )
		// add로 값입력
		arr1.add(new Integer(300));				// multi data -> 모든 데이터형 + 객체를 입력받을수있음 
		arr1.add(new Double(100.7));
		arr1.add(new Character('A'));
		arr1.add(new String ("ondal"));		// ? 
					//arr1.add(300); // -> 객체취급하고는 안맞음
				
	
		System.out.println(arr1.size()); // 값을 넣은만큼 크기가 늘어남 
		System.out.println(arr1);
		
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}						// arraylist값을 꺼낼 때는 get
		// 순서가 있으므로 배열처럼 for문 사용 가능 
	}

}
