package com.Service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.Model.Client;
import com.smarone.TD_Hibernate_Git.HibernateUtil;

public class ClientService implements Serializable {
	public boolean create(Client c, Session s) {
		
		s.save(c);
		s.getTransaction().commit();
		HibernateUtil.shutdown();
		
		return true;
	}
	public void Delete(Client c, Session s ) {
		c = s.get(Client.class, 3);
		s.delete(c);
	}
	
	public void update(Session s, int id) {
		Client c = s.get(Client.class, id);
		c.setPrenom("Paul");
		s.update(c);
	}
	
	public Client findById(Session s, int id) {
		Client c = s.get(Client.class, id);
		return c;
	}
	
	public List<Client> findAll(Session s) {
		Query q = s.createQuery("from Produit");
		List<Client> listc = q.list();
		return listc;
	}
	

}
