package com.github.blutorange.common;

@FunctionalInterface
public interface ThrowingUnaryOperator<T, E extends Throwable> extends ThrowingFunction<T, T, E> {
	//inherit
}
