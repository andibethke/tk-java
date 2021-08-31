package de.tk.plz.business;

import java.util.List;
import java.util.function.Predicate;

import de.tk.plz.models.PlzModel;

public interface PlzMgrBase {

	List<PlzModel> getPlzs() throws Exception;

	List<PlzModel> getPlzs(Predicate<PlzModel> p) throws Exception;

}