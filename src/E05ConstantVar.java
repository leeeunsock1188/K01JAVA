
public class E05ConstantVar {

	public static void main(String[] args) {

		/*
		 * ���: ����� ���� ������ �ʴ� �޸��� ������ 
		 * ������: final �ڷ��� ������ = �ʱⰪ;
		 * ����� �� �ѹ��� �ʱ�ȭ�Ǹ�, �߰��� ���� �����ϸ� �����߻���
		 * ����� ��ü�� �빮�ڷ� �����ϸ�, ����Ǵ� �ܾ ������� _ (�����)
		 * �� ����Ѵ�.
		 * �ַ� ���α׷������� �ڵ��� �������� �����ֱ� ���� Ȱ��ȴ�.
		 * 
		 * */
		
		//����� �����԰� ���ÿ� �ʱ�ȭ
		final double PI = 3.14;
		System.out.println("PI(������)="+PI);
		
		//PI = 3.141592; //����� �ѹ� �ʱ�ȭ �ϸ� ���� �Ұ��� 
		
		//����� �ʱ�ȭ���� ���� ���¿��� ����ϸ� �����߻���.
		final String NICK_NAME;
		NICK_NAME ="�ڽ���61��";
		//System.out.println("�츮��"+ NICK_NAME);
		System.out.println("�츮�� "+ NICK_NAME);
		
		/*
		 * ���� ���� �� ������ �����ϱ� ���� �����ڴ� �Ʒ��Ͱ��� �����Ͽ���.
		 * ����:1, ����:2, ��:3
		 * */
		
		final int SCISSOR =1;
		final int ROCK =2;
		final int PAPER =3;

		int computer, user;
		/*
		 * 1,3�� ������ ���θ� �˼��ִ� �����̹Ƿ�, �������� �������� �ڵ�� 
		 * �ۼ��Ǿ���. 
		 * */
		computer= 1;
		user =3;
		System.out.println("\\ \"��ǻ�Ͱ�\" �̰���ϴ�.");
		
		/*
		 * PAPER�� ���� �ܾ�� ���� ������ �����Ҽ� �����Ƿ� �������� ����
		 * ������� �ڵ尡 �ȴ�. 
		 * */
		
		computer = SCISSOR;
		user= PAPER;
		System.out.println("Computer Win");
	}

}

//�̽������� ������ (�̽�������=Ż��) -���ڿ��ȿ��� Ư���� �ǹ̷� ��� 
