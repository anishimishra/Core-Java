package com.project.dating.dao;

import java.util.List;

import com.project.dating.model.UserAccount;

public interface UserAccountDAO {
	void save(UserAccount userAccount);

	UserAccount findById(int id);

	List<UserAccount> findAll();

	List<UserAccount> findMatcher(int age, String city);

	void delete(int id);
}
