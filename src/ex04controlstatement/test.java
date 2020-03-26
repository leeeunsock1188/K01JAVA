package ex04controlstatement;
import java.io.IOException;
/*
시나리오]국어, 영어, 수학 점수를 사용자로부터 입력받은 후
평균을 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하시오.
단, 사용자가 X,x(대소문자 구분없음)를 입력하면 프로그램이
종료되어야 하며 do~while문으로 구현해야 한다.
 */
import java.util.Scanner;

public class test {
	
	
	public static void main (String[] args)throws IOException{
		int eng,kor,math,avg;
		int exit;
		
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수:");
		kor= scanner.nextInt();
		System.out.println("영어점수:");
		eng= scanner.nextInt();
		System.out.println("수학점수:");
		math= scanner.nextInt();
		
		avg = (eng+kor+math) / (3*10); 
		switch(avg) {
		case 10: case 9:
			System.out.println("A학점");break;
		case 8:
			System.out.println("B학점");break;
		case 7:
			System.out.println("C학점");break;
		case 6:
			System.out.println("D학점");break;
			default : 
			System.out.println("F학점");break;
		}
		System.out.println("종료하시려면 x 혹은 X 를 눌르시오");
		System.out.println("계속하시려면 아무키나 누르세요");	
		exit = System.in.read();
	}
		
		
		while(!(exit=='x'|| exit=='X'));
	
	}
	
}


