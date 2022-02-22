package kh.java.io._byte.object;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectIOStudy {
	public static void main(String[] args) {
		ObjectIOStudy study = new ObjectIOStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	/**
	 * 저장된 객체의 수를 모르는 상황에서의 처리
	 */
	public void test3() {
		User[] users = new User[100]; // 모자라지않을 충분한 크기로 선언
		int index = 0; // 인덱스 관리변수, 입력된 객체 수

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.txt"));) {
			while (true) {
				User user = (User) ois.readObject();
				// 더이상 읽을 객체가 없을 때 EOFException(End Of File) 발생

				users[index++] = user;
			}
		} catch (EOFException e) {
			for (int i = 0; i < index; i++) {
				System.out.println(users[i]);
			}
		} catch (ClassNotFoundException | IOException e) {
			// multi catch절(1.7~) - 관련없는 예외클래스를 묶어서 처리할 수 있음
			e.printStackTrace();
		}
	}
	
	/**
	 * 같은 파일에 대하여 입출력스트림을 동시에 처리하지 말 것
	 */
	public void test2() {
		
//		FileInputStream fis = new FileInputStream("users.txt");
//		ObjectInputStream ois = new ObjectInputStream(fis);

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.txt"));) {
			User[] users = new User[3];

			for (int i = 0; i < users.length; i++) {
				users[i] = (User) ois.readObject(); // down casting
			}

			for (User user : users)
				System.out.println(user);

		} catch (ClassNotFoundException | IOException e) {
			// multi catch절(1.7~) - 관련없는 예외클래스를 묶어서 처리할 수 있음
			e.printStackTrace();
		}
	}

	/**
	 * ObjectInputStream | ObjectOutputStream
	 *  - 객체 단위로 읽고 쓰기 가능한 보조스트림
	 *  - FileInputStream | FileOutputStream 주스트림과 함께 사용해야함
	 *  
	 *  - 읽고 쓰기 할 객체의 클래스는 Serializable인터페이스를 반드시 구현해야함
	 *  - 직렬화 가능이 반드시 필요
	 */
	public void test1() {
		
		User[] users = new User[3];
		users[0] = new User("hong", "1234", 1000);
		users[1] = new User("sinsa", "1234", 2000);
		users[2] = new User("kingSJ", "1234", 3000);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.txt"));) {
			for(int i = 0; i<users.length ; i++) {
				oos.writeObject(users[i]); // User객체 단위로 출력!
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
