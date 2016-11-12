package com.observer.standard;

public class Client {

	public static void main(String[] args) {
		AbsSubject s=new ConcreteSubject();
		AbsObserver o=new ConcreteObserver();
		
		s.addObserver(o);
		s.setChanged(true);//���ù۲�Ŀ�귢���˸ı�
		
		s.notifyUpdate();

	}

}
