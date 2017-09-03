package com.observer.mvc;

public interface IView {
	/**
	 * 更新，采用拉模型
	 * @param m
	 */
	public void update(IModel m);
}
