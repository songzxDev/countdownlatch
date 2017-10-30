/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.countdownlatch.second.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月30日 下午10:56:48 
* @version V1.0   
*/
package cn.songzx.countdownlatch.second.test;

import java.util.concurrent.CountDownLatch;

import cn.songzx.countdownlatch.second.extthread.MySecondThreadA;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月30日 下午10:56:48
 * 
 */
public class MySecondRunA {

	public static void main(String[] args) {
		try {
			CountDownLatch maxRuner = new CountDownLatch(10);

			MySecondThreadA[] threadArray = new MySecondThreadA[Integer.parseInt("" + maxRuner.getCount())];
			for (int i = 0; i < threadArray.length; i++) {
				threadArray[i] = new MySecondThreadA(maxRuner);
				threadArray[i].setName(" 线程 " + (i + 1));
				threadArray[i].start();
			}
			maxRuner.await();
			System.out.println("都回来了！");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
