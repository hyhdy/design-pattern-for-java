package com.observer.standard;

public interface IObserver {
	/**
	 * ����۲��ߵĸ�����Ϊ
	 * @param s������������󣨱��۲��ߣ�
	 * @param o�����ݵĶ�����Ϣ
	 */
	public void update(AbsSubject s,Object o);
}
