package ex12inheritance;
/*
연습문제] Animal 클래스정의 
	동물의 일반적인 특성을 표현하는 클래스를 정의하시오.
	멤버변수 : 
		동물의 종류(포유류, 어류, 조류 등)->species
		나이->age
		성별->gender
	멤버메소드 : 
		showAnimal() : 멤버변수를 출력하는 용도
	인자생성자 : 
		멤버변수 3개 모두를 초기화할수 있도록 정의
	
	※1차완성후 species를 private로 선언후 적절히 수정한다.
	
실행결과

종은:포유류
나이는:2
성별은:수컷

 */

public class Animal {
	private String species;
	public int age;
	public String gender;
	
	public void showAnimal() {
		System.out.printf("종은%s,나이는:%d,성별은:%s",
				species,age,gender);
		
	}
	public Animal(String species ,int age ,String gender) {
		this.species=species;
		this.age=age;
		this.gender=gender;
	}
	public String getSpecies() {
		return species;
	}
	
}


























/*
public class Animal {
	private String species; //동물의 종류
	int age;//나이
	String gender; //성별
	
	
	//멤버메소드 
	public void showAnimal() {
		System.out.printf("종은:%s,나이는:%d,성별은%s"+"입니다.", species,age,gender);
	}
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age =age;
		this.gender =gender;
	}
	public String getSpecies() {
		return species;
	}
	
	
}
	
*/
