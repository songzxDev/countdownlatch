/**   
* @Title: MyForthServiceA.java 
* @Package cn.songzx.countdownlatch.forth 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月5日 下午9:12:35 
* @version V1.0   
*/
package cn.songzx.countdownlatch.fifth.service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: MyForthServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月5日 下午9:12:35
 * 
 */
public class MyFifthServiceA {
	public CountDownLatch count = new CountDownLatch(1);

	public void testMethodA() {
		try {
			System.out.println(Thread.currentThread().getName() + " 准备 " + System.currentTimeMillis());
			/*
			 * 方法await(long timeout, TimeUnit
			 * unit)的作用是使线程在指定的最大时间单位内进入WAITING状态，
			 * 如果超过这个时间则自动唤醒，程序继续向下运行。参数timeout是等待的时间，而unit参数是时间的单位。
			 */
			count.await(3, TimeUnit.SECONDS);
			System.out.println(Thread.currentThread().getName() + " 结束 " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
