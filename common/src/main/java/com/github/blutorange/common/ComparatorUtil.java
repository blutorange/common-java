package com.github.blutorange.common;

import java.util.Comparator;

import org.eclipse.jdt.annotation.NonNull;

public final class ComparatorUtil {
	private ComparatorUtil() {
	}

	/**
	 * For nulls, use  {@link Comparator#nullsFirst(Comparator)} or {@link Comparator#nullsLast(Comparator)}.
	 * @param field
	 * @return
	 */
	public static <@NonNull R, @NonNull S extends Comparable<S>> Comparator<R> byMapper(
			Function<R, S> field) {
		return new Comparator<R>() {
			@Override
			public int compare(@NonNull R o1, @NonNull R o2) {
				return field.apply(o1).compareTo(field.apply(o2));
			}
		};
	}
	
	public static <R> Comparator<R> andThenBy(Comparator<R> firstBy, Comparator<R> thenBy) {
		return new Comparator<R>() {
			@Override
			public int compare(R o1, R o2) {
				int result = firstBy.compare(o1, o2);
				if (result != 0)
					return result;
				return thenBy.compare(o1, o2);
			}
		};
	}
}
