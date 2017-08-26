package javaLearning;

public class MyRunnable implements Runnable {
	private int i = 0;

	@Override
	public void run() {
		for (i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

}
