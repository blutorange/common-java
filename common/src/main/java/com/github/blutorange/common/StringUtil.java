package com.github.blutorange.common;

import java.util.Locale;

import org.eclipse.jdt.annotation.NonNull;

public final class StringUtil {
	private StringUtil() {}
	@NonNull
	public static String toRootUpperCase(@NonNull String string) {
		return string.toUpperCase(Locale.ROOT);
	}
	
	@NonNull
	public static String toRootLowerCase(@NonNull String string) {
		return string.toLowerCase(Locale.ROOT);
	}
}
