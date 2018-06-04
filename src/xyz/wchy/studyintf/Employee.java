/**
* @FileName: Employee.java
* @Package: xyz.wchy.studyintf
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: Employee.java: JavaSE基础-接口和内部类.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月29日 下午3:23:38.
* @Content: 新增.
* @Version: V1.0.
*/
package xyz.wchy.studyintf;

/**
* @ClassName: Employee.java
* 
* @Description: 
* <p>
* Comparable接口学习.
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
* @Date: 2018年1月29日 下午3:23:38.
* 
*/
public class Employee implements Comparable<Employee> 
{

	/**
	 * 员工ID.
	 */
	private int id;
	
	/**
	 * 员工姓名.
	 */
	private String name;
	
	/**
	 * 员工年龄.
	 */
	private int age;
	
	/**
	 * 构造函数.
	 * @param id
	 * 		员工ID.
	 * @param name
	 * 		员工姓名.
	 * @param age
	 * 		年龄.
	 */
	public Employee(int id, String name, int age) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * 获取id.
	 * @return
	 *     id.
	 */
	public int getId() 
	{
		return id;
	}

	/**
	 * 获取name.
	 * @return
	 *     name.
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * 获取age.
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
