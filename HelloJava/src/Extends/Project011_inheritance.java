package Extends;
// overriding
// 객체의 형변환 

class Boomo {

	protected int diamond;

	public void don() {
		System.out.println("재산많아~");
	}
	public void car() {
		System.out.println("부모차 ");
	}
}

class janyu extends Boomo {
	public void car() {	// overriding
		diamond = 3;
		System.out.println("자녀도 차있음 ");
	}
}

public class Project011_inheritance {
	public static void main(String[] args) {
		Boomo b1 = new Boomo();
		b1.don();
		b1.car();	// 부모차
		
		janyu j1 = new janyu();
		j1.car();	// 자녀차 
		j1.don();
		System.out.println(j1.diamond); // 객체,속성
		
		// 객체의 형변환  => 상위클래스가 하위클래스로 형변환 가능 , 하위클래스가 상위클래스로 형변환 불가능 **
		Boomo b2 =j1; // 맞는문법
		//b2는 부모의 객체 , j1은 자녀의객체 / 부모 객체로 자녀를 가르키고 있음 !
		//Boomo b2 = new janyu //맞음
		//		Integer num1 = new Integer(0);
//		int num2 = 0; -> 민규가 알려준 이해법.
		b2.car();
		
//		janyu j2 = b1;  // 안됨 
		// januy j2 = new Boomo(); //안됨
		// 부모객체가 만들어지고 ,j2 는 부모를 가르키......... 빨간줄 ? 
		// 자녀의 메소드 부모의 것이기 때문에
		
//		janyu j2 = b2; // 안됨
//		janyu j2 = new janyu;
		// b2는 부모라서 ?
		janyu j2 = (janyu)b2;  // 이렇게쓰면됨 
					// 캐스팅연산자를 사용해서 자녀인것을 알려줘야 사용할수있음 
		
//		janyu j3 = (janyu)b1;
					//b1은 부모객체
		// janyu j3 = new Boomo 의 의미 ...// compiler o , 실행 x 
		
		Boomo b5 = new janyu();
		b5.car(); 
		// boomo가 형변환을안하면 본인차를탐 , janyu로 형변환하면 자녀차를타고감 
		//  => 형변환을 이용하면 필요에따라서 같은매소드를 바꿔사용할수있음  
		
		
		
	}
}

