package de.tk.ff.business;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import de.tk.ff.interfaces.FileFinder;

public class FFImpl implements FileFinder {
	private String startupPath;
	private String[] types;
	private List<File> files = new ArrayList<File>();

	@Override
	public void setStartupPath(String val) {
		startupPath = val;

	}

	@Override
	public String getStartupPath() {
		return startupPath;
	}

	@Override
	public List<File> getFiles() {
		return files;
	}

	@Override
	public void setTypes(String[] val) {
		types = val;
	}

	@Override
	public int getTotalCount() {
		return files.size();
	}

	@Override
	public long getTotalLength() {
		long sum = 0;
		for (File f : files) {
			sum += f.length();
		}
		return sum;
	}

	@Override
	public void StartSearch() {
		files.clear();
		Scan(new File(startupPath));
	}

	protected void Scan(File dir) {
		for (String t : types) {
			for (File f : dir.listFiles((d, n) -> n.endsWith(t))) {
				files.add(f);
			}
		}
		for (File d : dir.listFiles(x -> x.isDirectory())) {
			try {
				Scan(d); // Rekursion
			} 
			catch (Exception e) {
			}
		}
	}

}
