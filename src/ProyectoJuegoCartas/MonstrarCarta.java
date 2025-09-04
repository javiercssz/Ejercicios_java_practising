package ProyectoJuegoCartas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MonstrarCarta extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Monstrar carta");
        Image cartasIcono = new Image(getClass().getResourceAsStream("/icono.png"));
        Image monstrarImagen = new Image(getClass().getResourceAsStream("/cartas/carta1.png"));

        ImageView cartaView = new ImageView(monstrarImagen);
        cartaView.setFitWidth(150);
        cartaView.setFitHeight(300);
        cartaView.setPreserveRatio(true);
        StackPane carta = new StackPane(cartaView);



        primaryStage.getIcons().add(cartasIcono);
        StackPane root = new StackPane(carta);
        Scene scene = new Scene(root,400,300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
