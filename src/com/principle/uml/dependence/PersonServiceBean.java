package com.principle.uml.dependence;

/**
 * 依赖关系
 * 类中使用到对方
 * 类中的成员遍历
 * 方法的返回值
 * 方法接收的参数类型
 * 方法中使用到
 */
public class PersonServiceBean {
	private PersonDao personDao;

	public void save(Person person) {
	}

	public IDCard getIDCard(Integer personId) {
		return null;
	}

	public void modify() {
		Department department = new Department();
	}

}
