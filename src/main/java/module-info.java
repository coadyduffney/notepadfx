module com.coadyduffney.notepadfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires component.inspector.fx;

    opens com.coadyduffney.notepadfx to javafx.fxml;
    exports com.coadyduffney.notepadfx;
}