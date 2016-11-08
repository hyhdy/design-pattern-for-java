/**
 * 
 */
package com.observer.demo1;

/**
 * @author hyh
 *
 */
public class Observer2 implements IObserver {

	@Override
	public void update(Object subject,Object o) {
		Subject1 s=(Subject1) subject;
		System.out.println("\n我是2号观察者,无论观察目标有没有改变我都会更新");
		System.out.println("进行更新");
		System.out.println("观察目标的名字:"+s.getName());
		System.out.println("收到的信息:"+o);
		
	}

}
