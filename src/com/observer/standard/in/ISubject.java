/**
 * 
 */
package com.observer.standard.in;

/**
 * @author hyh
 * 抽象主题接口
 */
public interface ISubject {

	public void addObserver(IObserver observer);
	
	public void deleteObserver(IObserver observer);
	
	public void notifyUpdate() ;
	
	public void notifyUpdate(Object o) ;
}
