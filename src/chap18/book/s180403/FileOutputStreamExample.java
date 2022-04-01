package chap18.book.s180403;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalfileName =
				"C:\\Users\\user\\Desktop\\work\\java\\workspace\\java20220224\\src\\chap18\\book\\s180403\\FileOutputStreamExample/참조타입08.png";
		String targetFileName = "C:/Temp/참조타입08.png";
		
		FileInputStream fis = new FileInputStream(originalfileName);
		FileOutputStream fos = new FileOutputStream(originalfileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
