/**
* @FileName: CreateThreadRannableTest.java
* @Package: xyz.wchy.studythread
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: CreateThreadRannableTest.java: 一句话描述文件的作用.
* @Author wchy，技术交流(891946049).
* @Date 2018年4月18日 下午4:59:50.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.studythread;

import xyz.wchy.common.abst.TestBase;

/**
* @ClassName: CreateThreadRannableTest.java
* 
* @Description: 
* <p>
* 一句话对这个类进行描述.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年4月18日 下午4:59:50.
* 
*/
public class CreateThreadRannableTest extends TestBase 
{
	
	/**
	 * 创建线程对象.
	 */
	private CreateThreadRannable createThreadRannable;

	/* (non-Javadoc)
	 * @see xyz.wchy.common.intf.TestIntf#setUp()
	 */
	@Override
	public void setUp() throws Exception 
	{
		LOGGER.info("Begin to run setUp...");
		createThreadRannable = new CreateThreadRannable();
	}

	/* (non-Javadoc)
	 * @see xyz.wchy.common.intf.TestIntf#test()
	 */
	@Override
	public void test() throws Exception 
	{
		LOGGER.info("Begin to run test...");
		Thread thread1 = new Thread(createThreadRannable, "thread1");
		Thread thread2 = new Thread(createThreadRannable, "thread2");
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
	}

}
