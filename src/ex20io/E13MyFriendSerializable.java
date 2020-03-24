package ex20io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/*
 연습문제] 해당 프로그램은 친구의 정보를 저장하게 된다. 프로그램
 종료시 Friend타입의 객체배열에 저장된 친구의 정보를 파일의 형태로
 저장할 수 있도록 직렬화 하시오,
 -저장될파일명: friend_info.obj 
 */

class Friend implements Serializable{ //직렬화하려면 이거 입력해야함   부모에서 Serializable 해서 자식에서는 implements안해도됌 
	String name;//이름 
	String phone;//전화번호
	String addr;//주소

	public Friend(String name, String phone, String addr) {
		this.name =name;
		this.phone=phone;
		this.addr =addr;

	}
	//멤버메소드
	/*
	 멤버변수 전체 정보를 출력하는 메소드 
	 */
	public void showAllDate() {
		System.out.println("이름"+ name);
		System.out.println("전화번호"+ phone);
		System.out.println("주소"+ addr);
	}
	/*
	 간략한 정보만을 출력하는 메소드로, 현재 실행부가 없는 상태로
	 정의되었다. 여기서는 오버라이딩을 목적으로 정의되었다.
	 */
	public  void showBasicInfo() {}
}
//고딩친구
class HighFriend extends Friend {//커넥션? 생겼음 프랜드랑 하이 프랜드랑
	String nickname; // 자식에서 확장한 멤버변수 
	public HighFriend(String name,
			String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	/*
		 고딩친구의 전체정보 출력을 위해 부모에서 정의된 메소드를
		 super를 통해 호출하고, 자식에서 확장한 변수를 별도의
		 print문을 통해 출력하고있다. 
	 */
	public void showAllDate() {
		System.out.println("==고딩친구 (전체정보)==");
		super.showAllDate();
		System.out.println("별명:"+nickname);
	}
	/*
		자식에서 오버라이딩 하여  재정의한 메소드로 고딩친구의
		간략정보를 출력한다. 
	 */
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명:"+ nickname);
		System.out.println("전번:"+phone);

	}
}
class UnivFriend extends Friend {
	String major;
	public UnivFriend(String name, String phone
			, String addr, String major) {
		super(name, phone, addr);
		this.major =major;
	}
	public void showAllDate() {
		System.out.println("==대딩친구 (전체정보)==");
		super.showAllDate();
		System.out.println("전공:"+major);
	}
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름:"+ name);
		System.out.println("전화번호:"+phone);
	}


}



	public class E13MyFriendSerializable {
		//프로그램에서의 입력메뉴 출력 
		public static void menuShow() {
			System.out.println("***메뉴를 선택하세요***");
			System.out.println("1. 고딩친구 입력:");
			System.out.println("2. 대딩친구 입력:");
			System.out.println("3. 전체정보 출력:");
			System.out.println("4. 간략정보 출력");
			System.out.println("5. 검색");
			System.out.println("6 삭제");
			System.out.println("7 프고르매 종료");
			System.out.print("메뉴선택>>");
		}


		public static void main(String[] args) {

			//프로그램 전반에 대한 비즈니스로직을 가진 핸들러 객체 생성 
			FriendInfoHandler handler = new FriendInfoHandler(100);

			while(true) {
				//메뉴출력을 위한 메소드 호출 
				menuShow();
				
				Scanner scanner = new Scanner(System.in);
				int choice = scanner.nextInt();

				switch(choice) {
				case 1 :  case 2: 
					handler.addFriend(choice);
					break;
				case 3: 
					//전체정보 출력 
					handler.showAllDate();
					break;
				case 4:
					//간략정보 출력
					handler.showSimpleData();
					break;
				case 5: 
					//친구정보검색
					handler.searchInfo();
					break;
				case 6:
					//친구정보삭제
					handler.deleteInfo();
					break;
				case 7:
					handler.saveFeriendInfo();
					System.out.println("프로그램을 종료합니다.");
					return; //main함수의 종료는 프로그램 종료로 이어진다 
				}
			}//end of while
		}//end of main
	}// end of class
	class FriendInfoHandler {
		//친구정보를 파일형탵로 저장하기 
		public void saveFeriendInfo() {
			
			try {
				ObjectOutputStream out =  new ObjectOutputStream(
						new FileOutputStream("src/ex20io/friend_info.obj")
						);
				
				//myFriends 객체배열에 저장된 친구의 정보만큼 반복
				for(int i=0; i<numOfFriends; i++) {
					//객체배열의 iㅂ먼쨰 요소를 파일로 저장 
					out.writeObject(myFriends[i]); //저장하는 문장 저장하는 (객체는) 
				}
			} catch (Exception e) {
				System.out.println("예외발생");
				e.printStackTrace();
			}
		}

		//멤버변수 
		/*
		 Friend타입의 객체배열은 하위클래스인 High, Univ객체를
		 모두 저장할수 있으므로 , 하나의 배열내에 2개의 객체를 
		동시에 저장하여 관리할수 있다. 
		 */
		private Friend[] myFriends;
		private int numOfFriends; //친구정보를 추가할떄마다 +1 증가 

		//생성자 :인자로 전달되는 num크기로 객체배열을 생성한다. 
		public FriendInfoHandler(int num) {
			myFriends = new Friend[num];
			numOfFriends = 0;
		}
		//새로운 친구 입력
		public void addFriend(int choice) {
			
			//사용자로부터 친구정보를 입력받기위한 준비 
			Scanner scanner = new Scanner(System.in);
			String iName,iPhone,iAdder,iNickname,iMajor;

			//공통사항 입력받기 
			System.out.print("이름:");iName= scanner.nextLine();
			System.out.print("전화번호::");iPhone =scanner.nextLine();
			System.out.print("주소:");iAdder= scanner.nextLine();

			/*
			 1. 친구정보를 입력받은후...
			 2. 객체배열 0번방에 객체를 저장하고...
			 3. mumOfFriends변수를 1 증가시킨다.(후위증가)
			 
			 */
			if(choice==1) {
				//고딩친구 입력
				System.out.print("별명:"); iNickname = scanner.nextLine();
				HighFriend hige = new HighFriend(iName, iPhone, iAdder, iNickname);
				myFriends[numOfFriends++] = hige;
			}
			else if(choice ==2) {
				//대딩친구 입력
				System.out.print("전공:"); iMajor =scanner.nextLine();
				myFriends[numOfFriends++] =
						new UnivFriend(iName, iPhone, iAdder, iMajor);

			}
			System.out.println("친구정보 입력이 완료되었습니다");
		}///// end of addFriend
	
		//친구정보 전체보기
		public void showAllDate() {
			for(int i=0; i<numOfFriends ; i++ ) {
				myFriends[i].showAllDate();
			}
			System.out.println("==전체정보가 출력되었습니다.==");
		}////end of showAllDate
		
		//친구정보 간략보기
		/*
		 1. 고딩친구 정보를 Friend 추가 
		 2. High객체가 Friend타입으로 자동형변환되어 저장
		 3. 객체배열에 저장된 객체들을 for문을 통해 순차적으로 출력 
		 	이떄 오버라이딩된 메소드를 통해 항상 해당 객체의
		 	정보를 출력할수 있음.(참조변수의 타입에 영향을
		 	받지 않음)
		 */
		public void showSimpleData() {
			for(int i=0; i<numOfFriends ; i++ ) {
				myFriends[i].showBasicInfo();
			}
			System.out.println("==간략정보가 출력되었습니다.==");
		}//// end of showSimpleData
		
		//주소록 검색
		public void searchInfo() {
			Scanner scan = new Scanner(System.in);
			System.out.print("검색할 이름을 입력하세요:");
			String searchName =scan.nextLine();
			
			for(int i=0; i<numOfFriends; i++) {
				 System.out.println("검색중인이름:"+myFriends[i].name);
				 
				 //검색할 이름과 객체의 이름이 일치하는 경우 모든정보를 출력함.
				if(searchName.compareTo(myFriends[i].name)==0) {
					
					myFriends[i].showAllDate();
					
					System.out.println("**귀하가 요청하는 정보를 찾았습니다**");
				}
			}
		}////end of searchInfo
		//주소록 항목 삭제 
		public void deleteInfo() {
			Scanner scan = new Scanner(System.in);
			System.out.print("삭제할 이름을 입력하세요.");
			String deleteName = scan.nextLine();
			
			/*
			 배열의 요소중 삭제된 요소의 인덱스값을 저장할 용도로 변수 
			 요소를 삭제한후 빈자리를 채울때 사용할 예정임. 
			 */
			int deleteIndex = -1; 
			for(int i=0; i<numOfFriends; i++) {
				if(deleteName.compareTo(myFriends[i].name)==0){
					//요소를 삭제하기 윟새 참조값을 null로 변경
					myFriends[i] = null;
					//삭제된 요소의 인덱스값 저장
					deleteIndex = i;
					//전체카운트 변수 -1 차감 
					numOfFriends--;
				}
			}
			
			if(deleteIndex==-1) {
				// 검색된 데이터가 없는경우... 
				System.out.println("===삭제된 데이터가 없습니다==");
			}
			else {
				/*
				 객체배열에서 검색된 요소를 삭제한후 입력된 위치의 바로뒤 요소를 
				 핲으로 하나씩 교환한다.
				 */
				for(int i=deleteIndex; i<numOfFriends; i++) {
					myFriends[i] = myFriends[i+1];
					
				}
				System.out.println("===데이터("+deleteIndex+"번) 가 삭제되었습니다--");
			}
			
			
		}///end of deleteInfo
	}///end of FriendInfoHandler



