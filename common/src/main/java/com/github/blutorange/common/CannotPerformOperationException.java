package com.github.blutorange.common;

@SuppressWarnings("serial")
public class CannotPerformOperationException extends Exception {
	public CannotPerformOperationException(final String message) {
		super(message);
	}

	public CannotPerformOperationException(final String message, final Throwable source) {
		super(message, source);
	}
}