package de.tk;

import java.time.LocalTime;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleController {
	
	@FXML
	private Label theLabel;
	
	public void buttonClick() {
		System.out.println("Hallo");
		theLabel.setText(LocalTime.now().toString());
		
	} 
}
