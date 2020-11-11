package For;

public class Project02_for {

	public static void main(String[] args) {
		// 1부터 100까지 더하는 코드
		
		int sum =0; 	// 초기값 위치 확인하기 !! 
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 10부터 1씩 빼서 0
		
		for (int i = 10; i>=0; i--) {
			System.out.println(i);
		}

	}

}
