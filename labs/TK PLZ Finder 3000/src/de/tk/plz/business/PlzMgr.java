package de.tk.plz.business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import de.tk.plz.models.PlzModel;

public class PlzMgr implements PlzMgrBase {
	private String filename;
	public PlzMgr() {
		filename="c:/temp/tk-java/plz.csv";
	}
	public PlzMgr(String fn) {
		filename=fn;
	}

	
	
	@Override
	public List<PlzModel> getPlzs() throws Exception{
		return Files.readAllLines(Paths.get(filename))  //List<String>
				.stream()                               //Stream<String>
				.skip(1)
				.map(z->{
					String[] f=z.split(",");
					return new PlzModel(f[3], f[2], f[4], f[5]);
				})                                     //Stram<PlzModel>
				.collect(Collectors.toList());         //List<PlzModel>
	}
	
	@Override
	public List<PlzModel> getPlzs(Predicate<PlzModel> p) throws Exception {
		return getPlzs()
				.stream()
				.filter(p)
				.collect(Collectors.toList());
	}

		
	public List<PlzModel> getPlzsALT() throws Exception{
		BufferedReader rdr=new BufferedReader(new FileReader(filename));
		String zeile;
		List<PlzModel> li=new ArrayList<PlzModel>();
		while ((zeile=rdr.readLine())!=null) {
			String[] felders=zeile.split(",");
			li.add(new PlzModel(felders[3], felders[2], felders[4], felders[5]));
		}
		return li;
	}
	
}
