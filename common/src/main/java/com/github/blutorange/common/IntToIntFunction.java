package com.github.blutorange.common;

import java.util.function.IntToLongFunction;

public interface IntToIntFunction extends ThrowingIntToIntFunction<RuntimeException>, IntToLongFunction {
	@Override
	int apply(int argument);
}