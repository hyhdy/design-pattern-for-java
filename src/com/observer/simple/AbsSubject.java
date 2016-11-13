package com.observer.simple;

import com.observer.simple.in.Observer;

public abstract class AbsSubject {
	private boolean changed;//标志是否发生了变化
	private IObserver observer;

	public void notifyUpdate() {
		if(changed){
			if(observer!=null){
				observer.update();
			}
		}
	}
	

	public void registerObserver(IObserver observer) {
		this.observer=observer;
	}

	public void removeObserver() {
		this.observer=null;	
	}


	public boolean isChanged() {
		return changed;
	}


	public void setChanged(boolean changed) {
		this.changed = changed;
	}
}
