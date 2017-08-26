package javaLearning;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class myThreadTest {

	public static void main(String[] args) {
		Thread myth1 = new MyThread();

		MyRunnable myrn = new MyRunnable();
		Thread myth2 = new Thread(myrn);

		MyCallable myCll = new MyCallable();
		FutureTask<Integer> ft = new FutureTask<Integer>(myCll);
		Thread myth3 = new Thread(ft);
		
		MyCallable myCll2 = new MyCallable();
		FutureTask<Integer> ft2 = new FutureTask<Integer>(myCll2);
		Thread myth4 = new Thread(ft2);
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 3) {
				myth1.start();
				myth2.start();
				myth3.start();
				myth4.start();
			}
		}
		System.out.println("主线程for循环执行完毕..");
		try {
			int sum = ft.get();
			System.out.println("sum = "+sum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
