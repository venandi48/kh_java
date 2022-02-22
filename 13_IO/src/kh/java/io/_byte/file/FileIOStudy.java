package kh.java.io._byte.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStudy {
	public static void main(String[] args) {
		FileIOStudy study = new FileIOStudy();
		study.test1();
	}
	
	/**
	 * 대상이 file인 입출력스트림
	 *  - 기본스트림 FileInputStream | FileOutputStream
	 *  - 보조스트림 BufferedInputStream | BufferedOutputStream
	 */
	public void test1() {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		// 파일경로는 프로젝트 루트기준으로 조회
		try {
			bis = new BufferedInputStream(new FileInputStream("C:/Users/ej_lee/Desktop/새 폴더/♥/보정본/KakaoTalk_20220207_095102973_01.jpg"
					+ ""));
			bos = new BufferedOutputStream(new FileOutputStream("photoCopy.jpg")); 
			// 해당 파일이 없으면 새로 생성
			// 해당 경로가 디렉토리 또는 권한 부족 시 FileNotFoundException던짐
			
			int len = 0; // 읽어온 byte수
			byte[] bytes = new byte[8192]; // buffered reader 내부적으로 사용하는 버퍼크기
			
			// 파일을 모두 읽었으면 값없음(-1) 리턴
			while ((len = bis.read(bytes)) != -1) {
				System.out.println(len);
				bos.write(bytes, 0, len); // sampleCopy.txt에 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 사용한 자원은 반드시 반납!!!!
			// 보조스트림 반납하면 주스트림도 내부적으로 함께 반납
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
