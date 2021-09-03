package de.dennis;

import de.dennis.interfaces.Operation;

public class Rechner {
	private double summe=0;
	
	public Rechner execute(Operation op) {
		summe=op.proc(summe);
		return this;
	}
	
	@Override
	public String toString() {
		return String.format("Ergebnis: %f", summe);
	}
}
