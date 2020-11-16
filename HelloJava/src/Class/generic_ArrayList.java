package Class;

import java.util.ArrayList;
import java.util.Date;

/*	Q2
		sangpum,price 필드가 있는 SMarket 클래스를 추가로 만드시오
		단, 생성자 2개 toString()도 만드시오
		
		toString()으로 출력시 결과 
		상품이름은 우유이고 상품가격은 1000원 입니다.
		상품이름은 빵이고 상품가격은 2000원입니다.
 */	
class SMarket{
	private String sangpum;
	private int price;

	public SMarket() {		} 		// 디폴트 생성자

	public SMarket(String sangpum, int price) {	// 인자 있는 생성자
		super();
		this.sangpum = sangpum;
		this.price = price;
	}

	public String getSangpum() {
		return sangpum;
	}

	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "상품이름은 " + sangpum + "이고, 상품가격은" + price + "원 입니다.";
	}
}

public class generic_ArrayList {
	public static void main(String[] args) {
		SMarket milk = new SMarket("우유",1000);
		SMarket bbang = new SMarket("빵",2000);
		
//		System.out.println(milk);
//		System.out.println(bbang);
		//객체의 연관성이없어서 출력할경우 따로 출력해야하는데 한곳에 넣어둘경우 한번에꺼낼수있슴
		// list의 종류인  linked list -> 따로따로 넣음 .... 한번에 출력하려면 ......
		// 나무 ? 못박아서 줄로 연결 꺼내면 줄줄이나옴 .... 그래서 linked list
		// 장점???? 퇴사하면 끈을 끊어서 빼고 남은것끼리 줄을 연결 ...........................?????????????????????
		// arraylist -> 끈말고 어디다넣는다고 ? 컬렉션 !! 졸리다아아아 
		// 컬렉션을 잡아서 객체(우유,1000)(빵,5000)를 하나씩 넣음! 그러면 연결고리없이도 한번에 꺼낼수있음 .get(i)  
		// 그중에서 가격 만 뽑아낼려면  .getprice 하면 됨 이래서 컬렉션을 객체랑매치해서 사용 
	
	//Q3	
	// 여기에 collection을 적용 시켜보자 \
	//arraylist arr3을 만들어 처음에 판매한 날짜를 넣고 
	// 그 다음부터 판매내용을 넣은후 모두를 출력하시오 
	// 출력 예 
	// mon nov 16 19:5944 KST 2020
	// 상품이름은 우유이고 상품가격은 1000원 입니다.
	//	상품이름은 빵이고 상품가격은 2000원입니다.
		
		ArrayList arr3 = new ArrayList();
		Date date = new Date();
		arr3.add(date);
		arr3.add(milk);		// arr3.add(new SMarket("우유",1000)); 요로케하면 생성자를거쳐 바로 객체를만들어서 값을 넣음 
		arr3.add(bbang);	// 객체를 컬렉션배열에 넣어서 관리하므로 객체를 만드는 의미가 없고 바로 값을 컬렉션에 넣는댜
				// 객체를 넣어야댐 , 객체부터 만든다 SMarket s1 =new SMarket("우유",1000);
								//컬렉션에 넣으려면 new SMarket("우유", 1000);를 만들고 add로 넣는다 
		
		for (int i = 0; i < arr3.size(); i++) {
			System.out.println(arr3.get(i));
		}
		
	//Q4
	/* ArrayList<SMarket> arr5를 만들어 5개정도 판매상품을 넣은후 \
	 	// toString 사용없이 가격이 2000미만인 상품의 이름만 모두 출력하시오 
	*/											
		ArrayList<SMarket> arr5 = new ArrayList<SMarket>();		//<> 안에 속해있는 값만호출해올수있음 
		arr5.add(new SMarket("식빵",3000));
		arr5.add(new SMarket("고로케",1500));
		arr5.add(new SMarket("밤식빵",4000));
		arr5.add(new SMarket("도넛",1000));
		arr5.add(new SMarket("피자빵",2000));		// 생성자로 넣음 ~
		
		System.out.println(milk.getPrice());
		
		for (int i = 0; i < arr5.size(); i++) {
			if (arr5.get(i).getPrice()<2000) {
				System.out.println(arr5.get(i).getSangpum());
												// 상품이름으로 꺼냄 
			}
		}
	}
}