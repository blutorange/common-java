package com.github.blutorange.common;

public class Suppliers {
	private Suppliers() {
	}

	public static <R, E extends Exception> ThrowingSupplier<R, E> memoize(final ThrowingSupplier<R, E> delegate) {
		return new MemoizingSupplier<>(delegate);
	}

	private static class MemoizingSupplier<R, E extends Exception> implements ThrowingSupplier<R, E> {
		private ThrowingSupplier<R, E> delegate;
		private R cached;

		public MemoizingSupplier(final ThrowingSupplier<R, E> delegate) {
			this.delegate = delegate;
		}

		@Override
		public R get() throws E {
			if (cached == null)
				synchronized (this) {
					if (cached == null) {
						final R result = delegate.get();
						cached = result;
						delegate = null;
						return result;
					}
				}
			return cached;
		}
	}
}
