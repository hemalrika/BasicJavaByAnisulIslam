module com.example.basicjavabyanisulislam {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.basicjavabyanisulislam to javafx.fxml;
    exports com.example.basicjavabyanisulislam;
}