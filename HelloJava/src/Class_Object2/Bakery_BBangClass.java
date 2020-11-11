package Class_Object2;

class BBang {
	private String name;
	private int money;
	
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
}

public class Bakery_BBangClass {
	public static void main(String[] args) {

		BBang pizza = new BBang();
		BBang soboru = new BBang();
		
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


