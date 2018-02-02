/**
* @FileName: CreateThreadRannable.java
* @Package: xyz.wchy.studythread
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: CreateThreadRannable.java: 通过继承Runnable来创建线程.
* @Author wchy，技术交流(891946049).
* @Date 2018年4月18日 下午4:41:09.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.studythread;

import java.util.Date;

import org.apache.log4j.Logger;

/**
* @ClassName: CreateThreadRannable.java
* 
* @Description: 
* <p>
* 通过继承Runnable来创建线程.
* </p>
* <p>
* 详细描述：重写实现run方法.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年4月18日 下午4:41:09.
* 
*/
public class CreateThreadRannable implements Runnable 
{
	
	private static final Logger LOGGER = Logger.getLogger(CreateThreadRannable.class);
	

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() 
	{
		LOGGER.info("线程" + Thread.currentThread().getName() + ":开始运行" + new Date());
		
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			LOGGER.error("线程异常!");
		}
		
		LOGGER.info("线程" + Thread.currentThread().getName() + ":运行结束" + new Date());
	}

}
