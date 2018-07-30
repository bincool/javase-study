/**
* @FileName: Employee.java
* @Package: io.github.bincool.study.jdkbasis.bean
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: Employee.java: Comparable�ӿ�ѧϰ.
* @Author wchy����������(891946049).
* @Date 2018��7��30�� ����3:26:23.
* @Content: ����.
* @Version: V1.0.
*/
package io.github.bincool.study.jdkbasis.bean;

/**
* @ClassName: Employee.java
* 
* @Description: 
* <p>
* Comparable�ӿ�ѧϰ.
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
* @Date: 2018��7��30�� ����3:26:23.
* 
*/
public class Employee implements Comparable<Employee> 
{

	/**
	 * Ա��ID.
	 */
	private int id;
	
	/**
	 * Ա������.
	 */
	private String name;
	
	/**
	 * Ա������.
	 */
	private int age;
	
	/**
	 * ���캯��.
	 * @param id
	 * 		Ա��ID.
	 * @param name
	 * 		Ա������.
	 * @param age
	 * 		����.
	 */
	public Employee(int id, String name, int age) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * ��ȡid.
	 * @return
	 *     id.
	 */
	public int getId() 
	{
		return id;
	}

	/**
	 * ��ȡname.
	 * @return
	 *     name.
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * ��ȡage.
	 * @return
	 *     age.
	 */
	public int getAge() 
	{
		return age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Employee o) 
	{
		if (this.age > o.age) 
		{
			return -1;
		} 
		else if (this.age < o.age) 
		{
			return 1;
		} 
		else 
		{
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("Employee [id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", age=");
		sb.append(age);
		sb.append("]");
		return sb.toString();
	}
	
}
