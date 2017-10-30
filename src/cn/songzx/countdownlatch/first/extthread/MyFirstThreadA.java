/**   
* @Title: MyFirstThreadA.java 
* @Package cn.songzx.countdownlatch.first.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年10月30日 下午10:49:16 
* @version V1.0   
*/
package cn.songzx.countdownlatch.first.extthread;

import cn.songzx.countdownlatch.first.service.MyFirstServiceA;

/**
 * @ClassName: MyFirstThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年10月30日 下午10:49:16
 * 
 */
public class MyFirstThreadA extends Thread {
	private MyFirstServiceA myService;

	/**
	 * @Date: 2017年10月30日下午10:49:44
	 * @Title: MyFirstThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param myService
	 */
	public MyFirstThreadA(MyFirstServiceA myService) {
		super();
		this.myService = myService;
	}

	/**
	 * @Date: 2017年10月30日下午10:49:56
	 * @Title: run
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return 返回值类型
	 */
	@Override
	public void run() {
		myService.testMethodA();
	}

}
