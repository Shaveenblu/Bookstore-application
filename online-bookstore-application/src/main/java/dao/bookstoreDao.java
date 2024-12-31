package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import model.bookstore;
import util.HibernateUtil;

public class bookstoreDao implements IBookDAO {

		@Override
		 public void save(Bookstore bookstore) {
		 Transaction transaction = null;
		 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
		 // start the transaction
		 transaction = session.beginTransaction();
		 // save student object
		 session.persist(bookstore);
		 // commit the transaction
		 transaction.commit();
		 } catch (Exception e) {
		 if (transaction != null) {
		 transaction.rollback();
		 }
		 }
		 }
		
		 @Override
		 public void update(Bookstore bookstore) {
			 Transaction transaction = null;
			 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			 // start the transaction
			 transaction = session.beginTransaction();
			 // update student object
			 session.merge(bookstore);
			 // commit the transaction
			 transaction.commit();
			 } catch (Exception e) {
			 if (transaction != null) {
			 transaction.rollback();
			 }
			 }
			 }
		 
			 @Override
			 public Student findById(long id) {
			 Transaction transaction = null;
			 Bookstore bookstore = null;
			 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			 // start the transaction
			 transaction = session.beginTransaction();
			 // get student object
			 student = session.get(Bookstore.class, id);
			 
			 // commit the transaction
			 transaction.commit();
			 } catch (Exception e) {
			 if (transaction != null) {
			 transaction.rollback();
			 }
			 }
			 return bookstore;
			 }

			 @Override
			 public List < Student > findAll() {
			 Transaction transaction = null;
			 List < Bookstore > bookstore = null;
			 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			 // start the transaction
			 transaction = session.beginTransaction();
			 // get students
			 JpaCriteriaQuery<Student> cq = session.getCriteriaBuilder().createQuery(Bookstore.class);
			cq.from(Bookstore.class);
			bookstore = session.createQuery(cq).getResultList();
			 //student = session.load(Student.class, id);
			 // commit the transaction
			 transaction.commit();
			 } catch (Exception e) {
			 if (transaction != null) {
			 transaction.rollback();
			 }
			 }
			 return bookstore;
			 }
			 
			 @Override
			 public void delete(long id) {
			 Transaction transaction = null;
			 Bookstore bookstore = null;
			 try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			 // start the transaction
			 transaction = session.beginTransaction();
			 student = session.get(Student.class, id);
			 // remove student object
			 session.remove(student);
			 
			 // commit the transaction
			 transaction.commit();
			 } catch (Exception e) {
			 if (transaction != null) {
			 transaction.rollback();
			 }
			 }
			 }

		 
	}


