package Extends;

interface Samchon { // 상속역할 , 상부구조이므로 위에써야됨
	void isBoat(); // 선언 ㅇ , 구현 x child class 에서 구현
					// public x
}
interface Gomo{
	void gold();
}

class Booja {
	public void manaDon() {
		System.out.println("많이벌었다~~~~~~~~~");
	}
}

class Na extends Booja implements Samchon,Gomo { 
	// Na에 빨간줄이 생기면 클릭해서 메소드 만들기
	public void useDon() {
		System.out.println("많이사자~");
	}

	@Override
	public void isBoat() { // 자식클래스에서 구현할수있음!
		System.out.println("보트타고 여행다니자~");
	}

	@Override
	public void gold() {
		System.out.println("금도 받았댜");
	}
}

public class Project021_MultiInheritance {

	public static void main(String[] args) {

		Na n1 = new Na();
		n1.manaDon(); // 원래 내가 가진것
		n1.isBoat(); // 상속된것 (interface)
		n1.useDon(); // 상속된것 (extends)
		n1.gold();
// 결국 설계도를 대충그린 interface방법으로 다중상속을 할수있다
		
		
	}

}
