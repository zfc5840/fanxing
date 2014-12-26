package com.demo01;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
//���ͷ����ȡ�����е�class
public class GenericDAO<T> {
	//���ر�ʾ�� Class ����ʾ��ʵ�壨�ࡢ�ӿڡ��������ͻ� void����ֱ�ӳ���� Type
	private Class<T> entityClass;
	private Class<T> bb;
	@SuppressWarnings("unchecked")
	protected GenericDAO() {
		bb=(Class<T>) getClass();
		System.out.println("cccc="+bb.getSimpleName());
	  Type type = getClass().getGenericSuperclass();
	  //getActualTypeArguments()���ر�ʾ������ʵ�����Ͳ����� Type ��������顣
	  //[0]������������е�һ���ˡ���
	  Type trueType = ((ParameterizedType) type).getActualTypeArguments()[0];
	  entityClass = (Class<T>) trueType;
	  System.out.println("ddd="+entityClass.getSimpleName());
	 }
	
	
	
}
