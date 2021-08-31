package de.andi;

public class Start {

	public static void main(String[] args) {
		A.setStatisch(999);
		A a=new A(111, 222);
		new A();
		new A();
		new A();
		new A();
		
		Singleton s=Singleton.getInstance();
		
	}

}
