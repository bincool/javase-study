/**
* @FileName: TestBase.java
* @Package: xyz.wchy.common.abst
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: TestBase.java: junit测试接口类.
* @Author wchy，技术交流(891946049).
* @Date 2018年4月18日 下午5:22:50.
* @Content: 新增.
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
* junit测试接口类.
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
* @Date: 2018年4月18日 下午5:22:50.
* 
*/
public abstract class TestBase 
{
	
	/**
	 * 日志对象.
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
