package com.observer.mvc;

public class Model implements IModel {
	/**
	 * Model��һЩ����
	 */
	private String name;//����
	private String display;//չʾ����
	private boolean changed;//�Ƿ����ı�
	
	private SubView view;
	
	@Override
	public void addView(SubView sv) {
		view=sv;
	}

	@Override
	public void deleteView() {
		view=null;

	}

	@Override
	public void notifyUpdate() {
		if(view!=null){
			view.update(this);
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public boolean isChanged() {
		return changed;
	}

	public void setChanged(boolean changed) {
		this.changed = changed;
	}
	
	

}
