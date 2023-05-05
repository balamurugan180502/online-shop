package com.edu.JunitProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit1 {
	@Test
	public void show() {
		String str="Welcome to all";
		assertEquals("Welcome to all",str);
		
	}

}
