package task;

import java.util.Random;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Updown {


	public static void rendemget2() {
	
		System.out.println("(1번 재실행) , (0 종료)");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		if(num1 == 1) {
			rendemget();
		}
		else {
			return;
		}
	}

	public static void rendemget() {

		double rndNumber= Math.random();//수학함수 가지고있
		int intNumber2 = (int)(Math.random()*100)%100+1;
		int intNumber = (int)(Math.random()*100)%100+1;
		System.out.println("생성된난수[정수]:"+intNumber);
		System.out.println("업다운 숫자:"+ intNumber);

		Scanner scanner = new Scanner(System.in);

		for( int i = 0; i<=6; i++) {

			System.out.println("숫자를 입력하세요:");
			int sum = scanner.nextInt();
			if(intNumber<sum) {

				System.out.println("다운~~");
			}
			else if(intNumber>sum) {
				System.out.println("업!!");
			}
			else if(intNumber==sum){
				System.out.println("정답!");break;
			}
		
		
			if(i==6) {
				System.out.println("실패!");
			}
		
		}
	
		
	
		 rendemget2();
		
		
	}
	



	public static void main(String[] args) {

		rendemget();
		





	}

}



