package String;

public class Charat {


	public static void main(String[] args) {
		String s1 = "ondal";
		String s2 = "온달";
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(1)); //.charAt메서드는 해당번호의 글자만 가져옴
		
		
		
		//======================================================================
		
	      int[] viras = {'A', 'A', 'A', 'A'};
	      
	      viras[2]++;
	      
	      for (int i = 0; i < viras.length; i++) {
	         System.out.printf("%03d ", viras[i]);
	      }
	      
	      System.out.println("");
	      
	      for (int i = 0; i < viras.length; i++) {
	         System.out.printf("%c ", viras[i]);
	      }
	   }
		
		
	}

