package com.io.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) {
		Test1 hw = new Test1();
//		hw.fileSave();
		hw.fileRead();
	}

	// 실습문제 1
	public void fileSave() {
		String input = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = null;

		try {
			fw = new FileWriter(new File("fileSave.txt"));
			System.out.println("파일에 저장할 내용을 입력하시오.");

			while ((input = br.readLine()) != null) {
				if (input.equals("exit"))
					break;
				fw.write(input);
				fw.write("\n");
			}
			System.out.println("파일에 성공적으로 저장되었습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 실습문제 2
	public void fileRead() {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			// 대상파일 선택
			System.out.println("읽을 대상파일명 입력 :");
			String fileName = br.readLine();
			// BufferedReader의 주스트림을 FileReader로 변경
			br = new BufferedReader(new FileReader(fileName));

			// 파일 읽기용 스트림 객체
			fr = new FileReader(fileName);

			// 문자열 저장용 StringBuilder객체 생성
			StringBuilder sb = new StringBuilder();

			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}

			// 결과 출력
			String result = sb.toString();
			System.out.println(result);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			// 자원반납
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
