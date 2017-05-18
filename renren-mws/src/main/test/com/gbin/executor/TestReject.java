package com.gbin.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class TestReject {

	ExecutorService eService = Executors.newFixedThreadPool(24, new WorkThreadFactory());

	// ExecutorService es = Executors.newCachedThreadPool(new
	// WorkThreadFactory());
	@Test
	public void testReject() {

	}

}
