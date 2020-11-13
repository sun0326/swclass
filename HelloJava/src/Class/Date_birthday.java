package Class;

import java.util.Date;

public class Date_birthday {
	public static void main(String[] args) {
		// 생일을 입력하면 살아온 날짜수 계산
		// 생일입력시 기준일에 오늘까지의 날짜수  = 기준일에서 생일까지의 날짜수 
		
		Date d100 = new Date(1000L); // 1000L = long integer / 1초 =1000ms
							//ㄴ 1초  : 기준점으로부터 1초 지난 시간을 찍어라 
		System.out.println(d100);
		System.out.println(d100.toLocaleString());	
		System.out.println(d100.toGMTString());	//
		/*
		 	Thu Jan 01 09:00:01 KST 1970
			1970. 1. 1 오전 9:00:01			// 한국은 GMT기준 +9 시간 
			1 Jan 1970 00:00:01 GMT
		*/

System.out.println();
		
		Date d1 = new Date(); //오늘날짜
		//Date mybirthday = new Date(년,월,일);		
		Date mybd =new Date(1991-1900,3-1,26); //1991.03.26 내생일		
		System.out.println(mybd);
		
		//get time() : Date to ms
		long cha =d1.getTime() - mybd.getTime(); //살아온날 ms
		
		System.out.println("오늘"+mybd.toLocaleString());
		System.out.println("내생일"+mybd.toLocaleString());
		
		double l = cha /1000/3600/24; 
						// ms / 1000 - 초
						// 	/3600 - 시간	/24  == > 살아온 날짜수
		
		System.out.println( l +"일");
	}

}
