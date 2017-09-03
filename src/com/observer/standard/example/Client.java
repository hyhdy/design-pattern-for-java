package com.observer.standard.example;

import com.observer.standard.AbsSubject;
import com.observer.standard.IObserver;

public class Client {

	public static void main(String[] args) {
		AbsSubject s=new ConcreteSubject();
		IObserver o=new ConcreteObserver();
		
		s.addObserver(o);
		s.setChanged(true);//设置观察目标发生了改变
		
		s.notifyUpdate();

	}

}
