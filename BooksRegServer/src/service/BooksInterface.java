package service;

import java.rmi.*;
import java.util.*;
import model.*;

public interface BooksInterface extends Remote{

    public void saveBook(Books book) throws RemoteException;

    public List<Books> getBooks() throws RemoteException;
}
