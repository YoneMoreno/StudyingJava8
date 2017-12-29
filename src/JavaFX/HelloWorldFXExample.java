package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorldFXExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label hello_world = new Label("Hello World");
        hello_world.setFont(new Font(50));

        Scene scene = new Scene(hello_world);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
