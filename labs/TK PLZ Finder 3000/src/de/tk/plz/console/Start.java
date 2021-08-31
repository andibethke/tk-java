package de.tk.plz.console;

import java.util.Scanner;

import de.tk.plz.business.PlzMgr;
import de.tk.plz.business.PlzMgrBase;
import de.tk.plz.business.PlzMgrMySql;
import de.tk.plz.models.PlzModel;

public class Start {

	public static void main(String[] args) throws Exception{
		
		PlzMgrBase mgr=new PlzMgrMySql();
		Scanner sc=new Scanner(System.in);
		System.out.print("Ort: ");
		String ort=sc.next();
		
		

		for (PlzModel p : mgr.getPlzs(x->ort==null || ort.length()==0 || x.getOrt().toUpperCase().contains(ort.toUpperCase()))) {
			System.out.printf("%6s %-20s %-40s %-20s\n",
					p.getPlz(), p.getOrt(),p.getLandkreis(), p.getBundesland());
		}

	}

}
