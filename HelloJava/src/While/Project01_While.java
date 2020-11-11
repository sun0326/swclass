package While;

import java.util.Scanner;

public class Project01_While {

	public static void main(String[] args) {
		/*
		 * 점수를 입력받아 max값, 과목수 , 평균값을 출력하는 프로그램 (단,과목수는 모름 , 점수입력시 -1이 들어오면
		 * EOF(end-of-file)
		 * 
		 * ex) 점수 : 100 점수 : 78 점수 : 96 점수 : -1 점수최고점 : 100 과목수 : 3 점수평균 91.0
		 */

		Scanner sc = new Scanner(System.in);

		int subject = 0;
		int score = 0;
		int max = 0;
		int sum = 0;

		while (true) {
			System.out.print("점수입력 : ");
			score = sc.nextInt();
			if (score == -1)
				break;				// -1 일때 나가기
			if (score > 100)
				continue;			// 100점이상일경우 무시하고 루프처음으로 ㄱ 
			if (score >= max)
				max = score;
			//과목수와  합계를 더하는 순서 생각하기
			subject++;		//subject = subject + 1	
			sum += score;	//sum = sum + score
                                                                                                                                                                                                                                                                                                                   
		}
		
		double avg = (double)sum/subject;
		System.out.println(avg);

		System.out.println("과목수 = " + subject);
		System.out.println("최고점=" + max);
		System.out.println("합계= " + sum);
		System.out.printf("평균= %.2f", avg);
	}

}
