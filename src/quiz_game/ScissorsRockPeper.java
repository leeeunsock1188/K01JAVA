package quiz_game;

import java.util.Random;
import java.util.Scanner;

public class ScissorsRockPeper {

	public static void gameStart() {
		int gameCount =0;
		
		Scanner scanner= new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			
		int com = random.nextInt(10000) % 3 + 1;
		
		System.out.println("컴퓨터:"+com);
		System.out.println("가위(1),바위(2),보(3) 입력: ==>");
		int user = scanner.nextInt();


		if(!(user<1 || user>3)) {
			 System.out.printf("컴퓨터:%s,사용자:%s",
					 displayRPS(com),displayRPS(user));
			 switch(user-com) {
			 case 0: 
				 System.out.println(" 결과: 비겼습니다.");break;
			 case 1: case -2 :
				 System.out.println(" 결과: 이겼습니다.");break;
			 case 2: case -1: 
				 System.out.println(" 결과: 졌습니다.");break;
			 }

			 gameCount ++;
		}
		else {
			System.out.println("가위바위보 할줄모르남?");
		}
		if(gameCount>=5) {
			int restart;
			while(true) {
				System.out.println("게임재시작(1),종료(0)");
				restart = scanner.nextInt();
				if(restart==1 || restart==0) {
					break;
				}
				else {
					System.out.println("잘못입력!\n");
				}
			}
			if(restart ==0) {
				break;
			}
			else {
				System.out.println("게임 재시작");
				gameCount=0;
			}
		}
		}
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
		gameStart();

	}
}
