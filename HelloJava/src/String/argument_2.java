package String;

public class argument_2 {
public static void main(String[] args) {
// argument - ondal => (args 배열에  ondla을 넣음) 

// ondal을 꺼내서 1글자씩 출력 ->charAt으로 글자하나씩꺼냄	
	for (int i = 0; i < args[0].length(); i++) {
		System.out.print(args[0].charAt(i)+ " ");
	}
	System.out.println();
	
// ondal을 char배열에 한글자씩 나눠넣어서 for문으로 꺼냄 	
	char [] ch = args[0].toCharArray();
	
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]+ " ");
	}
	System.out.println();

//	글자바꾸기  
	char tmp = ch[1];
	ch[1] = ch[3];
	ch[3] = tmp ;
	
// char 배열을 String str 하나로 묶어서 출력 
	String str = new String(ch);
	System.out.println(str);
	

	

	
	
	

	
}
}
