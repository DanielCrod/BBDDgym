module com.mycompany.gymbd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;

    opens com.mycompany.gymbd to javafx.fxml;
    exports com.mycompany.gymbd;
}
