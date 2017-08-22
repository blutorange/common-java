package com.github.blutorange.common;

public interface ThrowingPredicate<T, E extends Throwable> {
    boolean test(T value) throws E;
}
