package de.tk.bmi;

import de.tk.bmi.business.Mensch;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Slider;
import javafx.scene.text.Text;

public class BmiController {
	@FXML
	TextField txGroesse;
	@FXML
	TextField txGewicht;
	@FXML
	Text txAusgabe;
	@FXML
	Slider sl;
	
	
	private Mensch mensch=new Mensch();
	
	public void initialize() {

        sl.valueProperty().addListener((observable, oldValue, newValue) -> {

            txGewicht.setText(Double.toString(newValue.intValue()));
            handleBerechneButtonAction();

        });

    }
	
	
	@FXML
	protected void handleBerechneButtonAction() {
		try {
			Thread.sleep(5000);
			mensch.setGroesse(Double.parseDouble(txGroesse.getText()));
			mensch.setGewicht(Double.parseDouble(txGewicht.getText()));
			txAusgabe.setText(String.format("Dein Bmi ist %.2f", mensch.getBmi()));
			txAusgabe.setFill(mensch.isOk()?Color.GREEN:Color.MAGENTA);
		} catch (Exception e) {
			new Alert(AlertType.ERROR,e.getMessage());
		}
	}
	
	
}
