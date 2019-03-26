package com.gupaoedu.observer.guava;

import com.google.common.eventbus.EventBus;
import com.gupaoedu.observer.simple.Gper;
import com.gupaoedu.observer.simple.Question;
import com.gupaoedu.observer.simple.Teacher;

public class GuavaEventTest {

	public static void main(String[] args) {
		Gper gper = Gper.getInstance();
		
		Question question = new Question();
		
		question.setUserName("小明");
		
		question.setContent("老师这道题我不会啊！");
		
		Teacher tom = new Teacher("Tom");
		Teacher mic = new Teacher("Mic");
		gper.addObserver(tom);
		gper.addObserver(mic);
		
		EventBus eventbus = new EventBus();
		GuavaEvent guavaEvent = new GuavaEvent(gper);
		eventbus.register(guavaEvent);
		eventbus.post(question);
	}
}
