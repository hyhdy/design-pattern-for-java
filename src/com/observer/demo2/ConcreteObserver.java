package com.observer.demo2;

public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("收到通知，进行更新");
	}

}
