package de.dennis;

import java.util.Scanner;

import de.dennis.interfaces.Operation;

public class Start {

	public static void main(String[] args) {
		OperationBuild.operations.add(new PlusOperation());
		OperationBuild.operations.add(new MinusOp());
		OperationBuild.operations.add(new OperationBase() {
			@Override
			public String getName() {
				return "*2";
			}
			@Override
			public Operation getOp() {
				return x->x*getVal();
			}
		});
		
		
		Scanner sc=new Scanner(System.in);
		Rechner r=new Rechner();
		//System.out.println(r.execute((s)->s+=50).execute(x->x*=2));
		while (true) {
			System.out.print("Operator: ");
			String operator=sc.next();
			System.out.print("Wert: ");
			double wert=sc.nextDouble();
			Operation op=OperationBuild.get(operator, wert);
			r.execute(op);
			System.out.println(r);
		}
	}

}
