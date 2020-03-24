package ex13interface;
	
/*
  인터페이스(Interface)
  -클래스가 객체의 설계도라면 인터페이스는 클래스의 설계도라 할수있다.
  -자바는 단일 상속을 원칙으로 하나 인터페이스를 통해 다중상속을
  		구현할수 있다.
 -추상클래스와 동일하게 상속을 목적으로 제작되므로 구현받은
  		하위클래스에서 반드시 오버라이딩 해야한다.
 -멤버로는 추상메소드와 상수로만 구성된다.
 	메소드 -> public abstract
 	변수 -> public static final
 -인터페이스는 생성자가 없다. 
 */
interface MyInterface1 {
	//생성자는 사용불가
	//public MyInterface1() {} // --> 에러발생 //객체생성하지못함.
	
	//멤버상수 
	public static final int MAX_INT = Integer.MAX_VALUE;
	double MAX_DBL = Double.MAX_VALUE;
	//멤버 추상메소드 
	public abstract void absFunc1(); //메소드
	void absFunc2(); //생성자
}

interface MyInterface2 { //객체 2 인터페이스 
	void absFunc2(); //오버라이딩1
}

class simpleClass {
	int simple =1;
	void mySimple() {
		System.out.println("simple ="+simple);
	}
}
/*
 컴마를 이용해서 여러가의 인터페이스를 '구현'하는것이 가능하다.    
 그리고 '상속' 과 '구현'을 동시에 할수도 있다.
 */
class MyClass  extends simpleClass implements MyInterface1, MyInterface2 { //객체 3 인터페이스

	@Override
	void mySimple() {
	
		super.mySimple();
	}
	
	@Override
	public void absFunc1() { //오버라이딩
		System.out.println("absFunc1() 호출됨");
		
		/*
		 인터페이스에 동일한 이름의 추상메소드가 존재하는 경우
		 하나만 오버라이딩 하면 된다. 
		 */
	}@Override
	public void absFunc2() {//오버라이딩
		System.out.println("absFunc2() 호출됨");
		
	}
}


public class E03InterfaceBasic {

	public static void main(String[] args) {
		MyInterface1 my1 = new MyClass();
		my1.absFunc1();
		my1.absFunc2();
		
	}

}
