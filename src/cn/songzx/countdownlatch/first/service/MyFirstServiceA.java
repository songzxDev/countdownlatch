/**   
* @Title: MyFirstServiceA.java 
* @Package cn.songzx.countdownlatch.first.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月30日 下午10:44:17 
* @version V1.0   
*/
package cn.songzx.countdownlatch.first.service;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: MyFirstServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月30日 下午10:44:17
 * 
 */
public class MyFirstServiceA {

	/**
	 * new CountDownLatch(1)的作用是创建一个计数的CountDownLatch类的对象，当线程执行down.await()代码
	 * 时呈等待状态，程序不向下继续运行。程序执行down.countDown()代码时计数由1变成0，以前呈等待状态的线程 继续向下执行。
	 */
	private CountDownLatch down = new CountDownLatch(1);

	public void testMethodA() {
		try {
			System.out.println("A");
			down.await();
			System.out.println("B");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void downMethodA() {
		System.out.println("X");
		down.countDown();
	}

}
