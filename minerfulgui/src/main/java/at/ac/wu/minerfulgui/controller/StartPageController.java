package at.ac.wu.minerfulgui.controller;

import java.io.IOException;

import at.ac.wu.minerfulgui.App;
import javafx.fxml.FXML;

public class StartPageController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
