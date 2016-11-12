package com.observer.demo2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject=new ConcreteSubject();
		Observer observer=new ConcreteObserver();
		subject.registerObserver(observer);
		
		subject.notifyUpdate();
	}

}
