package com.observer.demo2;

public class ConcreteSubject implements Subject {
	private Observer observer;
	@Override
	public void notifyUpdate() {
		// TODO Auto-generated method stub
		observer.update();
	}
	
	public void registerObserver(Observer observer){
		this.observer=observer;
	}

}
