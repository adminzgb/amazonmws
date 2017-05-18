package com.gbin.executor;

import java.util.concurrent.atomic.AtomicInteger;

public class WorkThread extends Thread {

	private Runnable runnable;

	private AtomicInteger counter;
	
	public WorkThread(Runnable r, AtomicInteger counter){
		this.runnable = r;
		this.counter = counter;
	}

	public void run() {
		try {
			runnable.run();
		} finally {
			int c = counter.getAndDecrement();
			System.out.println("terminate no " + c + " Threads");
		}
	}

}
