package com.observer.standard.example;

import com.observer.standard.AbsSubject;
import com.observer.standard.IObserver;

public class ConcreteObserver implements IObserver {
	private String name;
	@Override
	public void update(AbsSubject s, Object o) {
		System.out.println("update");
	}

}
