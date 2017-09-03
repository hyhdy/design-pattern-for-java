package com.observer.mvc;

import com.observer.simple.inter.Observer;
import com.observer.simple.inter.Subject;

public class View implements IView {
	private Controller controller;//控制器
	
	public View() {
		super();
		controller=new Controller(this);
	}

	@Override
	public void update(IModel m) {
		Model model=(Model) m;
		refreshView(model);
	}

	public void touch(){
		System.out.println("模拟屏幕操作，触发响应事件，将事件传给controller处理");
		//将事件传给controller处理
		controller.doSomething();
	}
	
	/**
	 * 刷新界面
	 */
	public void refreshView(Model model){
		String name=model.getName();
		String display=model.getDisplay();
		System.out.println("收到Model通知，更新界面");
		System.out.println("Model包含以下数据:");
		System.out.println("name="+name+" ,display="+display);
	}

}
