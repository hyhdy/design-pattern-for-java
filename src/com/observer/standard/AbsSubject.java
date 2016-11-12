package com.observer.standard;

import java.util.ArrayList;
import java.util.List;

public abstract class AbsSubject {
	private List<AbsObserver> observers;//�۲��߼���
	private boolean changed=false;//��־���۲�����Ƿ����ı�
	
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
