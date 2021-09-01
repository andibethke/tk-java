package andi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Start {

	public static void main(String[] args) throws Exception{
		File dir=new File("c:/temp/tk-java");
		
		FileFilter ff=(File x)->{
			return x.isDirectory() && x.getName().startsWith("l");
		};
		
		for (File f : dir.listFiles(ff)) {
			System.out.println(f);
		}
		
//		try {
//			FileInputStream fin=new FileInputStream("C:/Temp/tk-java/Hello.java");
//			int b=0;
//			while ((b=fin.read())>-1) {
//				System.out.print((char)b);
//			}
//		} 
//		catch (FileNotFoundException e) {
//			System.out.println("Datei nicht gefunden...");
//		}
//		catch (IOException e) {
//			System.out.println("Lesefehler...");
//		}
		
		FileReader frdr=new FileReader("C:/Temp/tk-java/Hello.java");
		BufferedReader brdr=new BufferedReader(frdr);
		String zeile;
		while (true) {
			zeile=brdr.readLine();
			if(zeile==null) break;
			System.out.println(zeile);
		}
		
		var w=new BufferedWriter(new FileWriter("C:/Temp/tk-java/zufall.txt"));
		var r=new Random();
		for (int i = 0; i < 1000; i++) {
			w.write(r.nextInt()+"\n");
		}
		w.flush();
		w.close();
		
		List<String> x= java.nio.file.Files.readAllLines(Paths.get("C:/Temp/tk-java/Hello.java"));
		var y= java.nio.file.Files.readAllLines(Paths.get("C:/Temp/tk-java/Hello.java"));
		var s=3.2;
	}
	
	

}
