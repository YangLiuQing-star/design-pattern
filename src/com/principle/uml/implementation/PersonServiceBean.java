package com.principle.uml.implementation;

/**
 * 实现关系属于依赖关系
 */
public class PersonServiceBean implements PersonService{

	@Override
	public void delete(Integer id) {
		System.out.println("delete..");
	}

}
