package ex12inheritance;

public class MyFriendInfo {

	
		private String name;
		int age;
		
		//인자생성자
		public MyFriendInfo(String n, int a ) {
			name = n;
			age = a; 
		}
		public void ShowMyFriendInfo() {
			System.out.println("이름: "+ name);
			System.out.println("나이: "+ age);
		}
	}

	//친구의 기본정보 외 상세정보를 저장할 클래스
	class MyFriendDetailInfo extends MyFriendInfo
	{
			private String addr;
	    	private String phone;
	    	
	    	//인자생성자
	    	public MyFriendDetailInfo(String _name, int _age, String _addr , String _phone) {
				
	    		super( _name , _age); //부모 
	    		addr = _addr;
	    		phone = _phone;
	    		
			}

		public void ShowMyFriendDetailInfo()
		{
			/*
			 부모클래스의 멤버메소드를 호출할떄 명시적으로 super를 
			 붙여주는것이 좋다
			 */
			ShowMyFriendInfo();
			System.out.println("주소: "+ addr);
			System.out.println("전화: "+ phone);
		}
	}
	class QuMyFriendDetailInfo
	{
		public static void main(String[] args)
		{
			
			
			
			//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
			MyFriendDetailInfo info = new MyFriendDetailInfo("랩몬스터", 27, "빅히튿Ent", "010-1234-5678");
					
			//정보Print
			info.ShowMyFriendDetailInfo();
		}
	}
