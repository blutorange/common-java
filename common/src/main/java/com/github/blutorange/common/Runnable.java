package com.github.blutorange.common;

public interface Runnable extends ThrowingRunnable<RuntimeException>, java.lang.Runnable {
	@Override
	public void run();
}