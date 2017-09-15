package com.github.blutorange.common;

import org.eclipse.jdt.annotation.NonNull;

public class ClosureVariable<@NonNull T> {
	private final T object;

	public ClosureVariable(final T object) {
		this.object = object;
	}

	public T get() {
		return object;
	}

	@Override
	public boolean equals(final Object obj) {
		return object.equals(obj);
	}

	@Override
	public int hashCode() {
		return object.hashCode();
	}
}