package com.github.blutorange.common;

@FunctionalInterface
public interface ThrowingIntToIntFunction<E extends Throwable> {
	int apply(int argument) throws E;
}