package ex12inheritance;

/*
 instanceof 연산자
 	: 인스턴스변수가 어떤 타입의 변수인지를 판단하는 연산자로 
 	형변환(즉 상속관계가 있으면)이 가능하면 true, 
 	불가능하면 false를 반환한다.
 	- 객체간에 형변환이 되려면 반드시 두 클래스간에 상속관계가 있어야 한다.
 	-부모클래스의 참조변수가 자식객체를 참조할 수 있으므로, 
 	매개변수로 전달된 인자가 어떤 타입인지 확인할때 주로
 	사용된다.
 */
	class Box {
		public void boxWrap() {
			System.out.println("Box로 포장합니다");
		}
	}
	class PaperBox extends Box {
		public void paperWrap() {
			System.out.println("PaperBox로 포장합니다");
		}
	}
	class GoldPaperBox extends PaperBox {
		public void goldWrap() {
			System.out.println("GoldPaperBox로 포장합니다");
		}
	}
public class E09InstanceOf {
	/*
	 여기서 instanceof 연산자를 통해 형변환 가능여부를 판단하는
	 이유는 전달된 매개변수가 최상위클래스인 Box타입으로 받고 있기
	 때문이다
	 -Box 타입으로 인자를 받게되면 자동으로 업캐스팅(자동형변환)이
	 되기때문에 자식클래스의 멤버메소드를 호출할 수 없게된다
	 -이때 자식의 멤버메소드를 호출하기 위해서는 다운캐스팅(명시적형변환)
	 이필요하다.
	 -따라서 전달된 인자를 각각의 타입으로 형변환이 가능한지 판단한후 
	 다운캐스팅을 진행한 후 멤버메소드를 호출할 수 있게된다.
	 */

	static void wrapBox(Box b) { // box 까지만 접근가능 
		
		//기본자료형의 강제형변환 
		int num1 = (int)1.0;
		//기본자료형의 자동형변환 
		double num2 =1;
		
		if(b instanceof GoldPaperBox) { //부모 // 자식2
			((GoldPaperBox)b).goldWrap();//자식2 //부모 
		}
		else if(b instanceof PaperBox) {
			((PaperBox)b).paperWrap(); // 다운 캐스팅 (강제 형변환) == ((PaperBox)b)
		}
		else if(b instanceof Box) {
			b.boxWrap();
			
		}
		
	}
	
	public static void main(String[] args) {
		Box box1 = new Box(); //부모
		PaperBox box2 = new PaperBox(); //자식
		GoldPaperBox box3 = new GoldPaperBox(); //자식2
		 
		wrapBox(box1); //부모전달 
		wrapBox(box2); // 자식1전달
		wrapBox(box3); //자식 2전달 
		
		String str = new String("나는누구?");
		//wrapBox(str);

	}

}
