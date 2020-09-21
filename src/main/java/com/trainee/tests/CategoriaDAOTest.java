package com.trainee.tests;

import com.trainee.dao.CategoriaDAO;
import com.trainee.entidade.Categoria;

public class CategoriaDAOTest {
	
	public void salvar(){
		Categoria c1 = new Categoria();
		c1.setId(2);
		c1.setDescricao("Carnes alterado");
		
		CategoriaDAO cdao = new CategoriaDAO();
		c1 = cdao.save(c1);
		System.out.println(c1.getId() +"  " + c1.getDescricao() );
	}
	
	public static void main(String[] args) {
		Categoria c1 = new Categoria();
		c1.setId(2);
		
		
		
		CategoriaDAO cdao = new CategoriaDAO();
		c1 = cdao.findById(c1.getId() );
		System.out.println(c1);
		
		
	}
	
	
	

}
