/**
* @FileName: FruitInfoUtil.java
* @Package: xyz.wchy.studyannontation
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: FruitInfoUtil.java: �Զ���ע�⴦����.
* @Author wchy����������(891946049).
* @Date 2018��4��28�� ����4:38:17.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.studyannontation;

import java.lang.reflect.Field;

/**
* @ClassName: FruitInfoUtil.java
* 
* @Description: 
* <p>
* �Զ���ע�⴦����.
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
* @Date: 2018��4��28�� ����4:38:17.
* 
*/
public class FruitInfoUtil 
{

	public static void getFruitInfo(Class<?> clszz) 
	{
		
		String strFruitName = "ˮ�����ƣ�";
		
		String strFruitColor = "ˮ����ɫ��";
		
		String strFruitProvider = "��Ӧ����Ϣ��";
		
		// ��ȡ����������.
		Field[] fields = clszz.getDeclaredFields();
		
		for (Field field : fields) 
		{
			// �ж��Ƿ����ĳ��ע��.
			if (field.isAnnotationPresent(FruitName.class)) 
			{
				// ��ȡע��.
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
