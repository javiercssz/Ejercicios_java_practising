package ProyectoJuegoCartas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Haz clic aquí");
        btn.setOnAction(e -> System.out.println("¡Hola desde JavaFX!"));

        StackPane root = new StackPane(btn);
        Scene scene = new Scene(root, 400, 300);


        primaryStage.setTitle("Mi primer JavaFX");
        Image cartasIcono = new Image(getClass().getResourceAsStream("/icono.png")); //No encuentra la ubicación de la imagen
                                                                                            // (esta en el packete resources)
        primaryStage.getIcons().add(cartasIcono);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

