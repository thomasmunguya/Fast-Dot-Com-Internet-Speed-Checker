module com.theschool.fastinternetspeedchecker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.theschool.fastinternetspeedchecker to javafx.fxml;
    exports com.theschool.fastinternetspeedchecker;
}