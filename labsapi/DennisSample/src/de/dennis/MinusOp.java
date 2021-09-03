package de.dennis;

public class MinusOp extends OperationBase {
	public MinusOp() {
		setName("-");
		setOp((s)->s-=getVal());
	}
}
