/**
* @FileName: FruitInfoUtil.java
* @Package: xyz.wchy.studyannontation
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: FruitInfoUtil.java: 自定义注解处理器.
* @Author wchy，技术交流(891946049).
* @Date 2018年4月28日 下午4:38:17.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.studyannontation;

import java.lang.reflect.Field;

/**
* @ClassName: FruitInfoUtil.java
* 
* @Description: 
* <p>
* 自定义注解处理器.
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
* @Date: 2018年4月28日 下午4:38:17.
* 
*/
public class FruitInfoUtil 
{

	public static void getFruitInfo(Class<?> clszz) 
	{
		
		String strFruitName = "水果名称：";
		
		String strFruitColor = "水果颜色：";
		
		String strFruitProvider = "供应商信息：";
		
		// 获取类属性数组.
		Field[] fields = clszz.getDeclaredFields();
		
		for (Field field : fields) 
		{
			// 判断是否存在某类注解.
			if (field.isAnnotationPresent(FruitName.class)) 
			{
				// 获取注解.
				FruitName fruitName = field.getAnnotation(FruitName.class);
				strFruitName += fruitName.value();
				System.out.println(strFruitName);
			} 
			else if (field.isAnnotationPresent(FruitColor.class)) 
			{
				FruitColor fruitColor = field.getAnnotation(FruitColor.class);
				strFruitColor += fruitColor.fruitColor().toString();
				System.out.println(strFruitColor);
			} 
			else if (field.isAnnotationPresent(FruitProvider.class))
			{
				FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
				strFruitProvider += fruitProvider.id() + fruitProvider.name() + fruitProvider.address();
				System.out.println(strFruitProvider);
			}
		}
		
	}
	
}
