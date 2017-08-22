package com.github.blutorange.common;

public interface Supplier<T> extends ThrowingSupplier<T, RuntimeException>, java.util.function.Supplier<T> {
	@Override
	public T get();
}