package andi;

public class Start {

	public static void main(String[] args) {
//		int x=222, y=444;
//		System.out.println(plus(x, y));
//		
//		
//		System.out.println(plus(222.22, 444.44));
//		System.out.println(plus(222.22));
		
		int[] zahlens= {1,2,3,4,5,6,7,8,9};
		for (int i : zahlens) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(plus(zahlens));
		
		for (int i : zahlens) {
			System.out.print(i+" ");
		}
		
	}
	
	static int plus(int a, int b) {
		int erg=a+b;
		a=erg;
		return erg;
	}
	static double plus(double a, double b) {
		return a+b;
	}
	static double plus(double a) {
		return a+a;
	}
	static double plus(int[] a) {
		int erg=0;
		for (int i : a) {
			erg+=i;
		}
		a[0]=999999;
		return erg;
	}

}
