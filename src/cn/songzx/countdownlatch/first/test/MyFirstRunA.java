/**   
* @Title: MyFirstRunA.java 
* @Package cn.songzx.countdownlatch.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月30日 下午10:50:37 
* @version V1.0   
*/
package cn.songzx.countdownlatch.first.test;

import cn.songzx.countdownlatch.first.extthread.MyFirstThreadA;
import cn.songzx.countdownlatch.first.service.MyFirstServiceA;

/** 
* @ClassName: MyFirstRunA 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Songzx songzx_2326@163.com 
* @date 2017年10月30日 下午10:50:38 
*  
*/
public class MyFirstRunA {

	/**
	 * @Date: 2017年10月30日下午10:50:38
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyFirstServiceA service = new MyFirstServiceA();
			MyFirstThreadA threadA = new MyFirstThreadA(service);
			threadA.start();
			Thread.sleep(2000L);
			service.downMethodA();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
