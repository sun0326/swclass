import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Bookstore {

	private String book_name;
	private String book_genre;
	private int book_price;

	public Bookstore() {
	}

	public Bookstore(String book_name, String book_genre, int book_price) {
		this.book_name = book_name;
		this.book_genre = book_genre;
		this.book_price = book_price;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_genre() {
		return book_genre;
	}

	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	@Override
	public String toString() {
		return "[책이름]" + book_name + " [장르]" + book_genre + " [책가격]" + book_price + "원";
	}

}

public class BookstoreClass {
	private static void booklist(ArrayList<Bookstore> arr1) {
		Iterator itr1 = arr1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

	private static void booksearch(String input_genre, int input_price, ArrayList<Bookstore> arr1) {
		int count = 0;
		String result;
		for (Bookstore tmp : arr1) {
			if (tmp.getBook_genre().equals(input_genre) && tmp.getBook_price() >= input_price) {
				System.out.println(tmp.getBook_name());
				count++;
			}
		}
		System.out.println("검색된 책은 모두 " + count + "권입니다.");

	}

	public static void main(String[] args) {
		Bookstore b1 = new Bookstore();

		b1.setBook_name("우리는 해낼수 있다");
		b1.setBook_genre("자기개발");
		b1.setBook_price(12000);

		System.out.println(b1);

		Bookstore b2 = new Bookstore("별이빛나는밤에", "소설", 10000);

		System.out.println(b2);

		Bookstore b3 = new Bookstore("나무와숲", "판타지", 20000);
		Bookstore b4 = new Bookstore("나위연극인생", "자서전", 30000);
		Bookstore b5 = new Bookstore("잠자는공주", "판타지", 15000);
		Bookstore b6 = new Bookstore("꿈의백화점", "소설", 13000);
		Bookstore b7 = new Bookstore("돈의속성", "자서전", 25000);
		ArrayList<Bookstore> arr1 = new ArrayList<Bookstore>();
		arr1.add(b1);
		arr1.add(b2);
		arr1.add(b3);
		arr1.add(b4);
		arr1.add(b5);
		arr1.add(b6);
		arr1.add(b7);

		booklist(arr1);

		Scanner sc = new Scanner(System.in);
		System.out.print("장르입력 : ");
		String input_genre = sc.nextLine();
		System.out.print("가격입력 : ");
		int input_price = Integer.parseInt(sc.next());

		booksearch(input_genre, input_price, arr1);

	}
}
