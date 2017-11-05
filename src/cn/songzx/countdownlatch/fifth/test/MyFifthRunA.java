/**   
* @Title: MyFifthRunA.java 
* @Package cn.songzx.countdownlatch.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月5日 下午9:18:31 
* @version V1.0   
*/
package cn.songzx.countdownlatch.fifth.test;

import cn.songzx.countdownlatch.fifth.extthread.MyFifthThreadA;
import cn.songzx.countdownlatch.fifth.service.MyFifthServiceA;

/**
 * @ClassName: MyFifthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月5日 下午9:18:31
 * 
 */
public class MyFifthRunA {

	/**
	 * @Date: 2017年11月5日下午9:18:31
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		MyFifthServiceA service = new MyFifthServiceA();
		MyFifthThreadA[] threadArray = new MyFifthThreadA[3];
		for (MyFifthThreadA myFifthThreadA : threadArray) {
			myFifthThreadA = new MyFifthThreadA(service);
			myFifthThreadA.start();
		}
	}

}
