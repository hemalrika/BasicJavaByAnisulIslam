module com.example.basicjavabyanisulislam {
    requires javafx.controls;
    requires javafx.fxml;


    opens basic.java.basicjavabyanisulislam to javafx.fxml;
    exports basic.java.basicjavabyanisulislam;
}