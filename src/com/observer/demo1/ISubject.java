/**
 * 
 */
package com.observer.demo1;

/**
 * @author hyh
 * 抽象主题接口
 */
public interface ISubject {
	/**
	 * 
	 * @param o:额外信息
	 */
	public void notifyUpdate(Object o) ;
}
