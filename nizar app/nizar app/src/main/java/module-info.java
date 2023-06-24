module com.example.controlebb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.NIZARAPP to javafx.fxml;
    exports com.example.NIZARAPP;
}