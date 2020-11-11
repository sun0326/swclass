package Class_Object;

class Car{	//정의(설계)
	String color;	//속성
	int door;		//속성
	public void dirve() {		//메소드
		System.out.println("드라이브하쟈");
	}
}// Car-class-end

public class CarMainClass {
	public static void main(String[] args) {
		Car mycar = new Car(); //생성 (제작)
		mycar.color = "black";	//객체.속성 = 값
		mycar.door = 2;
		mycar.dirve();	//객체.메소드()  -> 메소드1형식처럼 생각해유 
		System.out.println(mycar.color);
		System.out.println(mycar.door);
							//객체 .속성
	}// main -end
}//CarMainClass-end

