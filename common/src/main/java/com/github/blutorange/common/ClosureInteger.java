package com.github.blutorange.common;

public class ClosureInteger implements ICopyable<ClosureInteger>, Comparable<ClosureInteger> {
	private int value;

	public ClosureInteger() {
		this(0);
	}

	public ClosureInteger(final int value) {
		this.value = value;
	}

	public ClosureInteger add(final ClosureInteger value) {
		return add(value.get());
	}

	public ClosureInteger add(final int operator) {
		this.value += operator;
		return this;
	}

	public ClosureInteger and(final ClosureInteger value) {
		return and(value.get());
	}

	public ClosureInteger and(final int operator) {
		this.value &= operator;
		return this;
	}

	@Override
	public int compareTo(final ClosureInteger value) {
		return compareTo(value.get());
	}

	public int compareTo(final int operator) {
		return Integer.compare(value, operator);
	}

	@Override
	public ClosureInteger copy() {
		return new ClosureInteger(value);
	}

	public ClosureInteger decrement() {
		return add(-1);
	}

	public ClosureInteger divide(final ClosureInteger value) {
		return divide(value.get());
	}

	public ClosureInteger divide(final int operator) {
		this.value /= operator;
		return this;
	}

	@Override
	public boolean equals(final Object obj) {
		if (!(obj instanceof ClosureInteger))
			return false;
		final ClosureInteger other = (ClosureInteger)obj;
		return other.value == value;
	}

	public int get() {
		return value;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(value);
	}

	public ClosureInteger increment() {
		return add(1);
	}

	public ClosureInteger modulo(final int operator) {
		this.value %= operator;
		return this;
	}

	public ClosureInteger modulo(final ClosureInteger value) {
		return modulo(value.get());
	}

	public ClosureInteger multiply(final ClosureInteger value) {
		return multiply(value.get());
	}

	public ClosureInteger multiply(final int operator) {
		this.value *= operator;
		return this;
	}

	public ClosureInteger not() {
		this.value = ~value;
		return this;
	}

	public ClosureInteger one() {
		return set(1);
	}

	public ClosureInteger or(final ClosureInteger value) {
		return or(value.get());
	}

	public ClosureInteger or(final int operator) {
		this.value |= operator;
		return this;
	}

	public ClosureInteger pow(final ClosureInteger value) {
		return pow(value.get());
	}

	public ClosureInteger pow(final int operator) {
		if (operator == 0)
			value = 1;
		else if (operator < 0)
			value = 0;
		else {
			final int before = value;
			for (int i = operator-1; i-->0;)
				value *= before;
		}
		return this;
	}

	public ClosureInteger set(final ClosureInteger value) {
		return set(value.get());
	}

	public ClosureInteger set(final int value) {
		this.value = value;
		return this;
	}

	public ClosureInteger subtract(final ClosureInteger value) {
		return and(value.get());
	}

	public ClosureInteger subtract(final int operator) {
		this.value -= operator;
		return this;
	}

	@Override
	public String toString() {
		return Integer.toString(value);
	}

	public ClosureInteger xor(final ClosureInteger value) {
		return xor(value.get());
	}

	public ClosureInteger xor(final int operator) {
		this.value ^= operator;
		return this;
	}

	public ClosureInteger zero() {
		return set(0);
	}
}