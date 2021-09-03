package de.dennis;

import java.util.ArrayList;
import java.util.List;

import de.dennis.interfaces.Operation;

public class OperationBuild {
	public static List<OperationBase> operations=new ArrayList<OperationBase>();
	
	public static  Operation get(String op,double val) {
		OperationBase base=
				operations.stream()
					.filter(x->x.getName().equalsIgnoreCase(op))
					.findFirst().get();
		base.setVal(val);
		return base.getOp();
	}
	
}
