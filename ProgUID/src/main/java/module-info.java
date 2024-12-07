module org.example.proguid {
    requires javafx.controls;
    requires javafx.fxml;

    //requires org.kordamp.ikonli.javafx;
    requires java.sql;
    requires java.desktop;

    opens org.example.proguid to javafx.fxml;
    exports org.example.proguid;
    exports org.example.proguid.controller;
    opens org.example.proguid.controller to javafx.fxml;
}