/**
 * 
 */
package com.observer.demo1;

/**
 * @author hyh
 *
 */
public class Observer3 implements IObserver {

	@Override
	public void update(Object subject,Object o) {
		//强转成具体观察目标,抽象观察目标使用接口而不是使用抽象类实现的不好之处就是得强转
		Subject2 s=(Subject2) subject;
		System.out.println("\n我是3号观察者,只有观察目标有改变我才更新");
		
		if(s.isChanged()){
			System.out.println("观察目标已经改变,进行更新");
			System.out.println("观察目标的名字:"+s.getName());
			System.out.println("收到的信息:"+o);
		}else{
			System.out.println("观察目标没改变,保持现状");
		}
	}

}
