package com.coadyduffney.notepadfx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

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
    public void setWrapText(ActionEvent event) {
        textArea.setWrapText(wordWrapMenuItem.isSelected());
    }

    @FXML
    public void onOpen(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");

        File openFile = fileChooser.showOpenDialog(NotepadFxApp.WINDOW);

        if (null != openFile) {

            NotepadFxApp.WINDOW.setTitle("NotepadFX - " + openFile.getPath());

            try {
                String fileContent = Files.readString(openFile.toPath());
                textArea.setText(fileContent);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @FXML
    public void onSaveAs(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save File");

        File saveFile = fileChooser.showSaveDialog(NotepadFxApp.WINDOW);

        if (null != saveFile) {
            writeContentToFile(saveFile);
        }

    }

    private void writeContentToFile(File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(textArea.getText());
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void onExit(ActionEvent event) {
        Platform.exit();
    }
}