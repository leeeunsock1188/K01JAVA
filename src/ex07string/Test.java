package ex07string;

public class Test {

	public static void main(String[] args) {

		int result;
		for(int i =2; i<=9; i++) {
			result = i; 
			System.out.println(i+"X"+1+"=" + result);

			for(int j=2; j<=10; j++) {
				result = (int)Math.pow(i, j);


				System.out.print(i);
				for(int k=1; k<=j-1; k++) {
					System.out.println("X" + i);
				}
				System.out.println("="+result);
			}



		}



	}
}

