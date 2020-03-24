package ex12inheritance;
/*
연습문제]  AnimalDog 클래스 정의
	강아지를 표현한 클래스 
	- Dog is a Animal이 성립하므로 상속관계로 표현하기에 
		적합한 모델
	
	멤버변수
		강아지의종류 : 푸들, 포매라니안 등 -> dogKind
		이름 -> name
	멤버메소드
		bark() : 강아지가 짖는것을 표현
			출력결과 : 이름이 XX이고 종(포유류)이 
				YY인 강아지가 짖는다.
		showDog() : 강아지의 현재상태(멤버변수)를 출력하는 
			메소드
	인자생성자
		: 부모클래스까지 초기화할수 있도록 구성할것


 */
public class AnimalDog extends Animal {
	
	String dogKind;
	String name;
	
	public void bark() {
		
		System.out.printf("이름이 %s이고 %s인 강아지가 짖는다", name,dogKind);
	
	}
	public void showDog() {
			System.out.println("종은:"+getSpecies()
			+"나이는:"+age+"성별은:"+gender+"종류는:"+dogKind+"이름은:"+name);
	}
	public AnimalDog(String species, int age, String gender,
			String name, String dogKind) {
		super(species, age, gender);
		this.name  =name;
		this.dogKind= dogKind;
		
	}
}




/*
실행결과

종은:포유류
나이는:2
성별은:수컷
====================

이름이 뽀미이고 종이 포유류인 강아지가 짖는다
====================
종은:포유류
나이는:2
성별은:수컷
종류는:포매라니안
이름은:뽀미
*/






















/*
public class AnimalDog extends Animal {
	String dogKind;
	String name;
	
	public AnimalDog(String specise , int age ,String gender,String dogkind,String name) {
		super(specise, age, gender);
		this.dogKind =dogkind;
		this.name = name;
	}
	
	public void bark() {
		System.out.printf("이름이%s이고 종(%s)인 강아지가 짖는다",name , getSpecies());
	}
	
	public void showDog() {
		super.showAnimal();
		System.out.println("종은:"+dogKind+"나이는:"+name);
	}
	
	
}
*/