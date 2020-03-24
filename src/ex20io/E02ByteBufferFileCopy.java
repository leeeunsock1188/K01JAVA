package ex20io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 1byte씩 읽어서 저장하는 것보다 1024byte씩 읽을수 있는
 버퍼 (Buffer)를 이용하므로 복사 속도가 훨씬 빠르다.
 스트림 혹은 네트워크를 통해 파일을 전송할떄 버퍼를 사용하는
 이유는 바로 이런 속도차 떄문이다. 
 */
public class E02ByteBufferFileCopy {

	public static void main(String[] args) {
		
		
		try { //input output 생성ㅅ 하는거 
			InputStream in = new FileInputStream("src/ex20io/A38Http2.zip");
			OutputStream out = new FileOutputStream("src/ex20io/A38Http2_copy2.zip");
			
			int copyByte = 0; 
			int readLen; 
			/*
			 1Kbyte씩 읽어서 저장하기 위한 버퍼 생성  
			 */
			//정수 int long byte shout  
			byte buffer[] = new byte[1024];
			
			while(true) {
				//1Kbyte씩 파일을 읽어옴 
				readLen =in.read(buffer);
				if(readLen==-1) {
					break;
				}
				/*
				 읽어온 내용을 파일에 입력함. 버퍼에 저장된 데이터를 
				 인덱스 0의 위치에서 readLen의 크기만큼 정송한다.
				 */
				out.write(buffer,0,readLen); 
				copyByte += readLen;
			}
			if(in!=null) in.close();
			if(out!=null) out.close();
			
			System.out.println("복사된 파일크기:"+ copyByte +"byte");
			System.out.println("복사된 파일크기:"+ (copyByte/1024) +"Kbyte");
			System.out.println("복사된 파일크기:"+ (copyByte/(1024*1024)) +"Mbyte");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다");
			// TODO: handle exception
		}
		catch (IOException e) {
			System.out.println("IO작업중 예외가 발생되었습니다");
		}
		catch (Exception e) {
			System.out.println("알수없는 에외가 발생되었습니다");
		}
	}

}
