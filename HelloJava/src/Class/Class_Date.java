package Class;

import java.util.Date;

public class Class_Date {

	public static void main(String[] args) {
/*	1)사용자 정의 클래스 (user defined class)
 * 		설계(정의) - 제작(new,생성) - 사용 	의 3단계
 * 	2) 내장클래스 
 * 		Scanner, System, ....
 * 		Date
*/
		//import 선택시 - " java.util.Date "
		//(참고) System 클래스 : java.lang인데 안씀 
		// import 패키지명 . 클래스명 ex)import java.util.Date
		Date d1 = new Date(); // 메모리(힙)에 오늘날짜 지금시간이 들어감 , 이 위치를 d1일 가리킴 (1단계생략 : 설계는 되어있고 객체생성후 사용가능) 
						//window.location= "http://www.naver.com"
						//   객체.속성 = 값  ->사용 (2단계생략 : 객체까지  만들어져있고 바로 사용가능 :jsp) 
		
		System.out.println(d1);	// toString() 오버라이딩 
		
		System.out.println(d1.toLocaleString());
								//ㄴ 오래된것
		
		int year = d1.getYear()+1900; // window기준점이 1900년도 이므로 실제값을 구할때는 +1900 
		int month =d1.getMonth()+1;   //배열처럼 0부터 시작 0 -> 1월
		//getDay:0~6 ->일~토
		String yoil = args[d1.getDay()];
		
		String str1 ="오늘은";
			str1 += year+"년 ";
			str1 += month+"월 ";
			str1 += d1.getDate();
			str1 += yoil+"요일";
		System.out.println(str1);
		
		// 오늘부터 100일 -> 오늘 포함이므로 + 99 해야함 
		Date d7 = new Date(); 
		d7.setDate(d7.getDate()+100-1);//+99는 알아보기힘드므로 +100-1로 표기하는게 좋음
				//객체를 만들어서 날짜를 가져온다음 +99해서 set으로 다시넣어줌 
		System.out.println(d7.toLocaleString());

	}

}
