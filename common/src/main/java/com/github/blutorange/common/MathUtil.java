package com.github.blutorange.common;

public final class MathUtil {
	private MathUtil() {
	}

	public static int clamp(final int value, final int min, final int max) {
		return value < min ? min : value > max ? max : value;
	}

	public static long clamp(final long value, final long min, final long max) {
		return value < min ? min : value > max ? max : value;
	}

	public static float clamp(final float value, final float min, final float max) {
		return value < min ? min : value > max ? max : value;
	}

	public static double clamp(final double value, final double min, final double max) {
		return value < min ? min : value > max ? max : value;
	}

	public static <T extends Comparable<T>> Comparable<T> clamp(final T value, final T min, final T max) {
		if (value.compareTo(min) < 0)
			return min;
		if (value.compareTo(max) > 0)
			return max;
		return value;
	}
}