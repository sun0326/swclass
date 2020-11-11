package Class_Object2;

class Car{	//정의(설계)
	private String color;	//캡슐화 - (접근지정자) private : 같은 클래스에서만 접근가능 
					//ㄴ 힙메모리에 있는 객체 color
	private int door;	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	
/*	
  	// 직접손대지 못하게 도우미를 만들어야한다고오? 밖에서 접근가능하게  public으로! - 받는것 주는것
	// color도우미 
	public void setColor(String color) {// "검정색"를 받는(set)도우미를 만듬 첫글자는 대문자로! /->메소드2형식 유사
								//ㄴ 임시방				//setter
		this.color = color;
		//ㄴ자기자신(class Car)을 참조하는 객체
	}											//getter
	public String getColor() {	// color 꺼내주는(get)도우미 		/ -> 메소드 3형식 유사
		return color;	// this.color 도 가능 ! 
	}
	
	// door 도우미
	public void setDoor(int door) {
		this.door=door;
	}
	public int getDoor() {
		return door;
	}
	
	// ==>제너레이터 사용하면 쉽게 쓸수있음 
	 			source -> generater
	 * setter로 저장하고 getter로 꺼내씀!!!!!!!!!1111
*/	
	
	
	
	public void dirve() {		
		System.out.println("드라이브하쟈");
	}
}// Car-class-end




public class CarMainClass {
	public static void main(String[] args) {
		Car mycar = new Car(); //생성 (제작)
		mycar.setColor("red");	//객체.속성 = 값
		mycar.setDoor(2);
		mycar.dirve();	//객체.메소드()  -> 메소드1형식처럼 생각해유 
		System.out.println(mycar.getColor());
		System.out.println(mycar.getDoor());
						   //객체 .속성
		
	}// main -end
}//CarMainClass-end

