/**
* @FileName: EmployeeTest.java
* @Package: xyz.wchy.studyintf
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: EmployeeTest.java: 员工测试类.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 下午3:53:44.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.studyintf;

import java.util.Arrays;

/**
* @ClassName: EmployeeTest.java
* 
* @Description: 
* <p>
* 员工测试类.
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
* @Date: 2018年1月29日 下午3:53:44.
* 
*/
public class EmployeeTest 
{
	
	/**
	 * 入口方法.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Employee[] employees = new Employee[5];
		Employee employee1 = new Employee(5, "One", 18);
		Employee employee2 = new Employee(2, "Two", 19);
		Employee employee3 = new Employee(4, "Three", 19);
		Employee employee4 = new Employee(3, "Four", 18);
		Employee employee5 = new Employee(1, "Five", 20);
		
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
		employees[4] = employee5;
		
		System.out.println("排序前：");
		for (Employee employee : employees) 
		{
			System.out.println(employee);
		}
		
		// 根据年龄从大到小排序.
		Arrays.sort(employees);
		
		System.out.println("按年龄排序后：");
		for (Employee employee : employees) 
		{
			System.out.println(employee);
		}
		
		// 根据id从小到大排序.
		Arrays.sort(employees, new IdComparator());
		
		System.out.println("按Id排序后：");
		for (Employee employee : employees) 
		{
			System.out.println(employee);
		}
	}
	
}
