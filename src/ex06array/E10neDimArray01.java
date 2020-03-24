package ex06array;

public class E10neDimArray01 {

	public static void main(String[] args) {
		
		/*
		 자바에서는 배열을 객체를 통해 생성하게 된다.
		 생성된 배열은 힙 (Heap)영역에 저장되고, 할당되 메모리의 
		 주소값을 반환한다. 그래서 배열명(배열변수)는 주소값(참조값)
		 을 할당받게 된다. 해당 주소를 통해 배열에 접근한다.
		 */
		
		//크기가 3인 배열이 선언되었으므로 insdex는 0~2까지 생성된다. 
		int[] numArr = new int[3];
		numArr[0]=10;
		numArr[1]=20;
		numArr[2]=30;
		System.out.println("numArr의 2번방의 값:"+numArr[2]);
		System.out.println("배열명(numArr)="+numArr);
		
		
		
		
		
		
	}

}
