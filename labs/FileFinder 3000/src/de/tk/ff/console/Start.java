package de.tk.ff.console;

import java.io.File;
import java.util.Scanner;

import de.tk.ff.business.FFImpl;
import de.tk.ff.business.FileFinderImpl;
import de.tk.ff.interfaces.FileFinder;

public class Start {

	public static void main(String[] args) {
		FileFinder ff=new FFImpl();
		ff.setTypes(new String[] {".jpg",".png",".gif"});
		Scanner sc=new Scanner(System.in);
		System.out.print("Path: ");
		
		ff.setStartupPath(sc.next());
		
		ff.StartSearch();
		
		System.out.printf("%d Dateien, %d Bytes gefunden...",ff.getTotalCount(), ff.getTotalLength());
		
		for (File f : ff.getFiles()) {
			System.out.println(f);
		}
		

	}

}
