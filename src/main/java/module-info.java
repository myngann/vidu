module com.mycompany.nhatroapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.nhatroapp to javafx.fxml;
    exports com.mycompany.nhatroapp;
}
