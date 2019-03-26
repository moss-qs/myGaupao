package com.gupaoedu.observer.guava;

import com.google.common.eventbus.Subscribe;
import com.gupaoedu.observer.simple.Question;
import com.gupaoedu.observer.simple.Gper;

public class GuavaEvent {

	private Gper gper;
	
	public GuavaEvent(Gper gper) {
		this.gper = gper;
	}

	@Subscribe
	public void  subscribe(Question question){
		gper.publishQuestion(question);
	}
	
}
