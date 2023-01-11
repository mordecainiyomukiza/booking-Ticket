package service;

import controllers.BooksDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import model.Books;

public class BooksService extends UnicastRemoteObject implements BooksInterface {

    public BooksService() throws RemoteException {
        super();
    }

    //CREATING THE DAO OBJECT
    BooksDao dao = new BooksDao();

    //CREATING THE SAVEBOOK FUNCTION TO SAVE BOOKS AND IMPLEMENT THE BOOKINTERFACE
    @Override
    public void saveBook(Books book) throws RemoteException {
        dao.saveBook(book);
    }

    //CREATING THE GETBOOKS FUNCTION TO SAVE BOOKS AND IMPLEMENT THE BOOKINTERFACE
    @Override
    public List<Books> getBooks() throws RemoteException {
        List booksResult = dao.displayBooks();
        return booksResult;
    }

}
