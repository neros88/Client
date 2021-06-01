package ensi.comm;
import ensi.model.Personne;

import java.io.*;

import java.net.InetAddress;

import java.net.Socket;

import java.net.UnknownHostException;
/**
 * Created by faye on 01/06/2017.
 */
public class ClientMessage {

    public static void connection()
    {
        Socket socket;
        Personne.player = new Personne();

        try
        {
            socket = new Socket(InetAddress.getLocalHost(),2009);
            System.out.println("Demande de connexion");
            InputStream is=socket.getInputStream();
            ObjectInputStream ois=new ObjectInputStream(is);

            Personne.player= (Personne) ois.readObject();// envoie de l'objet
            Personne.player.afficher();

            socket.close();

        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
