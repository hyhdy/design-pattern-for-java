package com.observer.mvc;

public interface IModel {
	/**
	 * �����ͼ
	 */
	public void addView(SubView sv);
	/**
	 * ɾ����ͼ
	 */
	public void deleteView();
	/**
	 * ֪ͨ����
	 */
	public void notifyUpdate();
}
