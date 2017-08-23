package com.github.blutorange.common;

@FunctionalInterface
public interface IntToIntFunction extends ThrowingIntToIntFunction<RuntimeException> {
	@Override
	int apply(int argument);
}