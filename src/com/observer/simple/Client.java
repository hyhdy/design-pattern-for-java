package com.observer.simple;

public class Client {

	public static void main(String[] args) {
		AbsSubject s=new ConCreteSubject();
		IObserver o=new ConcreteObserver();
		
		s.registerObserver(o);
		s.setChanged(true);
		s.notifyUpdate();	

	}

}
