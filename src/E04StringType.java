
public class E04StringType {

	public static void main(String[] args) {
		/*
		 * String��: ������ �����ν� �⺻�ڷ����� �ƴ� 
		 * ���ڿ��� �����Ҽ� �ִ� ������Ÿ������ �����δ� class �̴�.
		 * �ڹٿ����� ���ڿ��� ǥ���Ҷ� "���� ���θ� �ǰ�, �����Ҷ� 
		 * +��ȣ�� ����Ѵ�. 			  
		 * */
		int number;
		number= 99;
		/*
		 * ������������ �⺻�ڷ������� ���̿����� ����ȯ�� �Ұ����ϴ�.
		 * ���� ����ϴ� �޸𸮰����� �ٸ���  �����̴�.
		 * 	�⺻�ڷ��� -> ����(Stack) ���� ���
		 * 	������(Ŭ����) -> ��(Heap)���� ��� 
		 * */
		//String stringNumber1 = "100";
		//String stringNumber2= (String)"100";
		
		
		/*
		 * ���ڿ� + ���� => ���ڿ�
		 * �� ���ڿ��� ������ ����� ���·� ��µȴ�.
		 * 
		 * */
		String strNumber= "100";
		System.out.println(strNumber + number);//��� 10099
		
		/*
		 * String�� Ŭ�����̹Ƿ� new Ű���带 �̿��ؼ� �ν��Ͻ�(��ü)�� 
		 * �������� ���ڿ��� �����Ѵ�.
		 * */
		String newString = new String("new Ű���� ���");
		System.out.println(newString);
		
		String stringBasic = "Ŭ��������";
		String plusString = "�⺻�ڷ���ó�� ���";
		System.out.println(stringBasic  +""+plusString);
		
		/*
		 ���ڿ�+���� => �켱������ ���ٸ� �Ϲ������� ���ڿ��� ��µȴ�.
		 ��, ��������� ����� ����ϰ� �ʹٸ� �Ʒ��� ���� �Ұ�ȣ�� �̿��ؼ�
		 �켱������ ���� ��ȭ�� �ָ�ȴ�. 
		 * */
		
		int kor=100 , eng = 99 , math=98;
		System.out.println("����:"+kor+eng+math);
		System.out.println("����:"+(kor+eng+math));
	}

}
