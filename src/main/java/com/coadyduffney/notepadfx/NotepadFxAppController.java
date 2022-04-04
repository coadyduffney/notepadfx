package com.coadyduffney.notepadfx;

import com.tangorabox.componentinspector.fx.FXComponentInspectorHandler;
import javafx.fxml.FXML;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class NotepadFxAppController {
    @FXML
    private TextArea textArea;

    @FXML
    private CheckMenuItem wordWrapMenuItem;

    @FXML
    public void initialize() {
        AnchorPane.setLeftAnchor(textArea, 0.);
        AnchorPane.setBottomAnchor(textArea, 0.);
        AnchorPane.setRightAnchor(textArea, 0.);
        AnchorPane.setTopAnchor(textArea, 0.);
    }

    @FXML
    public void setWrapText() {
        textArea.setWrapText(wordWrapMenuItem.isSelected());
    }
}