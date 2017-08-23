package com.github.blutorange.common;

@FunctionalInterface
public interface ThrowingSupplier<T, E extends Throwable> {
	public T get() throws E;
}