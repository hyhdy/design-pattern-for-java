/**
 * 
 */
package com.observer.demo1;

/**
 * @author hyh
 *
 */
public class Observer4 implements IObserver {

	@Override
	public void update(Object subject,Object o) {
		Subject2 s=(Subject2) subject;
		System.out.println("\n我是4号观察者,无论观察目标有没有改变我都会更新");
		System.out.println("进行更新");
		System.out.println("观察目标的名字:"+s.getName());
		System.out.println("收到的信息:"+o);
	}

}
