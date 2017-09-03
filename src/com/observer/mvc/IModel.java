package com.observer.mvc;

public interface IModel {
	/**
	 * 添加视图
	 */
	public void addView(IView sv);
	/**
	 * 删除视图
	 */
	public void deleteView();
	/**
	 * 通知更新
	 */
	public void notifyUpdate();
}
