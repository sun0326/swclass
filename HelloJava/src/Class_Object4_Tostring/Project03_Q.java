package Class_Object4_Tostring;

class cafe1{
	private String coffee;
	private String size;
	private int price;
	private String local;

	public String getCoffee() {
		return coffee;
	}
	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String toString () {
		return coffee + "의 사이즈가"+ size +"인 경우 가격은" + price +"이며 " + local +"지점에서 판매합니다";
	}
	/*
	@Override	// @ : annotation
	public String toString() {
		return "cafe1 [coffee=" + coffee + ", size=" + size + ", price=" + price + ", local=" + local + "]";
	}*/
	
	
}


public class Project03_Q {

	public static void main(String[] args) {
	/*
		main()에 String pummok = "coffee:big:1500:jongro"; 가 있을때
		cafe1클래스를 사용하여 getter/setter및 toString()등을 작성한후
		toString()출력시 다음과 같이 출력하도록 프로그램을작성하시오
		(단, 커피명: 사이즈:가격:지점 을 의미하며 cafe1 클래스의 필드는 앞의 4개를 만들어사용한다)
		
		출력예 
		coffee의 사이즈가 big 인 경우 가격은 1500원 이며 jongro지점에서 판매합니다.
	*/
//		String pummok = "coffee:big:1500:jongro";
//		String [] bae = pummok.split(":");
//		String pummok = "coffee.big.1500.jongro";
//		String [] bae = pummok.split("\\.");
		String pummok = "coffee**big**1500**jongro";
		String [] bae = pummok.split("\\*\\*");
		// .은 전부라는 표현이므로 .으로는 split 이 안되므로 \\. 이나 [.]으로 표현해줘야 .을 구분할수있댜

		cafe1 ca1 = new cafe1();
		
		//setter
		ca1.setCoffee(bae[0]);
		ca1.setSize(bae[1]);
		ca1.setPrice(Integer.valueOf(bae[2]));		//문자열을 integer로 바꿈
		ca1.setLocal(bae[3]);
		
		System.out.println(ca1);
		
		

		
	}

}
