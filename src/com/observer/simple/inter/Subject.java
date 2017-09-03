package com.observer.simple.inter;
/**
 * 抽象主题接口，定义行为
 * @author hyh
 *
 */
public interface Subject {
	/**
	 * 注册观察者
	 * @param o:抽象观察者
	 */
	public void registerObserver(Observer o);
	/**
	 * 移除观察者
	 * @param o
	 */
	public void removeObserver(Observer o);
	/**
	 * 通知观察者更新
	 */
	public void notifyUpdate();
	
}
