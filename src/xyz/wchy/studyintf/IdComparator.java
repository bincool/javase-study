/**
* @FileName: IdComparator.java
* @Package: xyz.wchy.studyintf
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: IdComparator.java: Id�Ƚ���.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����4:04:52.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.studyintf;

import java.util.Comparator;

/**
* @ClassName: IdComparator.java
* 
* @Description: 
* <p>
* Id�Ƚ���.
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
* @Date: 2018��1��29�� ����4:04:52.
* 
*/
public class IdComparator implements Comparator<Employee> 
{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Employee o1, Employee o2) 
	{
		if (o1.getId() > o2.getId()) 
		{
			return 1;
		} 
		else if (o1.getId() < o2.getId()) 
		{
			return -1;
		} 
		else 
		{
			return 0;
		}
	}

}
