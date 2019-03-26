package com.gupaoedu.observer.simple;

public class Test {

	public static void main(String[] args) {
		
		Gper gper = Gper.getInstance();
		
		Question question = new Question();
		
		question.setUserName("小明");
		
		question.setContent("老师这道题我不会啊！");
		
		Teacher tom = new Teacher("Tom");
		Teacher mic = new Teacher("Mic");
		gper.addObserver(tom);
		gper.addObserver(mic);
		
		gper.publishQuestion(question);
	}
}
