package com.trainee.dao;

import javax.persistence.EntityManager;

import com.trainee.entidade.Categoria;
import com.trainee.util.ConnectionFactory;

public class CategoriaDAO {
	
	
	public Categoria save(Categoria categoria){
		EntityManager em = new ConnectionFactory().getConnection();
		try{
			em.getTransaction().begin();
			em.persist(categoria);
			em.getTransaction().commit();
			
		}catch (Exception e) {
			em.getTransaction().rollback();
		}finally{
			em.close();
		}
		
		return categoria;
	}

}
