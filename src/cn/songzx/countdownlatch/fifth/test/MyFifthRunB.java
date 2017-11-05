/**   
* @Title: MyFifthRunB.java 
* @Package cn.songzx.countdownlatch.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月5日 下午9:24:02 
* @version V1.0   
*/
package cn.songzx.countdownlatch.fifth.test;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: MyFifthRunB
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月5日 下午9:24:02
 * 
 */
public class MyFifthRunB {

	public static void main(String[] args) {
		CountDownLatch count = new CountDownLatch(3);
		System.out.println("main getCount1=" + count.getCount());
		count.countDown();
		System.out.println("main getCount2=" + count.getCount());
		count.countDown();
		System.out.println("main getCount3=" + count.getCount());
		count.countDown();
		System.out.println("main getCount4=" + count.getCount());
		count.countDown();
		System.out.println("main getCount5=" + count.getCount());
		count.countDown();
		System.out.println("main getCount6=" + count.getCount());
		count.countDown();
	}

}
