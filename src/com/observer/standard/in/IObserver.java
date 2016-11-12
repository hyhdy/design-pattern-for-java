/**
 * 
 */
package com.observer.standard.in;

/**
 * @author hyh
 *抽象观察者接口
 */
public interface IObserver {
	/**
	 * 
	 * @param subject:观察的目标
	 * @param o:额外信息
	 */
	public void update(ISubject subject, Object o);
}
