module gui.nato {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens gui.nato to javafx.fxml;
    exports gui.nato;
}