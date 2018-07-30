/**
* @FileName: EmployeeTest.java
* @Package: io.github.bincool.test.study.jdkbasis.comparator
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: EmployeeTest.java: Ա���Ƚ���������.
* @Author wchy����������(891946049).
* @Date 2018��7��30�� ����3:31:58.
* @Content: ����.
* @Version: V1.0.
*/
package io.github.bincool.test.study.jdkbasis.comparator;

import java.util.Arrays;

import io.github.bincool.study.jdkbasis.bean.Employee;
import io.github.bincool.study.jdkbasis.comparator.EmployeeIdComparator;
import io.github.bincool.test.base.BaseTest;

/**
* @ClassName: EmployeeTest.java
* 
* @Description: 
* <p>
* Ա���Ƚ���������.
* </p>
* <p>
* ��ϸ������Comparable������Ϊ��һ���ڲ��Ƚ�����ʵ����Comparable�ӿڵ��࣬�����Լ����Լ��Ƚϣ�
* ���ھ���Ҫ����һʵ����Comparable����Ƚϣ���ô����Ҫ����compareTo������compareToҲ����Ϊ��Ȼ�ȽϷ���.
* compareTo�ķ���ֵ���������������������������0.����Ǵ�С����������Ƚ��ߴ��ڱ��Ƚ��߸�ֵΪ��������
* �Ƚ���С�ڱ��Ƚ���Ϊ������.����ǴӴ�С�������෴.
* Comparator������Ϊ��һ���ⲿ�Ƚ�����ʵ����Comparator�ӿڵ��࣬����Ҫ������compare����.����ֵͬ��.
* </p>
* <p>
* ComparatorӦ�ó�����1��һ������֧�ֺ��Լ��Ƚ�(û��ʵ��Comparable�ӿ�)������ı�ԭ�д���(����������ԭ�����޸�)��
* ���������������Ƚ�.2��һ������ʵ����Comparable�ӿڣ�������ҵ�񳡾��ò���(����Ҫ�����еıȽϷ�ʽ).
* �ܽ�һ�£����ֱȽ���Comparable��Comparator���������ǰ���������ŵ㣺
* 1�����ʵ����û��ʵ��Comparable�ӿڣ��������������бȽϣ�����ʵ����ʵ����Comparable�ӿڣ����Ƕ�compareTo�����ڵıȽ��㷨�����⣩����ô����ʵ��Comparator�ӿڣ��Զ���һ���Ƚ�����д�Ƚ��㷨
* 2��ʵ��Comparable�ӿڵķ�ʽ��ʵ��Comparator�ӿڵ������ ҪǿһЩ�����Ҫ�޸ıȽ��㷨��Ҫ�޸�Comparable�ӿڵ�ʵ���࣬��ʵ��Comparator���������ⲿ���бȽϵģ�����Ҫ��ʵ�������κ��� �ġ�
* ʵ����ʵ��Comparator�ӿڵķ�ʽ�����д������һ�ֵ��͵Ĳ���ģʽ��
* һ��ʵ����Comparator�ӿڵ�������һ��Ϊ������+������+Comparator.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��7��30�� ����3:31:58.
* 
*/
public class EmployeeTest extends BaseTest 
{
	
	// Ա��.
	private Employee[] employees;

	/* (non-Javadoc)
	 * @see io.github.bincool.test.base.BaseTest#setUp()
	 */
	@Override
	public void setUp() throws Exception 
	{
		employees = new Employee[5];
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
	}

	/* (non-Javadoc)
	 * @see io.github.bincool.test.base.BaseTest#tearDown()
	 */
	@Override
	public void tearDown() throws Exception 
	{
		employees = null;
	}

	/* (non-Javadoc)
	 * @see io.github.bincool.test.base.BaseTest#test()
	 */
	@Override
	public void test() throws Exception 
	{
		LOGGER.info("����ǰ��");
		for (Employee employee : employees) 
		{
			LOGGER.info(employee);
		}
		
		// ��������Ӵ�С����.
		Arrays.sort(employees);
		
		LOGGER.info("�����������");
		for (Employee employee : employees) 
		{
			LOGGER.info(employee);
		}
		
		// ����id��С��������.
		Arrays.sort(employees, new EmployeeIdComparator());
		
		LOGGER.info("��EmployeeId�����");
		for (Employee employee : employees) 
		{
			LOGGER.info(employee);
		}
	}

}
