package array;

import java.util.Scanner;

public class Project15_hengman{

	public static void main(String[] args) {
		// apple

		Scanner sc = new Scanner(System.in);

		String moonja = "apple";
		String[] bae = moonja.split("");
		String[] answer = { "_", "_", "_", "_", "_" };

		int count = 0;
		int sw = 0;
		while (true) {
			System.out.println(count+1+"번째 시도입니다.");
			System.out.print("문자를 입력하세요 :");
			
			String alp = sc.nextLine();
			count++;
			for (int i = 0; i < answer.length; i++) {
				if(alp.equals(answer[i])) {
					System.out.println("이미있는글씨");
					break;
				} else if (bae[i].equals(alp)) {
					answer[i] = alp;
					sw++;
				}
			}
			for (int i = 0; i < answer.length; i++) {
				System.out.print(answer[i]);
			}
			if (sw == answer.length) {
				System.out.println("==정답입니다==");
				break;
			}
			if (count == 13) {
				System.out.println("입력횟수 초과");
				break;
			}

		}
	}
}

