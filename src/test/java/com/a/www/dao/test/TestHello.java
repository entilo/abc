package com.a.www.dao.test;

import org.junit.Test;

import com.a.www.dao.Hello;

public class TestHello {
	@Test
	public void testHello() {
		Hello h = new Hello();
		System.out.println(h.hello());
	}
}
