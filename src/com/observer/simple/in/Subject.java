package com.observer.simple.in;
/**
 * ��������ӿڣ�������Ϊ
 * @author hyh
 *
 */
public interface Subject {
	/**
	 * ע��۲���
	 * @param o:����۲���
	 */
	public void registerObserver(Observer o);
	/**
	 * �Ƴ��۲���
	 * @param o
	 */
	public void removeObserver(Observer o);
	/**
	 * ֪ͨ�۲��߸���
	 */
	public void notifyUpdate();
	
}
