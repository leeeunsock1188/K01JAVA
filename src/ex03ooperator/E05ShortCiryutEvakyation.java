package ex03ooperator;

public class E05ShortCiryutEvakyation {

	/*
	 SCE(Short=Circuit Evaluation)
	 하나의 조건감사만으로 결과를 알수있는 경우 Java 컴파일러는
	 뒤에 조건을 수행하지 않고 건너뛰거 된다. 이경우 변수의 
	 값이 변경되는 코드가 있다면 실행되지 않으므로 주의해야 한다.
	 */
	public static void main(String[] args) {
		
		int num1=0, num2=0;
		boolean result;
		
		/*
		 &&(논리And)의 경우 둘중 하나만 fales이면 false를 반환하므로
		 첫번째 조건이fales이면 두번째 조건을 검사(수행)하지 않는다. 
		 */
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("result="+ result);//false
		System.out.println("num1="+num1 + ", num2="+num2);//10 , 0
		
		/*
		 ||(논리Or)의 경우 둘중 하나만 true이면 true를 반환하므로 
		 첫번째 조건이 true이면 두번째 조건을 검사하지 않는다. 
		 */
		result = (num1+=10)>0 || (num2+=10)>0;
		System.out.println("result="+result);//true
		System.out.println("num1="+num1 +", num2="+num2);//20 , 0
		
		/*
		 따라서 num2의 결과가 프로그램에 영향을 미치게되는 경우라면
		 별도의 처리를 해야하고 코드작성에 주의해야 한다.
		 */
	}

}
