package ex03ooperator;

public class Qu_03 {

	public static void main(String[] args) {
	
		int b = 10;
		double pi = 3.14;
		
		int area_int;
		float area_float;
		double area_double;
		area_double =  b * b * pi;

		System.out.println("반지름의 넓이는:"+ area_double);
		System.out.println("반지름의 넓이는:"+(int) area_double);
		System.out.println("반지름의 넓이는:"+(float)area_double);
	}

}
