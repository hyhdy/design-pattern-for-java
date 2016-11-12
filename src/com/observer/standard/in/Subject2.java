/**
 * 
 */
package com.observer.standard.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @author hyh
 *
 */
public class Subject2 implements ISubject{
	private String name;
	private boolean changed;
	private List<IObserver> observers;
		
	public Subject2(String name) {
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

	public void addObserver(IObserver observer){
		observers.add(observer);
	}
	
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
