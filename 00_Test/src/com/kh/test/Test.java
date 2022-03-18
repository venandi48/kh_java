package com.kh.test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {
	public static void main(String[] args) {
		new Test().count();
//		new Test().output();
		
	}
	public void output() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("test.txt",true);
			fw.write(97);
			fw.write(65);
			fw.flush();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void count() {
		
		int port =3000;
		
		ServerSocket server;
		try{
			server = new ServerSocket(port);
			System.out.println(
					"[" + InetAddress.getLocalHost().getHostAddress() + ":" + port + "]에서 연결대기중...");
			
			while(true) {
				Socket client = server.accept();
				System.out.println("[" + server.getInetAddress().getHostAddress() + "]에서 연결요청!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
