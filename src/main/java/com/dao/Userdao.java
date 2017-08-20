package com.dao;

import java.util.List;
import com.model.User;

public interface Userdao {
 public void insertData(Userdao user);
 public void updateUser(User user);  
 public void addUser(User user);
 public void deleteUser(int id);
public  User  getUserId(int id);
public  List<User> getUserList();
 
  
} 