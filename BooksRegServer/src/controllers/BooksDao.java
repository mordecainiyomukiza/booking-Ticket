package controllers;

import java.util.*;
import org.hibernate.*;
import model.*;

public class BooksDao {

    //FUNCTION FOR SAVING THE BOOK IN DB USING HIBERNATE
    public void saveBook(Books book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(book);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    //FUNCTION FOR FETCHING THE BOOKS USING HIBERNATE
    public List<Books> displayBooks() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        List result = new ArrayList();
        try {
            tx = session.beginTransaction();
            result = session.createQuery("From Books").list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }
}
