package javaLearning;

public class myThreadTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 3) {
				Thread myth1 = new MyThread();
				Thread myth2 = new MyThread();

				myth1.start();
				myth2.start();
			}
		}
	}
}
