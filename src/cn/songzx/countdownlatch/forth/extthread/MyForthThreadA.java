/**   
* @Title: MyForthThreadA.java 
* @Package cn.songzx.countdownlatch.forth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月30日 下午11:17:06 
* @version V1.0   
*/
package cn.songzx.countdownlatch.forth.extthread;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: MyForthThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月30日 下午11:17:06
 * 
 */
public class MyForthThreadA extends Thread {

	private CountDownLatch comingTag;// 裁判员等待所有运动员到来
	private CountDownLatch waitTag;// 等待裁判员打响发令枪
	private CountDownLatch waitRunTag;// 等待起跑
	private CountDownLatch beginTag;// 起跑
	private CountDownLatch endTag;// 所有运动员到达终点

	/**
	 * @Date: 2017年10月30日下午11:20:28
	 * @Title: MyForthThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param comingTag
	 * @param waitTag
	 * @param waitRunTag
	 * @param beginTag
	 * @param endTag
	 */
	public MyForthThreadA(CountDownLatch comingTag, CountDownLatch waitTag, CountDownLatch waitRunTag, CountDownLatch beginTag, CountDownLatch endTag) {
		super();
		this.comingTag = comingTag;
		this.waitTag = waitTag;
		this.waitRunTag = waitRunTag;
		this.beginTag = beginTag;
		this.endTag = endTag;
	}

	public void run() {
		try {
			System.out.println("运动员使用不同种类的交通工具不同速度到达起跑点，正向这儿走！");
			Thread.sleep((int) (Math.random() * 10000));
			System.out.println(Thread.currentThread().getName() + "到起跑点了！");
			comingTag.countDown();
			System.out.println("等待裁判员打响发令枪！");
			waitTag.await();
			System.out.println("各就各位，准备起跑姿势！");
			Thread.sleep((int) (Math.random() * 10000));
			waitRunTag.countDown();
			beginTag.await();
			System.out.println(Thread.currentThread().getName() + " 运动员起跑并且跑赛过程用时不确定 ");
			Thread.sleep((int) (Math.random() * 10000));
			endTag.countDown();
			System.out.println(Thread.currentThread().getName() + "运动员到达终点");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
