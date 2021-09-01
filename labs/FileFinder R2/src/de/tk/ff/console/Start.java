package de.tk.ff.console;

import java.io.File;
import java.util.Scanner;

import de.tk.ff.business.ImageExplorer;
import de.tk.ff.exceptions.DirNotFoundException;

public class Start {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ImageExplorer ie=new ImageExplorer();
	

		System.out.print("Startverzeichnis: ");
		try {
			ie.setStartupPath(sc.next());
		} catch (DirNotFoundException e) {
			System.out.println(e.getMessage());
			main(args);
		}
		
		ie.setListener(name->System.out.print("."));
		
		ie.startSearch();

		System.out.println(ie.getInfo());
		
//		for (File f : ie.getFiles()) {
//			System.out.println(f);
//		}

	}

}
