package ex03ooperator;
/*
 * 문제1] 파일명 : Qu_01.java
1.국어, 영어, 수학점수 및 과목의 총점을 저장할수 있는 변수를 선언하시오.
2.국어 89점, 영어 99점, 수학 78점을 대입한다.
3.국영수 총합을 구해서 총점을 저장할 변수에 대입한다.
4.총합점수를 출력한다.
실행결과  	국어점수:XX점, 수학점수:XX점, 영어
점수:XX점
 	3과목의 총점은 : XXX점

문제2] 파일명 : Qu_02.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
출력결과]
	99점,80점,96점의 평균점수는 XXX.XX점입니다.(실수형태)
	99점,80점,96점의 평균점수는 XXX점입니다.(정수형태)

문제3] 파일명 : Qu_03.java
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 면애의 타입을 int, float, double형
세가지로 선언하여 각각 출력해야한다.
변수명] 
	int형 : area_int
	float형 : area_float
	double형 : area_double
공식]
	원의넓이 = 반지름 * 반지름 * 3.14



 * */
/*
public class Qu_01 {

	public static void main(String[] args) {
		int Korean = 99;
		int math= 80;
		int English = 96;
		double mean = (Korean+math+English) / 3.0;
		int mean2 = (Korean+math+English) / 3;
		
		
		System.out.println("평균점수는:"+mean+"입니다." );
		
		System.out.println("평균점수는:"+mean2+"입니다." );
	}

}
*/
/*
public class Qu_01 {

	public static void main(String[] args) {
		int Korean = 89;
		int math= 99;
		int English = 78;
		double mean = (Korean+math+English); 
		
		
		
		System.out.println("국어점수:"+Korean+"점\t"+"수학점수:"+math+"점\t"+"영어점수:"+English+"점");
		System.out.println("3과목의 총점은:"+mean+"입니다.");
	}

}
*/

public class Qu_01 {

	public static void main(String[] args) {
		
	//반지름이 10인 원의 넓이를 구해 출력. 
	int area_int;
	float area_float=10;
	double area_double = 3.14;
	
	area_int = (int) (area_float * area_float * area_double);
	System.out.println("원의 넓이는:"+area_int);
	
	}
}
