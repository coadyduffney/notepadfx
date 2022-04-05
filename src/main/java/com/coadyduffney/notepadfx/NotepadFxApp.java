package com.coadyduffney.notepadfx;

import com.tangorabox.componentinspector.fx.FXComponentInspectorHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NotepadFxApp extends Application {
    public static Stage WINDOW;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NotepadFxApp.class.getResource("notepadfx-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("NotepadFX");
        stage.setScene(scene);
        stage.show();

        WINDOW = stage;

        // Enable scene inspector.
        FXComponentInspectorHandler.handleAll();
    }

    public static void main(String[] args) {
        launch();
    }
}