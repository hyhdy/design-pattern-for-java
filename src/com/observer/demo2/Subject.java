package com.observer.demo2;

public interface Subject {
	public void notifyUpdate();
	public void registerObserver(Observer observer);
}
