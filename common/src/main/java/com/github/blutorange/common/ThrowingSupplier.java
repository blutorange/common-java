package com.github.blutorange.common;

public interface ThrowingSupplier<T, E extends Throwable> {
	public T get() throws E;
}