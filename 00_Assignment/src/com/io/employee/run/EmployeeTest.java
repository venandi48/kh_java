package com.io.employee.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.io.employee.model.vo.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeTest hw = new EmployeeTest();
		hw.savaEmployee();
		hw.loadEmployee();
	}

	// 파일 입력
	private void loadEmployee() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.dat"))) {
			for (int i = 0; i < 3; i++) {
				Employee e = (Employee) ois.readObject();
				e.printEmployee();
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 파일 출력
	public void savaEmployee() {
		Employee[] emp = new Employee[3];
		emp[0] = new Employee(0, "신짱구", '남', "01011112222", "말썽부", 10_000, 0.02);
		emp[1] = new Employee(0, "신짱아", '여', "01033334444", "유아부", 5_000, 0.05);
		emp[2] = new Employee(0, "김철수", '남', "01077776666", "범생부", 20_000, 0.1);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"))) {
			for (int i = 0; i < emp.length; i++)
				oos.writeObject(emp[i]);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
