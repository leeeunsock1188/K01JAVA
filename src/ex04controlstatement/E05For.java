package ex04controlstatement;

/*
 for문: while문과 같은 반복문으로 초기값, 조건식, 증감식이
 	한줄에 있어 반복의 횟수를 명시적으로 알수있는 반복문이다.
 	그러므로 사용빈가 가장높다.
 	형식] 
 		for(초기값; 조건식; 증감식) {
 			실행문장;
 		}
 	실행순서]
 		초기값 -> 조건식 확인 -> 참일때 실행 -> 증감식 ->
 		-> 조건식 확인 -> 반복실행....
 */
public class E05For {

	public static void main(String[] args) {
		
		/*
		for문의 실행순서 
		1. 반복을 위한 변수 i를 1로 초기화 
		2. 조건을 검사(i가 5이하이면 참) 
		3. 실행문장을 실행
		4. 증감(감소)식 실행 
		5. 조건검사(3,4,5번을 반복횟수만큼 실행함) 
		6. 조건이 거짓일떄 for문 종료 
		 * */
		for(int i=1; i<=5; i++) {
			System.out.println("i="+i);
		}
		
		int sum = 0;
		for(int j=1; j<=100; j++) {
			sum+= j;
		
		}
		System.out.println("1~100까지의합:"+sum);
		/*
		 시나리오] for문을 이용하여 1~10사이의 정수중 2의배수의 합을 
		 구하는 프로그램을 작성하시오.
		 */
		int total = 0;
		//방법1 : if문을 통한 구현 
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				total += i;
			}
		}
		System.out.println("1~10사이 2의배수의합(방법1):"+total);
	
		
		//방법2: if문이나 삼항연산자 없이 구현하기 
		total = 0; 
		for(int i=0; i <=10; i+=2) { //증감연산자 대신 복합대입연산자도 사용가능.
			total += i;
		}
		System.out.println("1~10사이 2의배수의합(방법2):"+total);
		/*
		 for문으로 무한루프 조건을 만들때 아래와 같이 사용한다.
		 하지만 무한루프는 주로 while문으로 사용하여 구현한다. 
		 * */
		int a =1;
		/*for(;;) {
			System.out.println("나는 for문으로 만든 무한루프 입니다."+a);
		a++;
		}
*/	
		/*
		for문의 끝에 ;을 사용하면 박복한 문장이 없는것으로 간주된다.
		 * */
		/*for문의 초기식에서 선언된 변수 j는  for문이 종료되는순간
		메모리에서 소멸된다. 여기서 사용된 변수j는 지역변수(Local variable)
		라고 한다.variable 지역변수는 해당 지역을 벗어나면 소멸되는 특징을
		가지고있따*/
		//System.out.println("위 for문에서 선언한 변수 j="+j);
		
		/*
		for문의 초기값을 외부(넓은지역)에서 선언하면 해당변수는 for문안쪽(좁은지역)
		에서 사용이 가능하다. 즉 아래에서는 선언한 i는 main함수의 지역변수가 된다
		 * */
		System.out.println("위 main함수 지역에서 선언한 변수 total="+ total);
		int i=0;
		for(; i <=5; i++) {
			System.out.println("for문 안에서의 i값="+i);
		}
		System.out.println("for문 밖에서의 i값="+i);
		}
	
	}

/*

for(int w=0; w<=5; w++) {
	//for문과 상관없이 한번만 실행된다.
	System.out.println("어랏...나는 누구? 여긴어디?");
}
*/