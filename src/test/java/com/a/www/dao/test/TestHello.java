package com.a.www.dao.test;

import org.junit.Test;

import com.a.www.dao.Hello;

/**
 * @author:12
 * @Time:2016年12月6日上午8:43:31
 * @Description:TODO
 * @FileInfo:com.a.www.dao.test.TestHello.java
 */
public class TestHello extends AbstractHello {

	@Test
	public void testHello() {
		System.out.println(Hello.hello());
	}
}
