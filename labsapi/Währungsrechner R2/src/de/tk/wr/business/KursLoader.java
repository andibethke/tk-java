package de.tk.wr.business;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import de.tk.wr.models.KursModel;

public class KursLoader {
	private String filename="C:\\Temp\\tk-java\\kurse.txt";
	
	public List<KursModel> getKurse() throws Exception{
		return Files.readAllLines(Paths.get(filename))
				.stream()
				.map(zeile->{
					String[] felder=zeile.split(";");
					return new KursModel(
							felder[0],
							felder[1],
							felder[2],
							Double.parseDouble(felder[3]));
				})
				.collect(Collectors.toList());
				
	}
}
