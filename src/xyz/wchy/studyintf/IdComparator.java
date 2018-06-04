/**
* @FileName: IdComparator.java
* @Package: xyz.wchy.studyintf
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: IdComparator.java: Id比较器.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 下午4:04:52.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.studyintf;

import java.util.Comparator;

/**
* @ClassName: IdComparator.java
* 
* @Description: 
* <p>
* Id比较器.
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
* @Date: 2018年1月29日 下午4:04:52.
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
