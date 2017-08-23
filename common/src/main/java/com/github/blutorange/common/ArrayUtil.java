package com.github.blutorange.common;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public final class ArrayUtil {
	@Nullable
	public static <T> T last(final @Nullable T @NonNull [] array) {
		if (array.length == 0)
			return null;
		return array[array.length - 1];
	}

	@NonNull
	public static boolean lastForce(final boolean @NonNull [] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("Cannot get last element, array is empty");
		return array[array.length - 1];
	}

	@NonNull
	public static byte lastForce(final byte @NonNull [] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("Cannot get last element, array is empty");
		return array[array.length - 1];
	}

	@NonNull
	public static char lastForce(final char @NonNull [] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("Cannot get last element, array is empty");
		return array[array.length - 1];
	}

	@NonNull
	public static double lastForce(final double @NonNull [] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("Cannot get last element, array is empty");
		return array[array.length - 1];
	}

	@NonNull
	public static float lastForce(final float @NonNull [] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("Cannot get last element, array is empty");
		return array[array.length - 1];
	}

	@NonNull
	public static int lastForce(final int @NonNull [] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("Cannot get last element, array is empty");
		return array[array.length - 1];
	}

	@NonNull
	public static long lastForce(final long @NonNull [] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("Cannot get last element, array is empty");
		return array[array.length - 1];
	}

	@NonNull
	public static short lastForce(final short @NonNull [] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("Cannot get last element, array is empty");
		return array[array.length - 1];
	}

	@NonNull
	public static <T> T lastForce(final @NonNull T @NonNull [] array) {
		if (array.length == 0)
			throw new IllegalArgumentException("Cannot get last element, array is empty");
		return array[array.length - 1];
	}

	@Nullable
	public static boolean lastOr(final boolean @NonNull [] array, final boolean defaultValue) {
		if (array.length == 0)
			return defaultValue;
		return array[array.length - 1];
	}

	@Nullable
	public static byte lastOr(final byte @NonNull [] array, final byte defaultValue) {
		if (array.length == 0)
			return defaultValue;
		return array[array.length - 1];
	}

	@Nullable
	public static char lastOr(final char @NonNull [] array, final char defaultValue) {
		if (array.length == 0)
			return defaultValue;
		return array[array.length - 1];
	}

	@Nullable
	public static double lastOr(final double @NonNull [] array, final double defaultValue) {
		if (array.length == 0)
			return defaultValue;
		return array[array.length - 1];
	}

	@Nullable
	public static float lastOr(final float @NonNull [] array, final float defaultValue) {
		if (array.length == 0)
			return defaultValue;
		return array[array.length - 1];
	}

	@Nullable
	public static int lastOr(final int @NonNull [] array, final int defaultValue) {
		if (array.length == 0)
			return defaultValue;
		return array[array.length - 1];
	}

	@Nullable
	public static long lastOr(final long @NonNull [] array, final long defaultValue) {
		if (array.length == 0)
			return defaultValue;
		return array[array.length - 1];
	}

	@Nullable
	public static short lastOr(final short @NonNull [] array, final short defaultValue) {
		if (array.length == 0)
			return defaultValue;
		return array[array.length - 1];
	}

	@NonNull
	public static <T> T lastOr(final @NonNull T @NonNull [] array, @NonNull final T defaultValue) {
		if (array.length == 0)
			return defaultValue;
		return array[array.length - 1];
	}

	private ArrayUtil() {
	}
}
