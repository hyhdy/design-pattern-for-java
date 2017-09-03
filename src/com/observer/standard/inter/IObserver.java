/**
 * 
 */
package com.observer.standard.inter;

/**
 * @author hyh
 *鎶借薄瑙傚療鑰呮帴鍙?
 */
public interface IObserver {
	/**
	 * 
	 * @param subject:瑙傚療鐨勭洰鏍?
	 * @param o:棰濆淇℃伅
	 */
	public void update(ISubject subject, Object o);
}
