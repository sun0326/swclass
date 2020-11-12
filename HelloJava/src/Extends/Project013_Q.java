package Extends;

import java.util.Scanner;

/*
 부모 자녀 클래스를 사용하여 객체의 형변환 프로그램 작성 
 결과 : 어느차를 타겠습니까 ? (1=부모차 ,2= 자녀차)
*/
class Boomo2 {
	public void car() {
		System.out.println("부모차 타고 ");
	}
}

class Janyu2 extends Boomo2 {
	public void car() {
		System.out.println("자녀차 타고 ");
	}
}

public class Project013_Q {
	public static void main(String[] args) {
		Boomo2 b1 = new Boomo2();
		Boomo2 b2 = new Janyu2();

		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("어느차를 타겠습니까 ? (1=부모차 ,2= 자녀차)");
		int num = sc.nextInt();

		if (num == 1) {
			b1.car();
			break;
		} else if (num == 2) {
			b2.car();
			break;
		} else {
			System.out.println("다시선택");
		}
		}
	}
}
