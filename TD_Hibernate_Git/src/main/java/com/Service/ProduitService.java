package com.Service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.Model.Produit;
import com.smarone.TD_Hibernate_Git.HibernateUtil;

public class ProduitService implements Serializable {
	public boolean create(Produit p, Session s) {
		
		s.save(p);
		s.getTransaction().commit();
		HibernateUtil.shutdown();
		
		return true;
	}
	public void Delete(Produit p, Session s ) {
		p = s.get(Produit.class, 3);
		s.delete(p);
	}
	
	public void update(Session s, int id) {
		Produit p = s.get(Produit.class, id);
		p.setPrix(500);
		s.update(p);
	}
	
	public Produit findById(Session s, int id) {
		Produit p = s.get(Produit.class, id);
		return p;
	}
	
	public List<Produit> findAll(Session s) {
		Query q = s.createQuery("from Produit");
		List<Produit> listp = q.list();
		return listp;
	}
	

}

