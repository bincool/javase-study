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
* 详细描述：Comparable可以认为是一个内部比较器，实现了Comparable接口的类，可以自己和自己比较，
* 至于具体要和另一实现了Comparable的类比较，那么则需要依赖compareTo方法，compareTo也被称为自然比较方法.
* compareTo的返回值有三种情况：正整数、负整数、0.如果是从小到大排序，则比较者大于被比较者赋值为正整数，
* 比较者小于被比较者为负整数.如果是从大到小排序，则相反.
* Comparator可以认为是一个外部比较器，实现了Comparator接口的类，则需要依赖于compare方法.返回值同上.
* </p>
* <p>
* Comparator应用场景：1、一个对象不支持和自己比较(没有实现Comparable接口)，不想改变原有代码(或由于种种原因不能修改)，
* 但又想对两个对象比较.2、一个对象实现了Comparable接口，但是新业务场景用不上(或不需要用已有的比较方式).
* 总结一下，两种比较器Comparable和Comparator，后者相比前者有如下优点：
* 1、如果实现类没有实现Comparable接口，又想对两个类进行比较（或者实现类实现了Comparable接口，但是对compareTo方法内的比较算法不满意），那么可以实现Comparator接口，自定义一个比较器，写比较算法
* 2、实现Comparable接口的方式比实现Comparator接口的耦合性 要强一些，如果要修改比较算法，要修改Comparable接口的实现类，而实现Comparator的类是在外部进行比较的，不需要对实现类有任何修 改。
* 实际上实现Comparator接口的方式后面会写到就是一种典型的策略模式。
* 一般实现了Comparator接口的类命名一般为：类名+属性名+Comparator.
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
