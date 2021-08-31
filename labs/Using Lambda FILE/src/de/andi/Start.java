package de.andi;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Start {

	public static void main(String[] args) {
		File[] files=new File("c:/windows/system32").listFiles((d,n)->n.endsWith(".exe"));
		
		files=Stream.of(files)
				.sorted((f1,f2)->f1.length()<f2.length()?1:-1)
				.limit(10)
				.collect(Collectors.toList())
				.toArray(files);
		
		
		
		for (File f : files) {
			System.out.printf("%-50s  (%10d Bytes)\n",f.getName(),f.length());
		}
		
		
	}

}
