package com.github.blutorange.common;

public interface ThrowingRunnable<E extends Throwable> {
	public void run() throws E;
}