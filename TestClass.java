package com.gmail.kutepov89.sergey;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value=ElementType.FIELD)
@Retention(value=RetentionPolicy.RUNTIME)
@interface Save {}

public class TestClass implements Serializable {
	private static final long serialVersionUID = 1L;
	private int a;
	@Save
	private int b;
	@Save
	private String c;
	private String d;
	@Save
	private boolean t;

	public TestClass() {
		super();
	}

	public TestClass(int a, int b, String c, String d, boolean t) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.t = t;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public boolean isT() {
		return t;
	}

	public void setT(boolean t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "TestClass [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", t=" + t + "]";
	}

}
