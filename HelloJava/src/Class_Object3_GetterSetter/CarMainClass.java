package Class_Object3_GetterSetter;

class Car{	//정의(설계)
	private String color;	
	private int door;	
	
						//임시방
	public Car(String color, int door) { // public o , return x
		// TODO Auto-generated constructor(생성자) stub
		this.color = color;
		this.door = door;
	}

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
		Car mycar = new Car("red",4); // 객체생성+값 (초기값)   / 메소드호출문과 유사 
		
		System.out.println(mycar.getColor());
		System.out.println(mycar.getDoor());
		
		// 속성 수정 할수있음
		//mycar.setColor("red");	//객체.속성 = 값
		//mycar.setDoor(2);
		
		Car yourcar = new Car("blue",2);
		System.out.println(yourcar.getColor());
		System.out.println(yourcar.getDoor());
		
		
		
	}// main -end
}//CarMainClass-end

