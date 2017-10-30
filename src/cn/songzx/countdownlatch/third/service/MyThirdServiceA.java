/**   
* @Title: MyThirdServiceA.java 
* @Package cn.songzx.countdownlatch.third.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月30日 下午11:04:33 
* @version V1.0   
*/
package cn.songzx.countdownlatch.third.service;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: MyThirdServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月30日 下午11:04:33
 * 
 */
public class MyThirdServiceA {

	private CountDownLatch down = new CountDownLatch(1);

	public void testMethodA() {
		try {
			System.out.println(Thread.currentThread().getName() + " 准备 ");
			down.await();
			System.out.println(Thread.currentThread().getName() + " 结束 ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void downMethodA() {
		System.out.println(" 开始 ");
		down.countDown();
	}

}
