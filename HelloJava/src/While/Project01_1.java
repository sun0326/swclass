package While;

import java.util.Scanner;

public class Project01_1 {

	public static void main(String[] args) {
		int jum;
		int count = 0;
		int total = 0;
		int max;

		System.out.print("점수 : ");
					// two-read 중 one-read
		Scanner sc = new Scanner(System.in);
		jum = sc.nextInt();
		max = jum; 		// 1st 점수를 무조건 max로

		while (jum != -1) { // eof체크
			count++;
			total = total + jum; //total += jum
			
			if (jum > max)
				max = jum;
			
			System.out.println("점수: ");
			jum =sc.nextInt();  // two-read 중 two-read
		}
		
		double avg = (double)total/count;
		System.out.println(avg);

		System.out.println("과목수 = " + count);
		System.out.println("최고점=" + max);
		System.out.printf("평균= %.2f", avg);
		

	}
}
