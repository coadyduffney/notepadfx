package com.coadyduffney.notepadfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class NotepadFxAppController {
    @FXML
    private TextArea textArea;

    @FXML
    public void initialize() {
        AnchorPane.setLeftAnchor(textArea, 0.);
        AnchorPane.setBottomAnchor(textArea, 0.);
        AnchorPane.setRightAnchor(textArea, 0.);
        AnchorPane.setTopAnchor(textArea, 0.);

        textArea.setStyle("-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");

    }
}