package andi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Start {

	public static void main(String[] args) throws Exception {
		Stream<Integer> s1=Stream.of(1,2,3,4,5,6,7,8,1,1,1,1);
		
		//Stream Operations
		s1=s1.distinct()
				.filter(i->i>=5);
		//Stream verabreiten
		
		//s1.forEach(i->System.out.println(i));
		List<Integer> li=s1.collect(Collectors.toList());

		List<String> words=
				Files.readAllLines(Paths.get("c:/temp\\tk-java\\deutsch.txt"),
						Charset.forName("iso-8859-1"));
		
		words.stream()
			//.filter(w->w.startsWith("A"))
			//.collect(Collectors.toList()).stream()
			.sorted((a,b)->a.length()>b.length()?-1:0)
			.limit(1)
			.forEach(w->System.out.println(w));
		

	}

}
