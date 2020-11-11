package array;

public class Project03 {

	public static void main(String[] args) {
	/*
		100개의 수를 메소드 2형식으로 전달하여 구하시오 ?
		kaja(1,2,3,4,5,......,100)처럼보낼경우 문제 발생  
		** 배열의 대표명의 그 배열의 시작번지이지다 . 
					* call by value => 값을 주기위한 호출  
				 		10개를 보내면 받는값도 10개가있어야함 ?
				***** call by reference => 참조에 의한 호출ㄹ ,   
				 		물건을 넣어놓은 키만 넘겨줌 
	 */
		
		int [] jumsoo3 = {30,70,50,90,100,20};
		kaja100(jumsoo3); //배열의 대표명은 그 배열 시작번지이다 
/*		for (int j = 0; j < jumsoo3.length; j++) {
			
			System.out.print(jumsoo3[j]+",");
		}*/
//		for(int i =0; i<jumsoo3.length;i++){
		System.out.println(jumsoo3/*[i]*/);
//	}
		
	}
									
	private static void kaja100(int[] jumsoo555) {  //배열로 받음! 
		jumsoo555[0] = 100;	
		/// jumsoo3 과 jumsoo 555는 같은 주소값을 가르킨다
		// 그래숴.... 555의 값을 바꾸면 3도 값이 바뀜 
		
		for (int i = 0; i < jumsoo555.length; i++) {
			System.out.println(jumsoo555[i]);
		}
		System.out.println(jumsoo555);
	}


}
