module co.edu.uniquindio.ventacafe.ventacafe {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.ventacafe.ventacafe to javafx.fxml;
    exports co.edu.uniquindio.ventacafe.ventacafe;
    opens co.edu.uniquindio.ventacafe.ventacafe.viewcontroller;
    exports co.edu.uniquindio.ventacafe.ventacafe.viewcontroller;
}