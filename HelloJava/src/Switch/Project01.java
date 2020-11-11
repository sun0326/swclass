package Switch;

public class Project01 {

	public static void main(String[] args) {
		
		short sh1 =100;
		int i1 =sh1;
		
		// 묵시적 형변환 (implicit conversion)
		// short -> int  : 2바이트를 4바이트 안에 넣으므로 오류 x) 
		
		int soo7=23456;   //32767보다작은숫자를넣어야함..
		short sh2 = (short) soo7;
		
		// 개발자 책임 하에  int형을 short형으로 형변환할슈있다 
		//	= > cast연산자 !!!!!!!!!! / 자료의 형변환 
		
		System.out.println(sh2);  // -27577 
		
		
		//명시적 형변환 
		
		

	}

}
