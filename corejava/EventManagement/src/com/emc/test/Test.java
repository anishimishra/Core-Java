package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImpl;
import com.emc.managers.EventManagerImpl2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organizer organizer = new Organizer();
		organizer.setId(123l);
		organizer.setName("Apple Inc");
		System.out.println(organizer);
		System.out.println(organizer.getName());

		Event event = new Event(456l, "Iphone 100 launch", "Grand launch");
		System.out.println(event.getDescription());
		System.out.println(event.getName());

		EventManager em = new EventManagerImpl();
		System.out.println(em.create(456l));
		System.out.println(em.create(456l).getId());
		
		EventManager em2 = new EventManagerImpl2();
		System.out.println(em2.create(456l));
		System.out.println(em2.create(456l).getName());
	}

}
