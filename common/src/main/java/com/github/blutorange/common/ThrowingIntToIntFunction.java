package com.github.blutorange.common;

public interface ThrowingIntToIntFunction<E extends Throwable> {
	int apply(int argument) throws E;
}
