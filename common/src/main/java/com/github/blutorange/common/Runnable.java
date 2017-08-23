package com.github.blutorange.common;

@FunctionalInterface
public interface Runnable extends ThrowingRunnable<RuntimeException>, java.lang.Runnable {
	@Override
	public void run();
}