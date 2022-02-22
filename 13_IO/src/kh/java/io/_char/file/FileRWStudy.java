package kh.java.io._char.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRWStudy {
	public static void main(String[] args) {
		FileRWStudy study = new FileRWStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	/**
	 * try with .. resource
	 *  - try() 안에 "선언"한 스트림 객체는 자동으로 반납
	 *  - 1.7부터 지원
	 */
	public void test3() {
		File inFile = new File("sample.txt");
		File outFile = new File("sampleCopy2.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(inFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));) {

			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println(data);

				bw.write(data); // 개행문자가 제거된 data가 파일에 출력됨
				bw.write("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test2() {
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			File inFile = new File("sample.txt");
			File outFile = new File("sampleCopy2.txt");

			br = new BufferedReader(new FileReader(inFile));
			bw = new BufferedWriter(new FileWriter(outFile));
			
			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
				
				bw.write(data); //개행문자가 제거된 data가 파일에 출력됨
				bw.write("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 텍스트파일을 읽는 데 특화된 문자기반 스트림
	 *  - 주스트림 : FileReader | FileWriter
	 *  - 보조스트림 : BufferedReader | BufferedWriter
	 */
	public void test1() {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			// 존재하는or존재하지않는 파일or디렉토리를 가리키는 자바객체
			File inFile = new File("sample.txt"); 
			File outFile = new File("sampleCopy2.txt"); 
			
			fr = new FileReader(inFile);
			fw = new FileWriter(outFile);
			
			int data = 0;
			
			while ((data = fr.read()) != -1) {
				System.out.println((char)data);
				
				fw.write(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			try {
				fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
