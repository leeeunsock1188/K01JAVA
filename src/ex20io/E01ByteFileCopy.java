package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamField;
import java.io.OutputStream;

/*
 스트림 (Stream)
 	:IO모델의 핵심개념이라 할수있는 스트림은 '데이터의 흐름'
 	혹은 '데이터의 호름을 형성해주는 통로 ' 정도로 정의할수있다,.
 	입력(Input)스트림과 출력 (Output)스트림으로 나눌수있다
 */
public class E01ByteFileCopy {
	/*
	 IO관련 작업에서는 많은 부분에서 예외처리가 필요하다.
	 이떄 예외를 throws하는것보다 try~chtch로 에외처리를
	 해주는것을 권장하고 있다. 예외를 무시하게 되면 문제가
	 생겼을때 적절한 조치를 취하기 힘들기떄문이다.
	 */

	public static void main(String[] args) {
	
		InputStream in = null;
		OutputStream out = null;
		int copyByte = 0;
		try {
			
			//원본파일을 읽어오기위한 입력스트림 생성 
			in = new FileInputStream("src/ex20io/A38Http2.zip");
			//복사본을 만들기 위한 출력스트림 생성
			out = new FileOutputStream("src/ex20io/A38Http2_copy.zip");
				 int bDate;//원본에서 1byte를 읽어 저장하기 위한 변수  ==> 바이트스트림이라고 읽음 바이트단위로 읽기떄문에 
				 while(true) {
					 //원본파일에서 1byte씩 읽어옴
					 bDate = in.read();
					 
					 if(bDate == -1) 
					 {
						 //파일의 끝까지 읽으면 -1을 반환하므로 탈출한다. 
						 break;
					 }
					 //읽어온 데이터를 복사본에 입력 
					 out.write(bDate);
					 
					 copyByte++;
		
				 }
		
	
				 
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지않습니다.");
		}
			catch (IOException e) {
				System.out.println("파일스트림 생성시 오류발생됨");
			}
		finally {
			try {
				//입출력이 완료되면 생성한 스트림을 닫아준다.  .
				
				
				in.close();
				out.close(); // input output 열면 반드시 close로 닫아줘야함 
				System.out.println("복사된  KByte크기:"+ copyByte/1024);
			} catch (IOException e) {
				System.out.println("파일스트림 닫기 오류 ");
			}
		}
	}
}
