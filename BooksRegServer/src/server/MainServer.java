package server;

import java.rmi.registry.*;
import service.*;

public class MainServer {

    public static void main(String[] args) {
        try {
            //CREATING THE REGISTRY WITH PORT
            Registry registry = LocateRegistry.createRegistry(2078);
            BooksInterface book = (BooksInterface) new BooksService();
            //BINDING THE BOOK INTERFACE OBJECT TO THE REGISTRY
            registry.rebind("bookservice", book);
            System.out.print("Server running on port: 2078");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
