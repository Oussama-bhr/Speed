module com.example.speed {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.speed to javafx.fxml;
    exports com.example.speed;
}