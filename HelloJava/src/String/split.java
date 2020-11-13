package String;

public class split {

	public static void main(String[] args) {
		/*
		  "듀엣그룹,duetmiso,얼굴천사"를 문자열 변수에 넣고 
		  출력시 한단어 한줄씩 출력하시오 /단 split() 사용 
		*/
		
		String str = "듀엣그룹,duetmiso,얼굴천사";
		String [] bae = str.split(",");	// , 를 기준으로 잘려서 배열에 들어감 
			// String[] bae = {"듀엣그룹","duetmiso","얼굴천사"}; 이 과정이됨....
		
		for (int i = 0; i < bae.length; i++) {
			System.out.println(bae[i]);
		}
		
		
	}

}
