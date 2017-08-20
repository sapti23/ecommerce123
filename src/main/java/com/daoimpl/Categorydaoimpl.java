package com.daoimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.Categorydao;
import com.model.Category;
@Repository
public class Categorydaoimpl implements Categorydao{
	@Autowired
private SessionFactory sessionFactory;
	public List<Category> getAllCategories() {
	    Session session=sessionFactory.openSession();
	    Query query=session.createQuery("from Category");
	    List<Category> categories=query.list();
	    session.close();
	    return categories;
	}

}
