package com.github.blutorange.common;

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public final class CollectionUtil {
	private CollectionUtil() {}

	@Nullable
	public static <T> T last(final @NonNull List<T> list) {
		if (list.isEmpty())
			return null;
		return list.get(list.size()-1);
	}

	@NonNull
	public static <T> T lastForce(final @NonNull List<T> list) {
		if (list.isEmpty())
			throw new IllegalArgumentException("Cannot get last element, list is empty");
		return list.get(list.size()-1);
	}

	@NonNull
	public static <T> T lastOr(final @NonNull List<T> list, @NonNull final T defaultValue) {
		if (list.isEmpty())
			return defaultValue;
		return list.get(list.size()-1);
	}
}
