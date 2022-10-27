module com.mycompany.bbddgimnasio {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    
    opens com.mycompany.bbddgimnasio to javafx.fxml;
    exports com.mycompany.bbddgimnasio;
}
