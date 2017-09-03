package com.observer.mvc;

public class Model implements IModel {
	/**
	 * Model的一些属性
	 */
	private String name;//名字
	private String display;//展示数据
	private boolean changed;//是否发生改变
	
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
