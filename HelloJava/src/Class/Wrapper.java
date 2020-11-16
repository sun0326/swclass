package Class;

public class Wrapper {

	public static void main(String[] args) {
	/*
	 		int 	vs 	Integer(클래스화 ) (wrapper)
	 null 	사용 x 		사용 o 
	  연산 	사용 o		 unboxing해야 산술연산 가능
	 	-스텍메모리		- 힙메모리에 저장 
	 					 
	 					 sql의 null과 연동시 Integer와 연동
	 	
	 					
	 	(참고) Integer.parseInt() 	vs		Integer.valueOf()
	 		  int값 반환 , 연산 o				Integer 반환 , 연산 x
	 	
*/
		int aa =30;			//스텍에 저장
		Integer bb = aa ; 	//힙에 저장 		=>auto boxing (자동으로 넣어줌 )
		int cc = bb ;		//  =>auto unboxing
		
		
		
	}

}
