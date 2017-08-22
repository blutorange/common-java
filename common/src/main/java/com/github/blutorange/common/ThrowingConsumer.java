package com.github.blutorange.common;

public interface ThrowingConsumer<T, E extends Throwable> {
	void accept(T t) throws E;
}