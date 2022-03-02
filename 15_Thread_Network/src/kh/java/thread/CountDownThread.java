package kh.java.thread;

public class CountDownThread implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
		System.out.println("[" + Thread.currentThread().getName() + "종료]");
	}
}
