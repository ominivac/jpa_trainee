package jpa_trainee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.trainee.entidade.Categoria;
import com.trainee.util.HibernateUtil;

public class CategoriaTest {
	
	
	public void a(){
		Categoria c = new Categoria();
		c.setDescricao("Bebidas");
		
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
		//EntityManagerFactory emf = new PersistenceProvider().createEntityManagerFactory("");
		
		//EntityManager em = emf.createEntityManager();
		/*
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();
		
		*/
	}
	
	public static void main(String[] args){
		
		Categoria c = new Categoria();
		c.setDescricao("Bebidas");
		
		Transaction transaction = null;
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.persist(c);
            
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
		
		
	}

}
