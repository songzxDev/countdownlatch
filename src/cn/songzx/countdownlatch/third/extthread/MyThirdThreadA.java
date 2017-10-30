/**   
* @Title: MyThirdThreadA.java 
* @Package cn.songzx.countdownlatch.third.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月30日 下午11:07:33 
* @version V1.0   
*/
package cn.songzx.countdownlatch.third.extthread;

import cn.songzx.countdownlatch.third.service.MyThirdServiceA;

/**
 * @ClassName: MyThirdThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月30日 下午11:07:33
 * 
 */
public class MyThirdThreadA extends Thread {

	private MyThirdServiceA myService;

	/**
	 * @Date: 2017年10月30日下午11:07:55
	 * @Title: MyThirdThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param myService
	 */
	public MyThirdThreadA(MyThirdServiceA myService) {
		super();
		this.myService = myService;
	}

	public void run() {
		myService.testMethodA();
	}
}
