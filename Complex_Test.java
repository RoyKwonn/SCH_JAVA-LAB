package five;

// 복소수 클래스.
class Complex {		
	int real;		// 실수부 
	int imag;		// 허수부 
	
	Complex(int real, int imag){
		this.real = real;	// 실수부의 입.
		this.imag = imag;	// 허수부의 입력.
	}
	
	// 복소수를 화면에 출력.
	void print() {
		System.out.print("(" + real + " + " + imag + "i)");
	}
	
	// 복소수덧셈 메소드.
	static Complex add(Complex o1, Complex o2) {
		Complex r = new Complex(0,0); // 반환 객체 생성.
		r.real = o1.real + o2.real; 	// 실수부 덧셈.
		r.imag = o1.imag + o2.imag;		// 허수부 덧
		
		return r;	// 복소수 반환.
	}
}

public class Complex_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complex i = new Complex(10, 20);
		Complex j = new Complex(30, 40);
		Complex r = new Complex(0, 0); // 반환 받기 위한 객체.
		
		r = Complex.add(i, j);
		
		i.print();
		System.out.print("와 ");
		j.print();
		System.out.print("를 더하면 ");
		r.print();
		System.out.println("가 됨 ");
	}

}
