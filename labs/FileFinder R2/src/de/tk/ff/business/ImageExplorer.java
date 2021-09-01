package de.tk.ff.business;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import de.tk.ff.exceptions.DirNotFoundException;
import de.tk.ff.listeners.IchScanneNeuesVerzeichnisListener;

public class ImageExplorer {
	private String startupPath="c:/windows";
	private List<File> files=new ArrayList<File>();
	private IchScanneNeuesVerzeichnisListener listener;
	
	public void setListener(IchScanneNeuesVerzeichnisListener listener) {
		this.listener = listener;
	}
	public String getStartupPath() {
		return startupPath;
	}
	public void setStartupPath(String startupPath) throws DirNotFoundException {
		if(!new File(startupPath).exists())
			throw new DirNotFoundException();
		
		this.startupPath = startupPath;
	}
	public List<File> getFiles() {
		return files;
	}
	
	public String getInfo() {
		return String.format("Anzahl Bilder: %d - Größe in Bytes: %d", 
				files.size(), 
				files.stream().collect(Collectors.summingLong(x->x.length())));
	}
	
	public void startSearch(){
		files.clear();
		scan(new File(startupPath));
	}
	
	protected void scan(File dir) {
		//System.out.println(dir.getAbsolutePath());
		if (listener!=null) {
			listener.action(dir.getAbsolutePath());  //Triggern
		}
		
		for (String typ : new String[] {".jpg",".png",".gif"}) {
			for (File file : dir.listFiles((File d, String n)->n.endsWith(typ))) {
				files.add(file);
			}
		}
		//Verzeichnisse
		for (File subDir : dir.listFiles(x->x.isDirectory())) {
			try {
				scan(subDir);  //REKURSION
			} catch (Exception e) {
			}
		}
	}
}
