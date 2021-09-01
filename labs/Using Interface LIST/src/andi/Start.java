package andi;

import java.util.Iterator;

public class Start {

	public static void main(String[] args) {
		
		for (String n : new Kurs()) {
			System.out.println(n);
		}

	}

}

class Kurs implements Iterable<String>, Iterator<String>{
	private String[] students= {"Dennis","Elsa","Irina"};
	private int index=-1;

	@Override
	public Iterator<String> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		return index<students.length-1;
	}

	@Override
	public String next() {
		return students[++index];
	}
}
