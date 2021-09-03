package de.dennis;

public class PlusOperation extends OperationBase {
	public PlusOperation() {
		setName("+");
		setOp((s)->s+=getVal());
	}
}
