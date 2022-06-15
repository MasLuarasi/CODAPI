module com.example.codapi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;
    requires java.annotation;
    requires org.json;

    opens com.example.codapi to javafx.fxml;
    exports com.example.codapi;
}