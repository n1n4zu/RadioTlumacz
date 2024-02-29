package gui.nato;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Tłumacz");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
        Parent layout = fxmlLoader.load();

        Scene scene = new Scene(layout);

        stage.setScene(scene);
        stage.show();
    }
}