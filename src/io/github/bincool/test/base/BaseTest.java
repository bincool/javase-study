/**
* @FileName: BaseTest.java
* @Package: io.github.bincool.test.base
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: BaseTest.java: ���Ի���ӿ�.
* @Author wchy����������(891946049).
* @Date 2018��7��30�� ����10:11:58.
* @Content: ����.
* @Version: V1.0.
*/
package io.github.bincool.test.base;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
* @ClassName: BaseTest.java
* 
* @Description: 
* <p>
* ���Ի���ӿ�.
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
* @Date: 2018��7��30�� ����10:11:58.
* 
*/
public abstract class BaseTest 
{
	
	/**
	 * ��־����.
	 */
	protected static final Logger LOGGER = Logger.getLogger(BaseTest.class);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public abstract void setUp() throws Exception;
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public abstract void tearDown() throws Exception;

	@Test
	public abstract void test() throws Exception;
	
}
