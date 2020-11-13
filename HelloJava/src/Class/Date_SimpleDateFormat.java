package Class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_SimpleDateFormat {
	public static void main(String[] args) {
		Date d3 = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년MM월dd일E요일 H:mm:ss");
		// HH는 24시간
		System.out.println(sdf1.format(d3));
		
		System.out.println();
		// ----------자바 날짜 To sql날짜 (import 선언은 java.util만 한다)
		Date d11 = new Date(); //자바날짜
		java.sql.Date s11 = new java.sql.Date(d11.getTime()); //db날짜 : 시간없이 '날짜'만 취급함 
		//import한것과 동일  
		System.out.println(d11);	// 시간 ,날짜 나옴 
		System.out.println(s11);	// sql에서 Date의 의미는 only날짜만!
		
		System.out.println();
		//-----------sql날짜 To 자바날짜 
		Date d22 = new Date(s11.getTime());
						// rs1.getDate("hire_date").getTime();
		System.out.println(d22); 	// 시간과 날짜 
	}
}
