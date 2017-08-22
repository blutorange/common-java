package com.github.blutorange.common;

public interface Predicate<T> extends ThrowingPredicate<T, RuntimeException>, java.util.function.Predicate<T> {
    @Override
	boolean test(T value);
}