package com.observer.simple.in;


public class ConCreteSubject implements Subject {
	private boolean changed;//标志是否发生了变化
	private Observer observer;

	@Override
	public void notifyUpdate() {
		if(changed){
			if(observer!=null){
				observer.update();
			}
		}
	}
	

	@Override
	public void registerObserver(Observer observer) {
		this.observer=observer;
	}

	@Override
	public void removeObserver(Observer o) {
		this.observer=null;	
	}


	public boolean isChanged() {
		return changed;
	}


	public void setChanged(boolean changed) {
		this.changed = changed;
	}

}
