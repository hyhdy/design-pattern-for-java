package com.observer.standard.in;

public class Client {

	public static void main(String[] args) {
			Subject1 subject1=new Subject1("subject1");
			IObserver observer1=new Observer1();
			IObserver observer2=new Observer2();
			
			subject1.addObserver(observer1);
			subject1.addObserver(observer2);
			subject1.setChanged(false);
			subject1.notifyUpdate("hello");
			
			
			Subject2 subject2=new Subject2("subject2");
			IObserver observer3=new Observer3();
			IObserver observer4=new Observer4();
			
			subject2.addObserver(observer3);
			subject2.addObserver(observer4);
			subject2.setChanged(true);
			subject2.notifyUpdate("world");
	}

}
