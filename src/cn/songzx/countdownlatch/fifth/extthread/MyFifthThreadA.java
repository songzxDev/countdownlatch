/**   
* @Title: MyFifthThreadA.java 
* @Package cn.songzx.countdownlatch.fifth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月5日 下午9:17:19 
* @version V1.0   
*/
package cn.songzx.countdownlatch.fifth.extthread;

import cn.songzx.countdownlatch.fifth.service.MyFifthServiceA;

/**
 * @ClassName: MyFifthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月5日 下午9:17:19
 * 
 */
public class MyFifthThreadA extends Thread {
	private MyFifthServiceA service;

	/**
	 * @Date: 2017年11月5日下午9:17:51
	 * @Title: MyFifthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param service
	 */
	public MyFifthThreadA(MyFifthServiceA service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethodA();
	}
}
