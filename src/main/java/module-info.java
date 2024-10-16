module com.example.simuladorregistro {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.simuladorregistro to javafx.fxml;
    exports com.example.simuladorregistro;
}