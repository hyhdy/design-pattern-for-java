/**
 * 
 */
package com.observer.standard.inter;

/**
 * @author hyh
 *
 */
public class Observer3 implements IObserver {

	@Override
	public void update(ISubject subject,Object o) {
		//寮鸿浆鎴愬叿浣撹瀵熺洰锟??,鎶借薄瑙傚療鐩爣浣跨敤鎺ュ彛鑰屼笉鏄娇鐢ㄦ娊璞＄被瀹炵幇鐨勪笉濂戒箣澶勫氨鏄緱寮鸿浆
		Subject2 s=(Subject2) subject;
		System.out.println("\n鎴戞槸3鍙疯瀵熻??,鍙湁瑙傚療鐩爣鏈夋敼鍙樻垜鎵嶆洿鏂?");
		
		if(s.isChanged()){
			System.out.println("瑙傚療鐩爣宸茬粡鏀瑰彉,杩涜鏇存柊");
			System.out.println("瑙傚療鐩爣鐨勫悕瀛?:"+s.getName());
			System.out.println("鏀跺埌鐨勪俊鎭?:"+o);
		}else{
			System.out.println("瑙傚療鐩爣娌℃敼鍙?,淇濇寔鐜扮姸");
		}
	}

}
