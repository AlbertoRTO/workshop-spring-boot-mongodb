package com.albertortoworkshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albertortoworkshopmongo.domain.User;
import com.albertortoworkshopmongo.repository.UserRepository;

@Service
public class UserService {
	
		@Autowired
		private UserRepository repo;
	
		public List<User> findAll() {
			return repo.findAll();
			
		}
}


