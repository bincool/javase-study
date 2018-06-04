/**
* @FileName: FruitProvider.java
* @Package: xyz.wchy.studyannontation
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: FruitProvider.java: �Զ���ע��-ˮ����Ӧ��.
* @Author wchy����������(891946049).
* @Date 2018��4��28�� ����3:32:11.
* @Content: ����.
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
* �Զ���ע��-ˮ����Ӧ��.
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
* @Date: 2018��4��28�� ����3:32:11.
* 
*/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider 
{
	
	/**
	 * ��Ӧ�̱��.
	 * @return
	 */
	public int id() default -1;
	
	/**
	 * ��Ӧ����.
	 * @return
	 */
	public String name() default "";
	
	/**
	 * ��Ӧ�̵�ַ.
	 * @return
	 */
	public String address() default "";
	
}
