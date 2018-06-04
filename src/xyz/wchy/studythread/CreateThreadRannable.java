/**
* @FileName: CreateThreadRannable.java
* @Package: xyz.wchy.studythread
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: CreateThreadRannable.java: ͨ���̳�Runnable�������߳�.
* @Author wchy����������(891946049).
* @Date 2018��4��18�� ����4:41:09.
* @Content: ����.
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
* ͨ���̳�Runnable�������߳�.
* </p>
* <p>
* ��ϸ��������дʵ��run����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��4��18�� ����4:41:09.
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
		LOGGER.info("�߳�" + Thread.currentThread().getName() + ":��ʼ����" + new Date());
		
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			LOGGER.error("�߳��쳣!");
		}
		
		LOGGER.info("�߳�" + Thread.currentThread().getName() + ":���н���" + new Date());
	}

}
