package com.observer.mvc;

public class Controller {
	private SubView view;
	private Model model;
	
	public Controller(SubView view) {
		super();
		this.view = view;
		
		model=new Model();
		//将view与model绑定
		model.addView(view);
	}
	
	public void doSomething(){
		System.out.println("controller响应view的界面操作事件，通知model更新");
		
		//模拟model更新
		model.setName("杰伦");
		model.setDisplay("哎呦，不错哦");
		
		//设置改变
		model.setChanged(true);
		System.out.println("model发生了改变，通知view更新");
		model.notifyUpdate();
		
	}
	
}
