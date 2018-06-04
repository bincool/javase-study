/**
* @FileName: Apple.java
* @Package: xyz.wchy.studyannontation
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: Apple.java: �Զ���ע��-ƻ��.
* @Author wchy����������(891946049).
* @Date 2018��4��28�� ����3:44:21.
* @Content: ����.
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
* �Զ���ע��-ƻ��.
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
* @Date: 2018��4��28�� ����3:44:21.
* 
*/
public class Apple implements Serializable 
{
	
	/**
	 * ���к�.
	 */
	private static final long serialVersionUID = 1L;

	@FruitName("Apple")
	private String appleName;
	
	@FruitColor(fruitColor = Color.GREEN)
	private String appleColor;
	
	@FruitProvider(id = 1, name = "��ƻ��", address = "�Ͼ�")
	private String appleProvider;

	/**
	 * ��ȡappleName.
	 * @return
	 *     appleName.
	 */
	public String getAppleName() 
	{
		return appleName;
	}

	/**
	 * ����appleName.
	 * @param
	 *     appleName.
	 */
	public void setAppleName(String appleName) 
	{
		this.appleName = appleName;
	}

	/**
	 * ��ȡappleColor.
	 * @return
	 *     appleColor.
	 */
	public String getAppleColor() 
	{
		return appleColor;
	}

	/**
	 * ����appleColor.
	 * @param
	 *     appleColor.
	 */
	public void setAppleColor(String appleColor) 
	{
		this.appleColor = appleColor;
	}

	/**
	 * ��ȡappleProvider.
	 * @return
	 *     appleProvider.
	 */
	public String getAppleProvider() 
	{
		return appleProvider;
	}

	/**
	 * ����appleProvider.
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
