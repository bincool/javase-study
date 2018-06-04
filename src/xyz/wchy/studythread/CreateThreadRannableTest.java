/**
* @FileName: CreateThreadRannableTest.java
* @Package: xyz.wchy.studythread
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: CreateThreadRannableTest.java: һ�仰�����ļ�������.
* @Author wchy����������(891946049).
* @Date 2018��4��18�� ����4:59:50.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.studythread;

import xyz.wchy.common.abst.TestBase;

/**
* @ClassName: CreateThreadRannableTest.java
* 
* @Description: 
* <p>
* һ�仰��������������.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��4��18�� ����4:59:50.
* 
*/
public class CreateThreadRannableTest extends TestBase 
{
	
	/**
	 * �����̶߳���.
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
