module org.example.mysqlfxconect {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.sql;
    requires java.desktop;

    opens org.example.mysqlfxconect to javafx.fxml;
    exports org.example.mysqlfxconect;
    exports org.example.mysqlfxconect.controller;
    opens org.example.mysqlfxconect.controller to javafx.fxml;
}