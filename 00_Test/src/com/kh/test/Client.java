package com.kh.test;

import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
	
		int port = 3000;
		String serverIP;
		try {
			serverIP = InetAddress.getLocalHost().getHostName();
			
			Socket socket = new Socket(serverIP,port);
			System.out.println("[" + serverIP + ":" + port + "] 연결되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
	}
	
}
