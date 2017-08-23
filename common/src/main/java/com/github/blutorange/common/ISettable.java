package com.github.blutorange.common;

@FunctionalInterface
public interface ISettable<T> {
	void set(T value);
}