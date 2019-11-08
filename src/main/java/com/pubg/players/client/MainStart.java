package com.pubg.players.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MainStart {
	
	@Autowired
	private Main main;

	@EventListener(classes = { ContextStartedEvent.class })
	public void onStartup() {
		main.method();
	}

}
