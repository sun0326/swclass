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

