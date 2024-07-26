package com.project.dating.controllers;

import com.project.dating.dao.UserAccountDAOImpl;
import com.project.dating.model.Interest;
import com.project.dating.model.UserAccount;
import com.project.dating.dao.UserAccountDAO;

public class UserAccountController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAccountController controller = new UserAccountController();
		//controller.registerUser();
		controller.findAllUsers();
		//controller.findMatchingUsers();
	}

	public void registerUser() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		createUsers(dao);
		System.out.println(dao.findById(1));
		System.out.println(dao.findById(2));
	}

	public void findAllUsers() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		createUsers(dao);
		System.out.println(dao.findAll());
		dao.delete(1);
		System.out.println(dao.findAll());
	}

	public void findMatchingUsers() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		createUsers(dao);
		System.out.println(dao.findMatcher(33, "san fran"));

	}

	private void createUsers(UserAccountDAO dao) {
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setUserName("katy");
		userAccount.setAge(30);
		userAccount.setCity("austin");
		userAccount.setCountry("usa");
		userAccount.setEmail("a@p.com");
		userAccount.setGender("M");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("1234567890");
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("watching movies");
		interest.setDislikes("nothing");
		interest.setHobbies("playing");
		userAccount.setInterest(interest);
		dao.save(userAccount);

		UserAccount userAccount2 = new UserAccount();
		userAccount2.setId(2);
		userAccount2.setUserName("jacy");
		userAccount2.setAge(33);
		userAccount2.setCity("san fran");
		userAccount2.setCountry("usa");
		userAccount2.setEmail("a@p.com");
		userAccount2.setGender("M");
		userAccount2.setPassword("password");
		userAccount2.setPhoneNumber("1234567890");
		Interest interest2 = new Interest();
		interest2.setId(1);
		interest2.setLikes("watching movies");
		interest2.setDislikes("nothing");
		interest2.setHobbies("playing");
		userAccount2.setInterest(interest2);
		dao.save(userAccount2);
	}
}
