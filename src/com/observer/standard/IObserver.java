package com.observer.standard;

public interface IObserver {
	/**
	 * 定义观察者的更新行为
	 * @param s：抽象主题对象（被观察者）
	 * @param o：传递的额外信息
	 */
	public void update(AbsSubject s,Object o);
}
