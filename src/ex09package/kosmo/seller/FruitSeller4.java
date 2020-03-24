package ex09package.kosmo.seller;

public class FruitSeller4 {
	int numOfApple; // 판매자의 사과 보유 갯수 
	int myMoney; // 판매수익 
	final int APPLE_PRICE; //다시 상수로 선언함.
	/*
	 상수는 값의 변경이 불가능하고 단 한번만 초기화
	 때문에 일반적인 멤버메소드에서는 초기화 할수 없다,
	 단, 생성자메소드에서는 초기화가 가능하다.
	 마음대로 호출할수 없고, 객체생성시 단 한번만 호출되는
	 특성이 동일하기 떄문에 한번이상 초기화 되지 않음이
	 보장되기 떄문이다. 
	 */
	
	/*
	 apple_price를 상수에서 변수로 변경한 이유는 
	 상수는 단 한번만 초기화되는 특성떄문에 일반적인 멤버메소드
	 내에서는 초기화할수 없다. 멤버메소드는 개발자가 원할떄
	 언제든지 호출할수 있기 때문에 상수의 특성과는 맞지 않기
	 때문이다.
	*/
	public  FruitSeller4(int money, int appleNum ,int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price; // <= 생성자 내에서는 상수를 초기화할수 있
	}

	public int saleApple(int money) {
		int num = money /APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}
