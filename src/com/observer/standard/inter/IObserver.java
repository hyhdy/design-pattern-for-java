/**
 * 
 */
package com.observer.standard.inter;

/**
 * @author hyh
 *观察者接口
 */
public interface IObserver {
	/**
	 * 观察者方法
	 * @param subject：抽象主题接口（被观察者抽象层对象）
	 * @param o：额外信息
	 */
	public void update(ISubject subject, Object o);
}
