package com.ty.singleton_class;

public class TestSingletonClass {
	public static void main(String[] args) {
		SingletonClass singletonClassInstance = SingletonClass.getInstance();
		
		System.out.println(singletonClassInstance);
		System.out.println(singletonClassInstance);
	}

}
