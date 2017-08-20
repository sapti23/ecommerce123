package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Categorydao;
import com.model.Category;
@Service
public class Categoryserviceimpl implements Categoryservice{
	@Autowired
private Categorydao categoryDao;
	public List<Category> getAllCategories() {
		return categoryDao.getAllCategories();
	}

}
