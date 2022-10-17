package com.ty.singleton_class;

public class SingletonClass {

	private static SingletonClass singletonClassInstance;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (singletonClassInstance == null) {
			return new SingletonClass();
		} else {
			return null;
		}
	}
	
}
