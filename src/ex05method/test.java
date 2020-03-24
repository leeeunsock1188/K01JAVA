package ex05method;

import java.util.Scanner;

/*
연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입력예]
 */
public class test {


	static void gogodan(int sNum , int eNum) {
		
		for(int i=sNum; i<=eNum; i++) {
			for( int j = 1; j<=9; j++) {
				System.out.printf("%2d * %2d = %2d ", i, j , (i*j));
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단:");
		int num1= scanner.nextInt();
		System.out.println("수:");
		int num2= scanner.nextInt();
		gogodan(num1,num2);
		
	}

}
