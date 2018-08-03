/**
* @FileName: EmployeeIdComparator.java
* @Package: io.github.bincool.study.jdkbasis.comparator
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EmployeeIdComparator.java: EmployeeId比较器.
* @Author wchy，技术交流(891946049).
* @Date 2018年7月30日 下午3:28:42.
* @Content: 新增.
* @Version: V1.0.
*/
package io.github.bincool.study.jdkbasis.comparator;

import java.util.Comparator;

import io.github.bincool.study.jdkbasis.bean.Employee;

/**
* @ClassName: EmployeeIdComparator.java
* 
* @Description: 
* <p>
* EmployeeId比较器.
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
* @Date: 2018年7月30日 下午3:28:42.
* 
*/
public class EmployeeIdComparator implements Comparator<Employee> 
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
