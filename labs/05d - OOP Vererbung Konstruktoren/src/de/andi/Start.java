package de.andi;

public class Start {

	public static void main(String[] args) {
		new C();

	}
}

class A // extends Object
{
//	public A() {
//		System.out.println("Ein neues A wird geboren...");
//	}
}

class B extends A {
	public B(int i, String s) {
		//super();
		System.out.println("Ein neues B wird geboren...");
	}
}
class C extends B {
	public C() {
		super(2,"xdxdf");
		System.out.println("Ein neues C wird geboren...");
	}
}
