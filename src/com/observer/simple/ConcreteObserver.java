package com.observer.simple;

public class ConcreteObserver implements IObserver {

	@Override
	public void update() {
		System.out.println("收到更新通知，进行更新");
	}

}
