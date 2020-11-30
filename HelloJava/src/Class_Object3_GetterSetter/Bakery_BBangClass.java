package Class_Object3_GetterSetter;

class BBang {
	private String name;
	private int money;
	
	public BBang(String name, int money) {
		this.name = name;
		this.money =money;
	}

	public BBang() { }

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void eat() {
		System.out.println("빵을먹자");
	}
	
	public String toString() {
		return "빵이름은 " + name + "\n가격은"+money+"원" ;
	}
}

public class Bakery_BBangClass {
	public static void main(String[] args) {
		BBang soboru = new BBang();
		BBang pizza = new BBang("피자빵",1000);
		
		System.out.println(pizza);
		
		
		pizza.setName("피자빵");
		pizza.setMoney(1000);
		
		soboru.setName("소보루");
		soboru.setMoney(2000);
		
		
		System.out.println(pizza.getName());
		System.out.println(pizza.getMoney());

		System.out.println(soboru.getName());
		System.out.println(soboru.getMoney());
		
		pizza.eat();
		soboru.eat();
	}
}


