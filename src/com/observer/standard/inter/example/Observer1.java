/**
 * 
 */
package com.observer.standard.inter.example;

import com.observer.standard.inter.IObserver;
import com.observer.standard.inter.ISubject;

/**
 * @author hyh
 * 
 */
public class Observer1 implements IObserver {

	@Override
	public void update(ISubject subject,Object o) {
		if(subject instanceof Subject1) {
		Subject1 s=(Subject1) subject;
		System.out.println("收到通知更新信息");
		
		if(s.isChanged()){
			System.out.println("被观察对象发送改变");
			System.out.println("被观察对象:"+s.getName());
			System.out.println("额外信息"+o);
		}else{
			System.out.println("被观察对象未发送改变，不更新");
		}
		
		System.out.println();
		}
	}

}
