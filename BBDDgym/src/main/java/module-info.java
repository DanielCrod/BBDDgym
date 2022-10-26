module com.mycompany.practica_bbddrelacional {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    
    opens com.mycompany.practica_bbddrelacional to javafx.fxml;
    exports com.mycompany.practica_bbddrelacional;
}
