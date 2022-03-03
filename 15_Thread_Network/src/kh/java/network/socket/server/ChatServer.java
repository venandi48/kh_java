package kh.java.network.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * TCP 소켓프로그래밍
 * 
 * 1. ServerSocket 시작 (특정ip, 특정port)
 * 2. Client에서 연결요청 발생
 * 3. server에서 새로운 socket 생성하여 client와 연결
 *
 */
public class ChatServer {

	final int SERVER_PORT = 7777; // 임의로 지정한 포트번호

	public static void main(String[] args) {
		new ChatServer().start();
	}

	private void start() {
		try {
			// 현재 컴퓨터 SERVER_PORT에 ServerSocket생성
			ServerSocket serverSocket = new ServerSocket(SERVER_PORT);

			while (true) {
				System.out.println(
						"[" + InetAddress.getLocalHost().getHostAddress() + ":" + SERVER_PORT + "]에서 연결대기중...");

				// 클라이언트 요청이 들어오면 별도의 소켓을 생성한다.
				Socket socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress().getHostAddress() + "]에서 연결요청!");

				// 입출력스트림 준비
				try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintWriter pw = new PrintWriter(socket.getOutputStream())) {
					// 무조건 전송할 환영 메세지
					pw.println("환영합니다🎉");
					pw.flush(); // 버퍼가 완전히 차지 않았어도 강제출력

					// 클라이언트와 채팅시작
					Scanner sc = new Scanner(System.in);
					String inMsg = null;
					while ((inMsg = br.readLine()) != null) {

						// 클라이언트 exit입력 시 채팅종료!
						if ("exit".equals(inMsg)) {
							System.out.println("클라이언트가 채팅방을 나갔습니다.");
							break;
						}

						System.out.println("클라이언트 : " + inMsg);
						System.out.print("서버 : ");
						String outMsg = sc.nextLine();

						// 클라이언트로 출력
						pw.println(outMsg);
						pw.flush();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
