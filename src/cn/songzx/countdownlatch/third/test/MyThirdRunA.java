/**   
* @Title: MyThirdRunA.java 
* @Package cn.songzx.countdownlatch.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月30日 下午11:08:35 
* @version V1.0   
*/
package cn.songzx.countdownlatch.third.test;

import cn.songzx.countdownlatch.third.extthread.MyThirdThreadA;
import cn.songzx.countdownlatch.third.service.MyThirdServiceA;

/**
 * @ClassName: MyThirdRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月30日 下午11:08:35
 * 
 */
public class MyThirdRunA {

	/**
	 * @Date: 2017年10月30日下午11:08:35
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			/*
			 * 此实验虽然运行成功，但并不能保证在main主线程中执行了service.downMethodA();时，所有的工作线程都呈现
			 * wait状态，因为某些线程有可能准备的时间较长，可能耗时超过2s，这时如果在第2s是调用service.downMethodA()
			 * ; 方法就达不到"唤醒所有线程"继续向下运行的目的了，也就是说裁判员没有等全部运动员到齐时，就开发令枪开始比赛了，
			 * 这时不对的，所以代码需要优化，来达到相对完善的比赛流程。
			 */
			MyThirdServiceA service = new MyThirdServiceA();
			MyThirdThreadA[] threadArray = new MyThirdThreadA[10];
			for (int i = 0; i < threadArray.length; i++) {
				threadArray[i] = new MyThirdThreadA(service);
				threadArray[i].setName(" 线程 " + (i + 1));
				threadArray[i].start();
			}
			Thread.sleep(5000L);
			service.downMethodA();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
