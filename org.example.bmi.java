module org.example.bmi {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.bmi to javafx.fxml;
    exports org.example.bmi;
    exports org.example.bmicalculator;
    opens org.example.bmicalculator to javafx.fxml;
}