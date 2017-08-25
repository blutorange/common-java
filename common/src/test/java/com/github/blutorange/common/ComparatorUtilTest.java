/**
 * 
 */
package com.github.blutorange.common;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static com.github.blutorange.common.ComparatorUtil.byMapper;
import static com.github.blutorange.common.ComparatorUtil.andThenBy;

/**
 * @author s3002591
 *
 */
public class ComparatorUtilTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.github.blutorange.common.ComparatorUtil#byMapper(com.github.blutorange.common.Function<R,S>[])}.
	 */
	@Test
	public void testByMapper() {
		String[] array = new String[] { "aaa", "c", "bb" };
		Arrays.sort(array, byMapper(String::length));
		assertArrayEquals(new String[] { "c", "bb", "aaa" }, array);
	}

	/**
	 * Test method for
	 * {@link com.github.blutorange.common.ComparatorUtil#andThenBy(java.util.Comparator, java.util.Comparator)}.
	 */
	@Test
	public void testAndThenBy() {
		List<Pair<String, Integer>> list = new ArrayList<>();
		list.add(new Pair<>("foo", 2));
		list.add(new Pair<>("foo", 1));
		list.add(new Pair<>("bar", 0));
		list.sort(andThenBy(byMapper(Pair::getLeft), byMapper(Pair::getRight)));
		assertArrayEquals(new Pair[] { new Pair<>("bar", 0), new Pair<>("foo", 1), new Pair<>("foo", 2) },
				list.toArray(new Pair[0]));
	}

	private static class Pair<L, R> {
		L left;
		R right;

		public Pair(L left, R right) {
			this.left = left;
			this.right = right;
		}

		public L getLeft() {
			return left;
		}

		public R getRight() {
			return right;
		}

		public String toString() {
			return String.format("Pair(%s,%s)", left, right);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((left == null) ? 0 : left.hashCode());
			result = prime * result + ((right == null) ? 0 : right.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (left == null) {
				if (other.left != null)
					return false;
			} else if (!left.equals(other.left))
				return false;
			if (right == null) {
				if (other.right != null)
					return false;
			} else if (!right.equals(other.right))
				return false;
			return true;
		}
	}
}
