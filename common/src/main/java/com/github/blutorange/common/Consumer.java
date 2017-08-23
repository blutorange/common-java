package com.github.blutorange.common;

@FunctionalInterface
public interface Consumer<T> extends ThrowingConsumer<T, RuntimeException>, java.util.function.Consumer<T> {
	@Override
	void accept(T t);
}