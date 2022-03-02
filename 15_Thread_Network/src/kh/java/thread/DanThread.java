package kh.java.thread;

public class DanThread implements Runnable {

	private int dan;
	private double sec;
	private long millis = 500; // 기본값 지정 가능

	public DanThread() {
		super();
	}

	public DanThread(int dan) {
		super();
		this.dan = dan;
	}

	public DanThread(int dan, double sec) {
		super();
		this.dan = dan;
		this.sec = sec;
		this.millis = (long) (sec * 1000);
	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
