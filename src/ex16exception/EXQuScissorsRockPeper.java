package ex16exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class  WrongNumbaerException extends Exception {
	
	public WrongNumbaerException() {
		super("[예외발생] 1~3 사이의 숫자를 입력하세요.");
	}
}
public class EXQuScissorsRockPeper {

	public static void gameStart() throws WrongNumbaerException {

		Scanner scanner= new Scanner(System.in);
		Random random = new Random();

		int gameCount=0;
		while(true) {

			int com = random.nextInt(10000) % 3 + 1;

			System.out.println("컴퓨터:"+com);
			int user = 0;
			try {
				System.out.println("가위(1),바위(2),보(3) 입력: ==>");

				user = scanner.nextInt();
			} 
			catch (InputMismatchException e) {
				System.out.println("가위바위보 할줄모름??");
				e.printStackTrace();
				return;
			}








			if(!(user<1 || user>3)) {
				System.out.printf("컴퓨터:%s,사용자:%s",
						displayRPS(com),displayRPS(user));
				switch(user-com) {
				case 0: 
					System.out.println(" 결과: 비겼습니다.");
					break;
				case 1: case -2 :
					System.out.println(" 결과: 이겼습니다.");
					break;
				case 2: case -1: 
					System.out.println(" 결과: 졌습니다.");
					break;
				}
				gameCount++;
			}
			System.out.println("카운트"+gameCount);







			if(gameCount>=5) {
				int restart = -1;
				while(true) {
					try {
						System.out.println("게임재시작(1),종료(0)");

						restart = scanner.nextInt();
						if(restart==1 || restart==0) {

							break;
						}
						else {
							System.out.println("잘못입력!\n");
						}
					} catch (InputMismatchException e) {
						
						e.printStackTrace();
						 gameStart();
						break;
						
					}
					//사용자입력이 1~3이 아니면 사용자정의 예외 발생시킴 
					if(!(user==1 || user ==2 || user ==3));
						WrongNumbaerException wne = new WrongNumbaerException();
						throw wne; //Unhandled exception type WrongNumbaerException 던지는사람은 있고 받는사람이 없으니까 에러뜸 try 지정하거나 
				} 
				
				
				
				
				if(restart ==0) {
					break;
				}
				else {
					System.out.println("게임 재시작");
					//					gameCount=0;
				}
			}








		}//while문 종료
	}
	public static String displayRPS(int n) {
		String str ="";
		switch(n) {

		case 1:
			str="가위"; break;
		case 2:
			str="바위"; break;
		case 3: 
			str="보"; break;
		}
		return str;

	}



	public static void main(String[] args) {
		//가위바위보 메세지 호출 
		try {
			gameStart();
			
		} catch (WrongNumbaerException e) {
			//개발자가 정의한 예외클래스의 에러메세지 출력 
			System.out.println(e.getMessage());
		}

	}
}
