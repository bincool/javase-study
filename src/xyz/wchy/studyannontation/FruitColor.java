/**
* @FileName: FruitColor.java
* @Package: xyz.wchy.studyannontation
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: FruitColor.java: 自定义注解-水果颜色.
* @Author wchy，技术交流(891946049).
* @Date 2018年4月28日 下午3:26:48.
* @Content: 新增.
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
* 自定义注解-水果颜色.
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
* @Date: 2018年4月28日 下午3:26:48.
* 
*/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor 
{
	
	/**
	 * 水果颜色枚举类.
	* @ClassName: Color.java
	* 
	* @Description: 
	* <p>
	* 水果颜色枚举类.
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
	* @Date: 2018年4月28日 下午3:35:24.
	*
	 */
	enum Color 
	{
		BLUE,
		RED,
		GREEN
	}
	
	/**
	 * 水果颜色.
	 * @return
	 */
	Color fruitColor() default Color.RED;
	
}
