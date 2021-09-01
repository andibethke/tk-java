package de.tk.ff.business;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import de.tk.ff.interfaces.FileFinder;

public class FileFinderImpl implements FileFinder {
	private String startupPath="c:/windows";
	private String[] types=new String[]{".jpg",".png",".gif"};
	private List<File> files=new ArrayList<File>();
	@Override
	public void setStartupPath(String val) { startupPath=val; }

	@Override
	public String getStartupPath() {return startupPath;	}

	@Override
	public List<File> getFiles() { return files;	}

	@Override
	public void setTypes(String[] val) {types=val;}

	@Override
	public int getTotalCount() {return files.size();}

	@Override
	public long getTotalLength() { return files.stream().collect(Collectors.summingLong(x->x.length()));}

	@Override
	public void StartSearch() {
		files.clear();
		search(new File(startupPath));
	}
	protected void search(File dir) {
		for (String t : types) {
			for (File f : dir.listFiles((d,n)->n.endsWith(t))) {
				files.add(f);
			}
		}
		for (File d : dir.listFiles(x->x.isDirectory())) {
			try {
				search(d);
			} catch (Exception e) {
			}
		}
	}

}
