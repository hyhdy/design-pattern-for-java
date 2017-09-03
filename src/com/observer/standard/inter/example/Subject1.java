/**
 * 
 */
package com.observer.standard.inter.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import com.observer.standard.inter.IObserver;
import com.observer.standard.inter.ISubject;

/**
 * @author hyh
 *
 */
public class Subject1 implements ISubject{
	private String name;
	private boolean changed;
	private List<IObserver> observers;
		
	public Subject1(String name) {
		super();
		this.name = name;
		observers=new ArrayList<IObserver>();
	}

	@Override
	public void notifyUpdate(Object o) {
			for(IObserver observer:observers){
				observer.update(this,o);
			}
	}
	@Override
	public void addObserver(IObserver observer){
		observers.add(observer);
	}
	@Override
	public void deleteObserver(IObserver observer){
		observers.remove(observer);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean changed) {
		this.changed = changed;
	}

	@Override
	public void notifyUpdate() {
		notifyUpdate(null);
	}

	
}
