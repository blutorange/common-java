package com.github.blutorange.common;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathUtilTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// nothing yet
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// nothing yet
	}

	@Before
	public void setUp() throws Exception {
		// nothing yet
	}

	@After
	public void tearDown() throws Exception {
		// nothing yet
	}

	@Test
	public final void testClampIntIntInt() {
		assertEquals(0, MathUtil.clamp(0, -1, 1));
		assertEquals(1, MathUtil.clamp(2, -1, 1));
		assertEquals(-1, MathUtil.clamp(-2, -1, 1));
		assertEquals(Integer.MIN_VALUE, MathUtil.clamp(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	@Test
	public final void testClampLongLongLong() {
		assertEquals(0, MathUtil.clamp(0L, -1L, 1L));
		assertEquals(1, MathUtil.clamp(2L, -1L, 1L));
		assertEquals(-1, MathUtil.clamp(-2L, -1L, 1L));
		assertEquals(Long.MIN_VALUE, MathUtil.clamp(Long.MIN_VALUE, Long.MIN_VALUE, Long.MAX_VALUE));
	}

	@Test
	public final void testClampFloatFloatFloat() {
		assertEquals(0.5f, MathUtil.clamp(0.5f, 0.2f, 0.8f), 0f);
		assertEquals(0.2f, MathUtil.clamp(-0.1f, 0.2f, 0.8f), 0f);
		assertEquals(0.8f, MathUtil.clamp(1.1f, 0.2f, 0.8f), 0f);
		assertEquals(0.0f, MathUtil.clamp(0.0f, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY), 0f);
		assertEquals(1f, MathUtil.clamp(Float.POSITIVE_INFINITY, 0f, 1f), 0f);
		assertEquals(0f, MathUtil.clamp(Float.NEGATIVE_INFINITY, 0f, 1f), 0f);
		assertEquals(Float.POSITIVE_INFINITY, MathUtil.clamp(Float.POSITIVE_INFINITY, 0f, Float.POSITIVE_INFINITY), 0f);
		assertEquals(Float.NaN, MathUtil.clamp(Float.NaN, 0f, 1f), 0f);
		assertEquals(Float.NaN, MathUtil.clamp(Float.NaN, Float.NaN, Float.NaN), 0f);
	}

	@Test
	public final void testClampDoubleDoubleDouble() {
		assertEquals(0.5d, MathUtil.clamp(0.5d, 0.2d, 0.8d), 0d);
		assertEquals(0.2d, MathUtil.clamp(-0.1d, 0.2d, 0.8d), 0d);
		assertEquals(0.8d, MathUtil.clamp(1.1d, 0.2d, 0.8d), 0d);
		assertEquals(0.0d, MathUtil.clamp(0.0d, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), 0d);
		assertEquals(1d, MathUtil.clamp(Double.POSITIVE_INFINITY, 0d, 1d), 0d);
		assertEquals(0d, MathUtil.clamp(Double.NEGATIVE_INFINITY, 0d, 1d), 0d);
		assertEquals(Double.POSITIVE_INFINITY, MathUtil.clamp(Double.POSITIVE_INFINITY, 0d, Double.POSITIVE_INFINITY), 0d);
		assertEquals(Double.NaN, MathUtil.clamp(Double.NaN, 0d, 1d), 0d);
		assertEquals(Double.NaN, MathUtil.clamp(Double.NaN, Double.NaN, Double.NaN), 0d);
	}

	@SuppressWarnings("nls")
	@Test
	public final void testClampTTT() {
		assertEquals(Integer.valueOf(5), MathUtil.clamp(Integer.valueOf(2), Integer.valueOf(5), Integer.valueOf(10)));
		assertEquals(Long.valueOf(10L), MathUtil.clamp(Long.valueOf(12), Long.valueOf(5), Long.valueOf(10)));
		assertEquals(Float.valueOf(7f), MathUtil.clamp(Float.valueOf(7f), Float.valueOf(5f), Float.valueOf(10f)));
		assertEquals(Double.valueOf(6d), MathUtil.clamp(Double.valueOf(6d), Double.valueOf(5d), Double.valueOf(10d)));
		assertEquals("cc", MathUtil.clamp("zz", "aa", "cc"));
	}
}
