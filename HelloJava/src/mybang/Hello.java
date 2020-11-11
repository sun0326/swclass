package mybang;

import java.util.Date;

public class Hello {

	public static void main(String[] args) {
		Date d1 = new Date(); 	//import 해줘야 사용가능!
		System.out.println(d1.toLocaleString()); //화면출력명령
							//선그려지는건 옛날명령이란뜻 무시하면됨
		System.out.println(); //line-skip , 줄바꿈
		System.out.println("날짜출력끝");
		
		//c언어방식 (jdk1.5~가능해짐)
		System.out.printf("%d번 버스타고 집감\n",30); 
		System.out.printf("%f 원주율은 %.2f \n",3.141592,3.14);
							//틀을 만들어놓으면 ,뒤에 숫자가 차례로 틀에 들어간다
		/*
		 %d = 정수
		 %f = 실수    %.2f = 소수점아래두번째까지 
		*/
		
		//JAVA방식
		System.out.println("30번 버스타고 간다");
		int n= 30;
		System.out.println(n+"번 버스타고 집간다");
		
		//자료형 변수명 = 값
		int aa =30;
		
		/*
		 int 4byte / 정수
		*/
		//달에서의 내 몸무게는 지구에서의 몸무게의 약 17% 라고 한다
		//지구에서의 내 몸무게를 저장하고 이를 달에서의 몸무게로 변환하여 출력
		
		int earth_w = 100 ;
		double moon_w = earth_w * 0.17 ;
		
		System.out.println("지구몸무게=" + earth_w +", 달몸무게" +moon_w);
		

	}

}
