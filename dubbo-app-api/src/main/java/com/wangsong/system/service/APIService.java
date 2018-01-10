package com.wangsong.system.service;

import java.util.List;

import com.wangsong.system.model.Resources;
import com.wangsong.system.model.User;



public interface APIService {
	
	public User findUserByUser(User users);
	public List<Resources> findResourcesByResources(Resources resources);
}
