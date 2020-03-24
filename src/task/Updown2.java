package task;

import java.util.Random;
import java.util.Scanner;

public class Updown2 {
	
	public static void replay() {
		System.out.println("다시실행(1) 종료(0)");
		
		Scanner scan = new Scanner(System.in);
		int ranNum = scan.nextInt();
		if(ranNum<0 || ranNum>1) {
			System.out.println("숫자를 잘못입력했습니다.");
			replay();
		}
		if(ranNum==1) {
			showran();
		}
		else {
			return;
		}
	}
	public static void showran() {
		int ranNum= (int)(Math.random()*100)%100+1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("랜덤숫자");
		for(int i=1; i<=7; i++) {
			int num = scanner.nextInt();
			System.out.println(i+"번쨰 숫자를 입력하세요:");
			if(num<0 || num>100) {
				System.out.println("1~100까지만 입력하세요 시바라 ");continue;
				
			}

			if(num<ranNum) {
				System.out.println("업!");
			}else if(num > ranNum) {
					System.out.println("다운!!");
				}
				else if(num==ranNum) {
					System.out.println("정답!!");break;
				}
			if(i==7) {
				System.out.println("실패");
			}
			}
			replay();
	}


	public static void main(String[] args) {
			
		showran();
		
		}
	}

