/**   
* @Title: MyForthRunA.java 
* @Package cn.songzx.countdownlatch.forth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月30日 下午11:26:47 
* @version V1.0   
*/
package cn.songzx.countdownlatch.forth.test;

import java.util.concurrent.CountDownLatch;

import cn.songzx.countdownlatch.forth.extthread.MyForthThreadA;

/**
 * @ClassName: MyForthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月30日 下午11:26:47
 * 
 */
public class MyForthRunA {

	/**
	 * @Date: 2017年10月30日下午11:26:47
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			CountDownLatch comingTag = new CountDownLatch(10);
			CountDownLatch waitTag = new CountDownLatch(1);
			CountDownLatch waitRunTag = new CountDownLatch(10);
			CountDownLatch beginTag = new CountDownLatch(1);
			CountDownLatch endTag = new CountDownLatch(10);

			MyForthThreadA[] threadArray = new MyForthThreadA[10];
			for (int i = 0; i < threadArray.length; i++) {
				threadArray[i] = new MyForthThreadA(comingTag, waitTag, waitRunTag, beginTag, endTag);
				threadArray[i].start();
			}
			System.out.println("裁判员在等待选手的到来！");
			comingTag.await();
			System.out.println("裁判员看到所有选手都来了，各就各位前“巡视”用时5秒");
			Thread.sleep(5000L);
			waitTag.countDown();
			System.out.println("各就各位！");
			waitTag.await();
			Thread.sleep(2000L);
			System.out.println("发令枪响起！");
			beginTag.countDown();
			endTag.await();
			System.out.println("所有运动员到达终点，统计比赛名次！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
