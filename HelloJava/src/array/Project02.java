package array;

public class Project02 {

	public static void main(String[] args) {
	/*
	  한 학생의 국어, 영어 ,수학, 사회 , 과학 5과목 점수를 각각 변수에 넣은후 
	  총점 및 평균을 구하는 프로그램을 작성
	  단, 점수는 키보드 입력없이 초기치로 넣으세요 . 배열 사용 안함
	*/	
	
	int kor=100;
	int eng=100;
	int met=50;
	int soc=100;
	int sci=100;
	int count =5;
	
	int sum;
	int avg;
	
	sum = kor + eng + met + soc + sci ;
	avg = sum/count;
	
	System.out.println(sum +","+avg);
	
//========================================================
// 배열사용 
	
	int score [];
	score =new int[5];
//	int[] score =new int [5];
	
	score[0]=100;
	score[1]=100;
	score[2]=50;
	score[3]=100;
	score[4]=100;
	
//	int[] score2 = {100,100,50,98,85};  => 배열선언시 바로값을 넣으면 자동으로 길이가잡힌댜
	
	int sum2 = 0;	
	int avg2 = 0;
	
	for (int i = 0; i < score.length; i++) {
		sum2 += score[i];
	}
	avg2 = sum2 / score.length;

	System.out.println(sum2+","+avg2);
	}

}
