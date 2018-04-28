/**
* @FileName: Apple.java
* @Package: xyz.wchy.studyannontation
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: Apple.java: 自定义注解-苹果.
* @Author wchy，技术交流(891946049).
* @Date 2018年4月28日 下午3:44:21.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.studyannontation;

import java.io.Serializable;

import com.google.gson.Gson;

import xyz.wchy.studyannontation.FruitColor.Color;

/**
* @ClassName: Apple.java
* 
* @Description: 
* <p>
* 自定义注解-苹果.
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
* @Date: 2018年4月28日 下午3:44:21.
* 
*/
public class Apple implements Serializable 
{
	
	/**
	 * 序列号.
	 */
	private static final long serialVersionUID = 1L;

	@FruitName("Apple")
	private String appleName;
	
	@FruitColor(fruitColor = Color.GREEN)
	private String appleColor;
	
	@FruitProvider(id = 1, name = "青苹果", address = "南京")
	private String appleProvider;

	/**
	 * 获取appleName.
	 * @return
	 *     appleName.
	 */
	public String getAppleName() 
	{
		return appleName;
	}

	/**
	 * 设置appleName.
	 * @param
	 *     appleName.
	 */
	public void setAppleName(String appleName) 
	{
		this.appleName = appleName;
	}

	/**
	 * 获取appleColor.
	 * @return
	 *     appleColor.
	 */
	public String getAppleColor() 
	{
		return appleColor;
	}

	/**
	 * 设置appleColor.
	 * @param
	 *     appleColor.
	 */
	public void setAppleColor(String appleColor) 
	{
		this.appleColor = appleColor;
	}

	/**
	 * 获取appleProvider.
	 * @return
	 *     appleProvider.
	 */
	public String getAppleProvider() 
	{
		return appleProvider;
	}

	/**
	 * 设置appleProvider.
	 * @param
	 *     appleProvider.
	 */
	public void setAppleProvider(String appleProvider) 
	{
		this.appleProvider = appleProvider;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return new Gson().toJson(this);
	}
	
}
