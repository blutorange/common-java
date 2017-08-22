package com.github.blutorange.common;

public interface Function<T, R> extends ThrowingFunction<T, R, RuntimeException>, java.util.function.Function<T, R> {
	@Override
	public R apply(T t);
}