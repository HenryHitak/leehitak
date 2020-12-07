package kr.or.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) throws Exception {
		// 내 PC에 저장된 텍스트 메모장 파일 읽어들이고 출력하기 구현
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		//오브젝트, 실행가능한 클래스형 변수 생성, 인스턴스(실행)
		try {
			fileInputStream = new FileInputStream("C:\\egov\\workspace\\leehitak\\manifest.yml");
			//fileOutputStream = new FileOutStream("");//신규파일에 저장하는 클래스 명령어 집합
			//지금 반복문으로 for (시작;끝;증가)만 사용, for 대신에 while(조건동안) {구현을 반복}
			int byte_content;
			while( (byte_content = fileInputStream.read()) != -1) {//-1은 문서끝을 읽어들일때까지
				System.out.println("바이트형 문자 읽어들이기" + (char)byte_content);
			}
		} catch (FileNotFoundException e) {
			System.out.println("경로에서 파일을 찾을 수 없습니다." + e.toString());
			e.printStackTrace();
		}
	}

}
