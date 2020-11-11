package IF;

public class Project4_equals {

	public static void main(String[] args) {
		
		String ppp=null;
		String qqq =""; // 빈문자열 , 길이가 0인 문자열  
		
		//문자 : 한문자 'A' , 문자열 : 여러문자 "A" , "tom"
		
		
		String yy = "ondal";
		
		//System.out.println(ppp.length()>0)); //null pointer error
		//System.out.println(qqq.length()>0)); //false
		
		String aa = "ondal";
		String bb = "ondal";
		if(aa==bb)			// => 번지비교 
			System.out.println(aa+"\t"+bb);
	
		if(aa.equals(bb))   // => 내용비교 
			System.out.println(aa+"\t"+bb);			

		String aa2 ="ondal2";
		String bb2 ="ondal3";
	
		if(aa2==bb2)			// => 번지비교 
			System.out.println("값이안나옴!!");
		
		if(aa2.equals(bb2))   //함수,메소드 //값비교 
			System.out.println("값이안나옴! ");			
		
		String cc= new String("ondal");
		String dd= new String("ondal");
		
		if(cc==dd)
			System.out.println("번지가다르면 이것은 출력안함");
		if(cc.equals(dd))
			System.out.println("값이 같으면 이것을 출력 ");
	
		/*
		  String aa = "ondal";
	      String bb = "ondal";
	      String cc = new String("ondal");
	      String dd = new String("ondal");
	         // '==' String 주소값 같은지 확인  
	         // '.equals'String 내용이 같은지 확인
	      System.out.println(aa==bb);
	      System.out.println(aa==cc);
	      System.out.println(aa.equals(bb));
	      System.out.println(aa.equals(cc));
	      System.out.println(cc==dd);
	      System.out.println(cc.equals(dd));
		*/	
		}						
		
		
}


