package Extends;

import java.util.Scanner;

/* 추상화 (abstraction)
 	가독성, 다형성 (polymorphism) 때문에 사용함 
  	과일
  	사과	 배	 감
  interface 나 abstraction 모두 전제조건이 "상속에 있어서" 
*/
	// 사과클래스를 먼저 만들고 그앞에다가 kwail을 만든다
abstract class kwail{	// 일반클래스 -> 추상클래스 : class 앞에 abstract 추가
	public void good() {
		System.out.println("먹으면좋아");
	}
	public abstract void mukja(); //추상메소드 -구현 x / 추상메소드를 사용하는 클래스에는 abstract를 붙여줘야함
		// 구현x, 선언o 구현은 자식클래스에서 한다 
		// interface 와 abstracrt는 사촌지간 ? (interface보다 조금 상세한 설계도)
}
class sakwa extends kwail {//상속 
	public void mukja() {
		System.out.println("사과를 사곽사곽");	
	}
}
class bae extends kwail{
	public void mukja() {
		System.out.println("배는 배즙으로");
	}
}
class gam extends kwail{
	public void mukja() {
		System.out.println("감은 영감");
	}
}
	
public class Project03_abstraction {
	public static void main(String[] args) {
		kwail k1 =new sakwa();
		k1.mukja();
		kwail k2 = new bae();
		k2.mukja();
		kwail k3 =new gam();
		k3.mukja();
		// 같은 mukja()에서 서로다른것을 처리 ->다형성
		k3.good();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1=사과 ,2=배,3=감");
		int sel =sc.nextInt();
		kwail kw = null;
		switch(sel) {
		case 1 : 
			kw = new sakwa();
			kw.mukja();
			break;
		case 2 : 
			kw = new bae();
			kw.mukja();
			break;
		case 3 : 
			kw = new gam();
			kw.mukja();
			break;
		default:
			System.out.println("1~3까지만 입력");
		}
	}

}
