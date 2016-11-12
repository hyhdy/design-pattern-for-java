package com.observer.standard;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsSubject {
	private List<AbsObserver> observers;//观察者集合
	private boolean changed=false;//标志被观察对象是否发生改变
	
	public AbsSubject() {
		super();
		observers=new ArrayList<AbsObserver>();
	}

	public void addObserver(AbsObserver o){
		observers.add(o);
	}
	
	public void deleteObserver(AbsObserver o){
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
			for(AbsObserver o:observers){
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
