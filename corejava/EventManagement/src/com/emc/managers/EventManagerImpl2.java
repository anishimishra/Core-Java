package com.emc.managers;

import com.emc.entities.Event;

public class EventManagerImpl2 implements EventManager {

	@Override
	public Event create(Long id) {
		// TODO Auto-generated method stub
		
		return new Event(id,"Mac book Launch","new gen of macbooks launch");
	}

}
