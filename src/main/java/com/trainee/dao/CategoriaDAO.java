package com.trainee.dao;

import javax.persistence.EntityManager;

import com.trainee.entidade.Categoria;
import com.trainee.util.ConnectionFactory;

public class CategoriaDAO {
	
	
	public Categoria save(Categoria categoria){
		EntityManager em = new ConnectionFactory().getConnection();
		try{
			em.getTransaction().begin();
			
			if(categoria.getId() == null){
				em.persist(categoria);
			}else{
				em.merge(categoria);
			}
			
			em.getTransaction().commit();
			
		}catch (Exception e) {
			em.getTransaction().rollback();
		}finally{
			em.close();
		}
		
		return categoria;
	}
	
	public Categoria findById(Integer id){
		Categoria categoria =  null;
		EntityManager em = new ConnectionFactory().getConnection();
		
		try{
			categoria =  em.find(Categoria.class, id);
		}catch (Exception e) {
			em.getTransaction().rollback();
		}finally{
			em.close();
		}
		return categoria;
	}

}
