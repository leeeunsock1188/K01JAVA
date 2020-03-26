package ex09package;

import ex09package.kosmo.seller.FruitSeller4;
import ex09package.kosmo.buyer.FruitBuyer4;
/*
연습문제] 해당 프로그램을 아래의 지시에 따라 패키지로 
구분하여 정상 실행되도록 변경하시오.

FruitSeller4 클래스 -> ex09package.kosmo.seller 패키지에 묶는다.
FruitBuyer4 클래스 -> ex09package.kosmo.buyer 패키지에 묶는다.

두 클래스를 적당히 import하여 정상동작할수 있도록 
FruitSalesMain4 클래스를 구성한다.
 */

//과일판매자를 추상화한 클래스 

	
//구매자를 표현한 클래스 
	
	
public class FruitSalesMain4 {

	public static void main(String[] args) {
	
		/*
		 생성자를 통해서 객체 생성과 동시에 초기화되므로
		 init(초기화메소드)메소드를 호출할 필요가 없어진다.
		 따라서 객체생성 코드를 한줄로 줄일수 있다.
		 */
		//판매자 1
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		
		
		//판매자2
		FruitSeller4 seller2 = new FruitSeller4(0,80, 500);
		
		
		FruitBuyer4 buyer = new FruitBuyer4(10000,0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자1,판매자2 에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		

	}

}
