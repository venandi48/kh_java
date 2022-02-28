package kh.java.collections.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * 
 * Properties
 *  - K, V의 타입이 <String, String>으로 단순화(고정) 된 컬렉션 클래스
 *  - 설정정보 표현에 최적회된 타입
 * 
 * Properties객체 -> 설정파일 출력
 * 설정파일 입력 -> Properties객체
 *
 */
public class PropertiesStudy {
	public static void main(String[] args) {
		PropertiesStudy study = new PropertiesStudy();
//		study.test1();
		study.test2();
	}

	/**
	 * 설정파일 입력 -> Properties객체
	 */
	private void test2() {
		Properties prop = new Properties();

		try (FileReader fr = new FileReader("user-info.properties");
				FileInputStream fis = new FileInputStream("user-info.xml")) {
//			prop.load(fr);
			prop.loadFromXML(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(prop);

		System.out.println(prop.getProperty("id"));
		System.out.println(prop.getProperty("pw"));
		System.out.println(prop.getProperty("birthday"));
		System.out.println();
		
		// 모든 요소 열람
		Set<String> keySet = prop.stringPropertyNames(); // key값 가져와서 Set만듦
		for (String key : keySet) {
//			System.out.println(key);
			String value = prop.getProperty(key);
			System.out.println(key + " = " + value);
		}
	}

	/**
	 * Properties객체 -> 설정파일 출력
	 */
	public void test1() {
		Properties prop = new Properties();

		// 요소 저장 : setProperty
		prop.setProperty("id", "honggd");
		prop.setProperty("pw", "1234");
		prop.setProperty("birthday", "1999/09/09");
		System.out.println(prop);

		// 요소 가져오기 : getProperty
		System.out.println(prop.getProperty("id"));
		System.out.println(prop.getProperty("pw"));
		System.out.println(prop.getProperty("birthday"));

		// 설정파일 출력
		try (FileWriter fw = new FileWriter("user-info.properties");
				FileOutputStream xmlFos = new FileOutputStream("user-info.xml")) {
//			prop.store(fw, "user-info"); // 매개인자: 파일출력 스트림, 주석
			prop.storeToXML(xmlFos, "user-info"); // xml문서 출력용
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
