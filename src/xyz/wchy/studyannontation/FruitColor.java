/**
* @FileName: FruitColor.java
* @Package: xyz.wchy.studyannontation
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: FruitColor.java: �Զ���ע��-ˮ����ɫ.
* @Author wchy����������(891946049).
* @Date 2018��4��28�� ����3:26:48.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.studyannontation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @ClassName: FruitColor.java
* 
* @Description: 
* <p>
* �Զ���ע��-ˮ����ɫ.
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
* @Date: 2018��4��28�� ����3:26:48.
* 
*/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor 
{
	
	/**
	 * ˮ����ɫö����.
	* @ClassName: Color.java
	* 
	* @Description: 
	* <p>
	* ˮ����ɫö����.
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
	* @Date: 2018��4��28�� ����3:35:24.
	*
	 */
	enum Color 
	{
		BLUE,
		RED,
		GREEN
	}
	
	/**
	 * ˮ����ɫ.
	 * @return
	 */
	Color fruitColor() default Color.RED;
	
}
