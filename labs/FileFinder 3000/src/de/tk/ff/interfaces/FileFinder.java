package de.tk.ff.interfaces;

import java.io.File;
import java.util.List;

public interface FileFinder {
	public void setStartupPath(String val);
	public String getStartupPath();
	
	public List<File> getFiles();
	
	public void setTypes(String[] val);
	
	public int getTotalCount();
	public long getTotalLength();
	
	public void StartSearch();
	
}
