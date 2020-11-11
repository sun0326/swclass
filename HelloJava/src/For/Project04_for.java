package For;

public class Project04_for {

	public static void main(String[] args) {
		
		// 중첩 for문
		// 학년 - 반 
		// 학년은 3까지 반은 2까지
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.println(i + "학년 - "+ j+"반");
			}
		}

	}

}
