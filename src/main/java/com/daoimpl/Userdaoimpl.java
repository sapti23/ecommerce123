package com.daoimpl;


import java.util.List;

import com.dao.Userdao;
import com.model.User;

import org.springframework.transaction.annotation.Transactional;
	public abstract class Userdaoimpl implements Userdao {
		private Userdao Userdao;

		public void setUserdao(Userdao Userdao) {
			this.Userdao = Userdao;
		}

		
		@Transactional
		public void addUser(User user) {
			this.Userdao.addUser(user);
		}

		
		@Transactional
		public void updateUser(User user) {
			this.Userdao.updateUser(user);
		}

		
		@Transactional
		public List<User> getUserList() {
			return this.Userdao.getUserList();
		}

	
		@Transactional
		public User getUserId(int id) {
			return this.Userdao.getUserId(id);
		}

	
		@Transactional
		public void deleteUser(int id) {
			this.Userdao.deleteUser(id);
		}

	}