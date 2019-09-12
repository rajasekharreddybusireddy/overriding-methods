package com.javabyrajasekhar.overriding;

public class App {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();

		SubChild s = new SubChild();
		s.m1();

		Parent p1 = new SubChild();
		p1.m1();

		Child p2 = new SubChild();
		p1.m1();
	}
}
