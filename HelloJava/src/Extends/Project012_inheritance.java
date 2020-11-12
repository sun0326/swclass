package Extends;

//overriding 재정의
//1) '상속'에 있어서 '메소드' 이름이 같아야 됨
//2) 재정의시 약간 다르게 사용 하는것 /ex) toString() 

class Animal{
	public void move() {
		System.out.println("움직인댜(animal특성)");
	}
}

class Bird extends Animal{
	public void sing() {
		System.out.println("노래한다(brid 특성)");
	}
	public void move() {
		System.out.println("움직인다(bird 특성)");	//overriding
		
	}
}

class Fish extends Animal{
	public void swim() {
		System.out.println("수영한댜 (fish 특성)");
	}
}


public class Project012_inheritance {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		Fish f1 = new Fish();
		
		b1.move();
		b1.sing();
		
		System.out.println();
		
		f1.move();
		f1.swim();
		
	}

}
