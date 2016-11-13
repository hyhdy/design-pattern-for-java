package com.observer.mvc;

import com.observer.simple.in.Observer;
import com.observer.simple.in.Subject;

public class View implements SubView {
	private Controller controller;//������
	
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
		System.out.println("ģ����Ļ������������Ӧ�¼������¼�����controller����");
		//���¼�����controller����
		controller.doSomething();
	}
	
	/**
	 * ˢ�½���
	 */
	public void refreshView(Model model){
		String name=model.getName();
		String display=model.getDisplay();
		System.out.println("�յ�Model֪ͨ�����½���");
		System.out.println("Model������������:");
		System.out.println("name="+name+" ,display="+display);
	}

}
