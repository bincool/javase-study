/**
* @FileName: TestBase.java
* @Package: xyz.wchy.common.abst
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: TestBase.java: junit���Խӿ���.
* @Author wchy����������(891946049).
* @Date 2018��4��18�� ����5:22:50.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.common.abst;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
* @ClassName: TestBase.java
* 
* @Description: 
* <p>
* junit���Խӿ���.
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
* @Date: 2018��4��18�� ����5:22:50.
* 
*/
public abstract class TestBase 
{
	
	/**
	 * ��־����.
	 */
	protected static final Logger LOGGER = Logger.getLogger(TestBase.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		LOGGER.info("Begin to run setUp...");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception 
	{
		LOGGER.info("Begin to run tearDown...");
	}

	@Test
	public abstract void test() throws Exception;

}
