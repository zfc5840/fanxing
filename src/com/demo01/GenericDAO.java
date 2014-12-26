package com.demo01;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
//泛型反射获取子类中的class
public class GenericDAO<T> {
	//返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type
	private Class<T> entityClass;
	private Class<T> bb;
	@SuppressWarnings("unchecked")
	protected GenericDAO() {
		bb=(Class<T>) getClass();
		System.out.println("cccc="+bb.getSimpleName());
	  Type type = getClass().getGenericSuperclass();
	  //getActualTypeArguments()返回表示此类型实际类型参数的 Type 对象的数组。
	  //[0]就是这个数组中第一个了。。
	  Type trueType = ((ParameterizedType) type).getActualTypeArguments()[0];
	  entityClass = (Class<T>) trueType;
	  System.out.println("ddd="+entityClass.getSimpleName());
	 }
	
	
	
}
