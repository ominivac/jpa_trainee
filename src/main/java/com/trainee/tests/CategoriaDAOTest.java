package com.trainee.tests;

import com.trainee.dao.CategoriaDAO;
import com.trainee.entidade.Categoria;

public class CategoriaDAOTest {
	
	public static void main(String[] args) {
		Categoria c1 = new Categoria();
		c1.setDescricao("Carnes");
		
		CategoriaDAO cdao = new CategoriaDAO();
		c1 = cdao.save(c1);
		System.out.println(c1.getId() +"  " + c1.getDescricao() );
	}
	
	
	

}
