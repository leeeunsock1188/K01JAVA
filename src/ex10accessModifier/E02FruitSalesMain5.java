package ex10accessModifier;

//과일판매자를 추상화한 클래스 
class FruitSeller3 {///////////////////////////////////////////////////////////////////
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
	public  FruitSeller3(int money, int appleNum ,int price) {
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
//구매자를 표현한 클래스 
	class FruitBuyer3{/////////////////////////////////////////////////////////////
		
		int myMoney;//보유한 금액 
		int numOfApple;//구매한 사과의 갯수 
		
		/*
		 초기화메소드
		 	:멤버변수를 초기화할떄 사용한다. 2차버전에서는
		 	생성자대신 사용되고 있으며, 객체 초기화시 여러줄에
		 	걸쳐 코딩해야 하는 번거로움을 간편하게 해결할수 있다.
		 */
		public FruitBuyer3(int _myMoney, int _numOfApple)  {
			myMoney = _myMoney;
			numOfApple = _numOfApple;
		}
		
	
		public void buyApple(FruitSeller3 saller , int money) {
			numOfApple += saller.saleApple(money);
			myMoney -= money;
		}
		public void showBuyResult() {
			System.out.println("[구매자]현재잔액:"+myMoney);
			System.out.println("[구매자] 사과갯수:"+ numOfApple);
		}
	}
	
public class E02FruitSalesMain5 {////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
	
		/*
		 생성자를 통해서 객체 생성과 동시에 초기화되므로
		 init(초기화메소드)메소드를 호출할 필요가 없어진다.
		 따라서 객체생성 코드를 한줄로 줄일수 있다.
		 */
		//판매자 1
		FruitSeller3 seller1 = new FruitSeller3(0, 100, 1000);
		
		
		//판매자2
		FruitSeller3 seller2 = new FruitSeller3(0,80, 500);
		
		//구매자
		FruitBuyer3 buyer = new FruitBuyer3(10000,0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		/*
		//판매자1,판매자2 에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);*/
		
		/*
		 아래의 코드는 문법적으로 오류가 없으나 지불금액과 구매한
		 사과의 관계가 전혀 맞지 않는 논리적 오류가 발생되었다.
		 즉, 코드(메소드)로 구현한 규칙이 완전히 무너지게 된다.
		 객체지향 언어에서는 이런 논리적 오류를 범하지 아않기위해
		 "정보은닉"이라는 개념을 제시하고 있다. 
		 */
		seller1.myMoney += 1000;//판매자 1에게 1000원을 지불하고
		seller1.numOfApple -= 50;//사과 50개를 구매하였다.
		buyer.numOfApple += 50;
		
		
		seller2.myMoney += 1000;//판매자 2엑게 1000원을 지불하고
		seller2.numOfApple -= 70;//사과 70개를 구매하였다.
		buyer.numOfApple += 70;//하지만 구매자의 보유금액은 차감되지 않았따.
		
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		

	}

}
