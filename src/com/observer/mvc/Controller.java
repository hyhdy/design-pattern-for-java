package com.observer.mvc;

public class Controller {
	private SubView view;
	private Model model;
	
	public Controller(SubView view) {
		super();
		this.view = view;
		
		model=new Model();
		//��view��model��
		model.addView(view);
	}
	
	public void doSomething(){
		System.out.println("controller��Ӧview�Ľ�������¼���֪ͨmodel����");
		
		//ģ��model����
		model.setName("����");
		model.setDisplay("���ϣ�����Ŷ");
		
		//���øı�
		model.setChanged(true);
		System.out.println("model�����˸ı䣬֪ͨview����");
		model.notifyUpdate();
		
	}
	
}
