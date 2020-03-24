package ex04controlstatement;

public class E05for2 {

	public static void main(String[] args) {
		System.out.println("==증가연산자 사용으로 구현==");
		for(int x=1; x<=4; x++) {
			for(int y=1; y<=4; y++) {
				if(x+y==5) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}	
			System.out.println();
		}
		System.out.println("==감소연산자 사용으로 구현==");
		for(int x=1; x<=4; x++) {
			for(int y=4; y>=1; y--) {
				if(x==y) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}	
			System.out.println();
		}
	}
}
 /*
  연습문제 ] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
  	
   
   
  * */
