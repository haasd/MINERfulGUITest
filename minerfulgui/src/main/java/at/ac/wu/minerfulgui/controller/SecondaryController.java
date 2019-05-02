package at.ac.wu.minerfulgui.controller;

import java.io.IOException;

import at.ac.wu.minerfulgui.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}