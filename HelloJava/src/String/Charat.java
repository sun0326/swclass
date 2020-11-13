package String;

public class Charat {


	public static void main(String[] args) {
		String s1 = "ondal";
		String s2 = "온달";
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(1)); //.charAt메서드는 해당번호의 글자만 가져옴
		
		
		
		//======================================================================
		
	      int[] viras = {'A', 'A', 'A', 'A'};
	      				// int 배열에 문자를 넣으면 아스키코드로 입력됨 
	      viras[2]++;
	      
	      for (int i = 0; i < viras.length; i++) {
	         System.out.printf("%03d ", viras[i]);		//3자리숫자 아스키코드번호로 출력 
	      }							
	      
	      System.out.println("");
	      
	      for (int i = 0; i < viras.length; i++) {
	         System.out.printf("%c ", viras[i]);		//%c문자로출력 
	      }
	   }
		
		
	}

