package com.dao;


import java.util.List;

import com.model.Product;

public interface Productdao {
void saveOrUpdateProduct(Product product);

List<Product> getAllProducts();

Product getProductById(int id);

void deleteProduct(int id);
}
