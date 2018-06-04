/**
* @FileName: FruitName.java
* @Package: xyz.wchy.studyannontation
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: FruitName.java: �Զ���ע��-ˮ����.
* @Author wchy����������(891946049).
* @Date 2018��4��28�� ����3:21:36.
* @Content: ����.
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
* �Զ���ע��-ˮ����.
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
* @Date: 2018��4��28�� ����3:21:36.
* 
*/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName 
{
	
	/**
	 * ˮ����.
	 * @return
	 */
	String value() default "ƻ��";
	
}
