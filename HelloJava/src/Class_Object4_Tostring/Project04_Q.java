package Class_Object4_Tostring;

public class Project04_Q {
public void main() {
	/*
	 문자열 loVE를 기억창고에 넣은후 대소문자를 바꾸어 출력하시오
	 (단,메소드 호출을 사용하시오)  /Character. islowercase(),?touppercase
	 예 : LOve
	kaja(moonja);

	*/
	String moonja ="loVE";
	System.out.println("변경전"+moonja);
	System.out.println("변경후");
	kaja(moonja);
	
	
	
}

private static void kaja(String moonja) {
	for (int i = 0; i < moonja.length(); i++) {
		if(Character.isLowerCase(moonja.charAt(i))){
			System.out.println(Character.toUpperCase(moonja.charAt(i))+"\t");
		} else
			System.out.println(Character.toLowerCase(moonja.charAt(i))+"\t");

		}
	} 
}
