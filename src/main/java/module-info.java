module com.example.studentcrud {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.studentcrud to javafx.fxml;
    exports com.example.studentcrud;
}
