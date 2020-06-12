package middle;

// 컴퓨터공학과 20184646
// 권석환 

//작가 클래스 
class Author{				
	private String name;	// 이름 
	private String email;	// 메일 
	private char gender;	// 성별 
	
	Author(String name, String email, char gender) // 생성자 
	{
		this.name = name;		// 매개변수로 입력받은 값을 필드에 옮기기  
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {	// 문자열로 필드의 내용을 반환하는 메소드 
		return "[이름=" + name + ", 이메일=" + email + ", 성별=" + gender + "]";
	}
}


// 책 클래스 
class Book {
	private String name;   	// 책이름 
	private Author author; 	// 작가클래스 
	private double price;	// 가격 
	private int qty = 0;	// 수량 
	
	// 북 생성자 1호 (매개변수 수량 제거버전) 
	Book(String name, Author author, double price)
	{
		this.name = name;		// 매개변수로 입력받은 값을 필드에 옮기기
		this.author = author;
		this.price = price;
	}
	
	// 북 생성자 2호 (매개변수 수량 포함버전) 
	Book(String name, Author author, double price, int qty)
	{
		this.name = name;		// 매개변수로 입력받은 값을 필드에 옮기기
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "책[이름=" + name + ", 저자=" + author.toString() + ", 가격=" + (int)price + ", 수량=" + qty + "]";
	}	//author.toString()을 통해서 저자 정보를 표현 할 수 있다. 
	
	
}


public class Book_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a = new Author("Kim", "kim@sch.ac.kr", 'm'); // 작가정보 입력 
		
		// 예상출력 : "[이름=Kim, 이메일=kim@sch.ac.kr, 성별=m]"
		System.out.println(a.toString()); // 작가정보 출력 
		
		Book aBook = new Book("Power Java", a, 30000, 1); // 책생성자 2호, 위에서 입력한 작가정보 a를 전달
		
		// 예상출력 : "책[이름=Power Java, 저자=[이름=Kim, 이메일=kim@sch.ac.kr, 성별=m], 가격=30000, 수량=1]
		System.out.println(aBook.toString()); 
	}

}
