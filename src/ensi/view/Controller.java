package ensi.view;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;

import java.io.*;


public class Controller {

    @FXML public MenuItem nouvellepartie;
    @FXML public MenuItem sauvegarder;

    public void nouvellepartie(){
        System.out.println("Nouvelle Partie");
    }
    public void chargerpartie(){
    }
    public void save(){
        System.out.println("Sauvegarde");
    }
    public void stopgame(){
        System.out.println("Fin de Partie");
    }
    
    public void greenplayer(){
    }
    public void redplayer(){
    }

    public void prendrecase(MouseEvent event){
        //Circle circle = (Circle) event.getSource();

    }
}

