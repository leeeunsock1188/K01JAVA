package ex05method;

import java.util.Scanner;

public class E03MethedType02_2 {


		
		static String getHakjum() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수:");
		int kor = scanner.nextInt();
		System.out.println("영어점수:");
		int eng = scanner.nextInt();
		System.out.println("수학점수:");
		int math = scanner.nextInt();
		
		//평균값의 소수점을 구하기 위해 double형으로 연산 
		double avg = (kor + eng + math) / 3.0;
		
		String hakjum = "";
		// 평균값의 구간을 정하기 위해서 10으로 나눈 몫을 이용함 
		
		int result = (int)avg /10;
		switch(result) {
		case 10: case 9:
			hakjum = "A학점"; break;
		case 8:
			hakjum = "B학점"; break;
		case 7:
			hakjum = "C학점"; break;
		case 6:
			hakjum = "D학점"; break;
		default:
			hakjum = "F학점"; break;
		
		}	
		return hakjum;
		}
		public static void main(String[] args) {
			System.out.println("너의 학점은 "+ getHakjum());
			
			
}////end of main

	
}//// end of class
