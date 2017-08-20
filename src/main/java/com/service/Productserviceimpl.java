package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Productdao;
import com.model.Product;
@Service
public class Productserviceimpl implements Productservice{
@Autowired	
private Productdao productDao;
	public void saveOrUpdateProduct(Product product) {
	   productDao.saveOrUpdateProduct(product);
		
	}
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}
	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
		
	}

}
