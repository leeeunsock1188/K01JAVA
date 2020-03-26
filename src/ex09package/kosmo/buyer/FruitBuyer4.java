package ex09package.kosmo.buyer;

/*
 FriotSeller4 클래스는 외부 패키지에 정의되어있으므로
 반드시 import해야 한다. buyApple() 메소드에서 
 매개변수로 사용되고 있기 떄문이다. 
 */
import ex09package.kosmo.seller.FruitSeller4;

public class FruitBuyer4{
	
	int myMoney;//보유한 금액 
	int numOfApple;//구매한 사과의 갯수 
	
	/*
	 초기화메소드
	 	:멤버변수를 초기화할떄 사용한다. 2차버전에서는
	 	생성자대신 사용되고 있으며, 객체 초기화시 여러줄에
	 	걸쳐 코딩해야 하는 번거로움을 간편하게 해결할수 있다.
	 */
	public FruitBuyer4(int _myMoney, int _numOfApple)  {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	

	public void buyApple(FruitSeller4 saller , int money) {
		numOfApple += saller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자] 사과갯수:"+ numOfApple);
	}
}