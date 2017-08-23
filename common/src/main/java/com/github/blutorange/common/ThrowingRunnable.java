package com.github.blutorange.common;

@FunctionalInterface
public interface ThrowingRunnable<E extends Throwable> {
	public void run() throws E;
}