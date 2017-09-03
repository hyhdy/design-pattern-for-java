package com.observer.standard;

public class ConcreteObserver implements IObserver {
	private String name;
	@Override
	public void update(AbsSubject s, Object o) {
		System.out.println("update");
	}

}
