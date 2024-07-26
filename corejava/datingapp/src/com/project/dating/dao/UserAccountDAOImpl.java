package com.project.dating.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.project.dating.model.UserAccount;

public class UserAccountDAOImpl implements UserAccountDAO {
	Map<Integer, UserAccount> userAccounts = new HashMap<>();

	@Override
	public void save(UserAccount userAccount) {
		// TODO Auto-generated method stub
		userAccounts.put(userAccount.getId(), userAccount);
	}

	@Override
	public UserAccount findById(int id) {
		// TODO Auto-generated method stub
		return userAccounts.get(id);
	}

	@Override
	public List<UserAccount> findAll() {
		// TODO Auto-generated method stub
		return new ArrayList<UserAccount>(userAccounts.values());
	}

	@Override
	public List<UserAccount> findMatcher(int age, String city) {
		// TODO Auto-generated method stub
		Collection<UserAccount> accounts = userAccounts.values();
		ArrayList<UserAccount> matches = new ArrayList<UserAccount>();
		for (UserAccount userAccount : accounts) {
			if (userAccount.getAge() == age && userAccount.getCity().equals(city)) {
				matches.add(userAccount);
			}
		}
		return matches;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userAccounts.remove(id);
	}

}
