package Method;

public class method2 {

	public static void main(String[] args) {
		choki(); 		//메소드 호출문 (1)
		choongyo();		//메소드 호출문 (2)
		chool();		// (3)
		
	}//main-end

	private static void chool() {		//(3-1)
		System.out.println("결과출력");
		
	}

	private static void choongyo() {	//메소드 정의문(2-1)
		System.out.println("3의배수 구하기");
	}

	private static void choki() {		//메소드 정의문 (1-1)
		System.out.println("초기치 자리는 여기");
		
	}// choki()정의문-end

}// class -end
