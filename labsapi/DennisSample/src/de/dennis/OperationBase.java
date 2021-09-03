package de.dennis;

import de.dennis.interfaces.Operation;

public abstract class OperationBase {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Operation getOp() {
		return op;
	}
	public void setOp(Operation op) {
		this.op = op;
	}
	public double getVal() {
		return val;
	}
	public void setVal(double val) {
		this.val = val;
	}
	private String name;
	private Operation op;
	private double val;
	
}
