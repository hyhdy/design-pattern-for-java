package com.observer.standard;

public class Client {

	public static void main(String[] args) {
		AbsSubject s=new ConcreteSubject();
		AbsObserver o=new ConcreteObserver();
		
		s.addObserver(o);
		s.setChanged(true);//设置观察目标发生了改变
		
		s.notifyUpdate();

	}

}
