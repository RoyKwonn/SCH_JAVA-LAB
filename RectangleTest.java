package four;

import java.util.*;

class Rectangle{
	private int x,y,w,h;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	int getArea() {		// 면적을 구하는 함수 
		return w*h;
	}
	
	void print() {
		System.out.println("\n이 사각형은 다음 4개의 꼭짓점을 갖고있습니다.");
		System.out.print("(" + x + ", " + y + ") " );
		System.out.print("(" + (x+w) + ", " + y + ") " );
		System.out.print("(" + x + ", " + (y+h) + ") " );
		System.out.println("(" + (x+w) + ", " + (y+h) + ") " );
		
		System.out.println("면적은 " + getArea() + "입니다."); 		// 면적을 구하는 함수를 통해 바로 출
		
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		System.out.print("x 좌표를 입력하시오 : ");
		r.setX(sc.nextInt());
		
		System.out.print("y 좌표를 입력하시오 : ");
		r.setY(sc.nextInt());
		
		System.out.print("w 가로 길이을 입력하시오 : ");
		r.setW(sc.nextInt());
		
		System.out.print("h 세로 길이을 입력하시오 : ");
		r.setH(sc.nextInt());
		
		r.print();
	}

}
