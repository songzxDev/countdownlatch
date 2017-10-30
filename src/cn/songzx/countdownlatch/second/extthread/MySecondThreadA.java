/**   
* @Title: MySecondThreadA.java 
* @Package cn.songzx.countdownlatch.second.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月30日 下午10:54:58 
* @version V1.0   
*/
package cn.songzx.countdownlatch.second.extthread;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: MySecondThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月30日 下午10:54:58
 * 
 */
public class MySecondThreadA extends Thread {

	private CountDownLatch maxRuner;

	/**
	 * @Date: 2017年10月30日下午10:55:54
	 * @Title: MySecondThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param maxRuner
	 */
	public MySecondThreadA(CountDownLatch maxRuner) {
		super();
		this.maxRuner = maxRuner;

	}

	public void run() {
		try {
			Thread.sleep(3000L);
			maxRuner.countDown();
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
