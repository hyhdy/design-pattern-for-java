package com.observer.simple.inter;

public class Client {

	public static void main(String[] args) {
		ConCreteSubject s=new ConCreteSubject();
		Observer o=new ConcreteObserver();
		
		s.registerObserver(o);
		s.setChanged(true);
		s.notifyUpdate();	

	}

}
