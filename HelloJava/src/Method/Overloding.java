package Method;

public class Overloding {

	public static void main(String[] args) {
		// 오버로딩 
		//atoi (에이투아이 , 알파벳을 인티져로 바꾼다고 ? )
//		   atoi()		atof()		atol()    => 문자열에있는 10진수의 정수를
//		" 30" -> 30								int, double, long형으로 반환
//		"34.6" -> 346
// 가독성 이유로 
//		메소드 중복 (함수중복) :method overloading;
//							overriding(재정의)
//								ㄴ> ? 
//		overloalding의 조건
//		1) method의 이름이 같아야한다
//		2) 인자의 타입이 다르거나 갯수가 달라야한다
		
		//인자의 타입이 달라야 or 인자의 갯수가 달라야 
		
		int aa = 100;
		double bb =23.5;
		int x = 200;
		double y =300.7;
		kaja();
		kaja(aa);
		// 인자의 갯수가 다른경우
		kaja(x);  
		// => 오버로딩아님 , kaja(aa)와 인자타입과 갯수가 같으므로
		kaja(bb);
		// 인자의 타입이 다른경우 
		
	}// main-end
	
	
	private static void kaja(double bb) {
		
	}


	private static void kaja(int aa) {
		
	}

	private static void kaja() {
		//인자의 갯수를 비교해서 찾아감 	
	}
	
	

}
