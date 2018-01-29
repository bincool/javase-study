/**
* @FileName: EmployeeTest.java
* @Package: xyz.wchy.studyintf
* @Copyright: 2018 www.wchy.xyz Inc. All Rights Reserved.
* @Description: EmployeeTest.java: Ա��������.
* @Author wchy����������(891946049).
* @Date 2018��1��29�� ����3:53:44.
* @Content: ����.
* @Version: V1.0.
*/
package xyz.wchy.studyintf;

import java.util.Arrays;

/**
* @ClassName: EmployeeTest.java
* 
* @Description: 
* <p>
* Ա��������.
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
* @Date: 2018��1��29�� ����3:53:44.
* 
*/
public class EmployeeTest 
{
	
	/**
	 * ��ڷ���.
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
		
		System.out.println("����ǰ��");
		for (Employee employee : employees) 
		{
			System.out.println(employee);
		}
		
		// ��������Ӵ�С����.
		Arrays.sort(employees);
		
		System.out.println("�����������");
		for (Employee employee : employees) 
		{
			System.out.println(employee);
		}
		
		// ����id��С��������.
		Arrays.sort(employees, new IdComparator());
		
		System.out.println("��Id�����");
		for (Employee employee : employees) 
		{
			System.out.println(employee);
		}
	}
	
}
