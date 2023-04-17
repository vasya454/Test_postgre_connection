module com.example.test_postgre_connection {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test_postgre_connection to javafx.fxml;
    exports com.example.test_postgre_connection;
}