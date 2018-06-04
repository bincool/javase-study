/**
* @FileName: FruitName.java
* @Package: xyz.wchy.studyannontation
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: FruitName.java: 自定义注解-水果名.
* @Author wchy，技术交流(891946049).
* @Date 2018年4月28日 下午3:21:36.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.studyannontation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @ClassName: FruitName.java
* 
* @Description: 
* <p>
* 自定义注解-水果名.
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
* @Date: 2018年4月28日 下午3:21:36.
* 
*/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName 
{
	
	/**
	 * 水果名.
	 * @return
	 */
	String value() default "苹果";
	
}
