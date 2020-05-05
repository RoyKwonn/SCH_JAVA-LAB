package four;


class Student {
	
	private String name;	// 접근 지정자 설
	protected int rollno;
	public int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std;
		std = new Student();
		std.setName("Kwon"); 	// set으로 클래스 내에 있는 필드 내용 변경하기
		std.setRollno(20184646);
		std.setAge(27);
		
		System.out.println("학생의 이름 : " + std.getName());  // get으로 클래스 내에 있는 필드 데이터 가져오기 
		System.out.println("학생의 학번 : " + std.getRollno());
		System.out.println("학생의 나이 : " + std.getAge());
		
	}

}
