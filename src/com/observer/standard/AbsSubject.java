package com.observer.standard;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsSubject {
	private List<IObserver> observers;//观察者集合
	private boolean changed=false;//标志被观察对象是否发生改变
	
	public AbsSubject() {
		super();
		observers=new ArrayList<IObserver>();
	}

	public void addObserver(IObserver o){
		observers.add(o);
	}
	
	public void deleteObserver(IObserver o){
		if(observers.size()==0){
			return;
		}
		observers.remove(o);
	}
	
	public void notifyUpdate(){
		notifyUpdate(null);
	}
	
	public void notifyUpdate(Object obj){
		if(changed){
			for(IObserver o:observers){
				o.update(this, obj);
			}
		}
	}

	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean changed) {
		this.changed = changed;
	}
}
