package ex05method;
/*
  문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
공식]
  화씨 = 1.8 * 섭씨 + 32
  섭씨 = (화씨 - 32) / 1.8
*/
public class QuTemperature {
	
	//섭씨 -> 화씨 
	static double celsiusToFahrenheit(int cel){
		return 1.8 * cel + 32;
	}
	
	static double fahrenheiTotcelsius(int fah){
		return (fah - 32) / 1.8;
	}
	//화씨 -> 섭씨 
	
	

	public static void main(String[] args) {
		
		System.out.println("섭씨20도 -> 화씨");
		System.out.println(celsiusToFahrenheit(20));
		
		System.out.println("화씨98도 -> 섭씨");
		System.out.println(fahrenheiTotcelsius(98));

	}

}

//섭씨  : 물의 끓는점과 물의 어는점을 온도의 표준으로 정하여, 그 사이를 100등분한 온도눈금이다.

