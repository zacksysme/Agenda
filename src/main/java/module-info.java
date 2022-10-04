module cadastro.aula1.view {
    requires javafx.controls;
    requires javafx.fxml;

    opens cadastro.aula1.view to javafx.fxml;
    exports cadastro.aula1.view;
}
