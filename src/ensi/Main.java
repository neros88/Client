package ensi;

import ensi.comm.ClientMessage;
import ensi.model.Personne;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("./view/Mancala.fxml"));
        primaryStage.setTitle("Mancala");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        // Connection au Serveur
        ClientMessage.connection();
        // Jeu
        launch(args);
    }

}
