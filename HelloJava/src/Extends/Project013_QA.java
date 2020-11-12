package Extends;

import java.util.Scanner;

/*
 부모 자녀 클래스를 사용하여 객체의 형변환 프로그램 작성 
 결과 : 어느차를 타겠습니까 ? (1=부모차 ,2= 자녀차)
*/
class Boomo3 {
	public void car() {
		System.out.println("부모차 타고 ");
	}
}

class Janyu3 extends Boomo3 {
	public void car() {
		System.out.println("자녀차 타고 ");
	}
}

public class Project013_QA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("어느차를 타겠습니까 ? (1=부모차 ,2= 자녀차)");

		int sel = sc.nextInt();
		Boomo3 p77 = null;			/// 객체를 하나만 만들어서 사용! 
		switch(sel) {
		case 1: 
			p77 = new Boomo3();
			p77.car();
			break;
		case 2:
			p77 =new Janyu3();
			p77.car();
			break;
		default:
			System.out.println("다시선택");
		}
		
		
		
	}
}
