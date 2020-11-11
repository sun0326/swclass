package Class_Object4_Tostring;

class Car{	//정의(설계)
	private String color;	
	private int door;	
	

	public Car(String color, int door) { // public o , return x
		// TODO Auto-generated constructor(생성자) stub
		this.color = color;
		this.door = door;
	}

	public Car() {	} // 생성자 중복 ( constructor overloading)**

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

	public void dirve() {		
		System.out.println("드라이브하쟈");
	}
	
	public void chool() { //출력전문 메소드를 만들쟈 
		System.out.println(color+"\t"+door);
	}
	public String toString() {	//overriding 재정의			//메소드 3형식,return 
		return "[자동차 색은]" + color +"이고\n" +"[문의 갯수는]" + door +"개 입니다.";
					// 문장전체가 리턴됨
	}
	
	
}// Car-class-end


/*	객체의 lifecycle
		main() - start
		new : 	- 객체생성
		
		디폴트 생성자 (default constructor ) 가동 	: 초기치
		 new car() 									//color ""  door 0
		 :
		 다양한 로직
		 : 
		 소멸자 가동 ( destructor ) : 객체 정리
		main() -end
 */

public class CarMainClass { // CarMainClass.java
	public static void main(String[] args) {  
		Car mycar = new Car("red",4); //생성(제작)
		
		//mycar.getColor()를 계속 사용하면 불편하므로 편리하게사용하는 방법 2가지 
//		System.out.println(mycar.getColor());
//		System.out.println(mycar.getDoor());
		//1)설계도에 출력담당을 만듬 - 많이사용안함  
		mycar.chool(); 
		
		//2) overriding (상속)
		//   재사용 , 재정의
		//					toString() ?????????????
		//System.out.println(mycar.toString()); 
		System.out.println(mycar); // .toString()은 생략가능 ! 
		
		Car yourcar = new Car();	
		// 이것만 있으면 내부적으로 디폴트 생성자가 만들어지지만 
		//인자를 받는 형식과 같이 사용하면 생성자를 만들어 줘야함 
		// (1형식만있으면 -디폴트생성자가동 ) (1,2형식 같이있으면 생성자를 다 만들어줘야함)

		
	}// main -end
}//CarMainClass-end

