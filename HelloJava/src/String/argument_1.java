package String;		/// ??? 

public class argument_1 {
	public static void main(String[] args) {
		
	//gui채팅프로그램
	
	// ap aa.txt bb.txt => conmmandline argument (명령행인자)
		
	//run - runconfigurations - argument에 인자값을 30 80 넣으면  -> 110
	
	if(args.length != 2) {		//인자값이 안드어있을경우
		System.out.println("정신똑바로!!");
		System.out.println("사용법은 명령 숫자 숫자");
		//return; 	    
		System.exit(1); 	//강제종료	//c:exit(1) c#:Environment.Exit(1)
	}
	System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	
	
	}
}
