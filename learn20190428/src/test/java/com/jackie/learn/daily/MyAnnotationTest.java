package com.jackie.learn.daily;

import java.text.Annotation;

import com.jackie.learn.daily.MyAnnotation;
import com.jackie.learn.daily.MyAnnotation.ProcessType;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyAnnotationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void MyAnnotationTest() {
		MyAnnotation.class.isAnnotation();
	}

}
