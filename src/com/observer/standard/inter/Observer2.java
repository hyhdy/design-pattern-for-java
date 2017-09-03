/**
 * 
 */
package com.observer.standard.inter;

/**
 * @author hyh
 *
 */
public class Observer2 implements IObserver {

	@Override
	public void update(ISubject subject,Object o) {
		Subject1 s=(Subject1) subject;
		System.out.println("\n鎴戞槸2鍙疯瀵熺洰鏍?,鏃犺瑙傚療鐩爣鏈夋病鏈夋敼鍙樻垜閮戒細鏇存柊");
		System.out.println("杩涜鏇存柊");
		System.out.println("瑙傚療鐩爣鐨勫悕瀛?:"+s.getName());
		System.out.println("鏀跺埌鐨勪俊鎭?:"+o);
		
	}

}
