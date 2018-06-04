/**
* @FileName: FruitProvider.java
* @Package: xyz.wchy.studyannontation
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: FruitProvider.java: 自定义注解-水果供应者.
* @Author wchy，技术交流(891946049).
* @Date 2018年4月28日 下午3:32:11.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.studyannontation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @ClassName: FruitProvider.java
* 
* @Description: 
* <p>
* 自定义注解-水果供应者.
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
* @Date: 2018年4月28日 下午3:32:11.
* 
*/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider 
{
	
	/**
	 * 供应商编号.
	 * @return
	 */
	public int id() default -1;
	
	/**
	 * 供应商名.
	 * @return
	 */
	public String name() default "";
	
	/**
	 * 供应商地址.
	 * @return
	 */
	public String address() default "";
	
}
