package com.observer.simple.in;

public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("收到更新通知，进行更新");
	}

}
