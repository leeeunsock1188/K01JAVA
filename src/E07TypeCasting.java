
public class E07TypeCasting {

	public static void main(String[] args) {

		
		/*
		 �ڵ�����ȯ: ���������� �����͸� ū���ڿ� �����ҋ� �ڵ����� 
		 ����ȯ�� �Ͼ��.
		 
		 * */
		
		byte b1 = 65;
		short s1;
		s1 = b1;
		System.out.printf("b1�� %d, s1�� %d%n", b1,s1);
		
		/*
		 �Ʒ��ڵ�� �ڵ�����ȯ�� �ƴ�. CPU�� int���� ���� �ڷ����� 
		 int�� �����ϰ� ������ �����ϸ�, ����� int�� ��ȯ�Ѵ�. 
		 CPU�� Ư���̶� ��������. 
		 * */
		int num1 = b1 + s1;
		int num2 = num1;
		System.out.println("num1��"+ num1);
		
		/*
		 char��(����Ÿ��)�� byte�� (����Ÿ��)�� �ٷ� �����Ҽ� ����.
		 ������ �ٸ��Ƿ� ����� ����ȯ�� �����ؾ� �Ѵ�. 
		 */
	    //char ch1 = b1;	// �����߻�
		char ch2 = (char) b1;
		System.out.println("b1="+b1 + ",ch2="+ch2);
		
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.printf("�����͹̼ս�:b2=%d, s2=%d\n", b2,s2);
		/*
		 �Ҽ��� �Ʒ��κ��� �������Ƿ� ������ �սǵ�, ���� Ư���� ��찡 �ƴ϶�� ����� 
		 �����ϴ°��� ����. 
		 */
		int num3;
		double dl=3.14;
		num3= (int)dl;
		System.out.printf("�����ͼս�:num3=%d, dl=%.2f %n",num3,dl);
		/*
		 ����� ����ȯ: ū������ �ڷḦ ���������� �ڷ����� �Ҵ��ؾ� �Ҷ� 
		 ����Ѵ�. ��, �̶��� �������� �ս��� ������ �����Ƿ� ���Ǹ� ���Ѵ�.
		 */
		
		/*
		 char�� int�� �����ϸ� ����� int�� ��ȯ�ϹǷ� char�� ������ 
		 �����Ϸ��� ����� ����ȯ�� �ؾ��Ѵ�. 
		 */
		char ch3= 'A', ch4;
		int num4 =2; 
		
		
		//ch4= ch3 + num4; // Ÿ���� �����ʾ� �����߻�
		ch4= (char)(ch3 + num4);
		System.out.println("ch4="+ch4);
	}

}
