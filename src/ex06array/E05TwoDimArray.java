package ex06array;

public class E05TwoDimArray {

	public static void main(String[] args) {
		
		/*
		 아래와 같이 2차원배열을 초기화하면 세로크기3, 가로크기4로 
		 설정된다. 초기화할 요소가 없는 부분은 null로 채워지게 된다ㅓ.
		 ※null값: 아무것도 없는 값을 일컫는다. 즉 빈값을 말한다. 
		 스페이스와 같은 공백 문자와는 다르다는 것에 주의하자. 
		 */
		
		int[][] arr = {
				{1,2},//1,2 ==2
				{3,4,5}, // 3,4,5 ==3 
				{6,7,8,9}// 6,7,8,9 == 4
						
				};
		
		/*
		 2차원배열에서 "배열명.length"로 출력하면 세로크기가  반환된다.
		 */
				System.out.println("배열의 세로크기:"+arr.length) ;
				System.out.println("배열명이 가진값 출력(arr):"+ arr);
				/*
				 각 행의 가로크기는 초기화된 상태에 따라 다를수 있따. 
				 0행은 2,2행은 4의 크기를 출력하게 된다. 
				 */
		
				for(int i =0; i<arr.length; i++) {
					System.out.printf("%d행의크기: %d\n", i, arr[1].length);
					System.out.printf("%d행 출력%s\n",i,arr[i]);
				}
				System.out.println("배열 출력하기");
				System.out.println("arr[0][1]="+arr[0][1]);//정상출력
//				System.out.println("arr[0][1]="+arr[0][3]);//예외출력
				
				/*
				 ArrayIndexOutOfBoundsExcep[tion 예외발생됨
				 즉, 배열의 index를 초과했다는 뜻. 
				 */
		

	}
	
}