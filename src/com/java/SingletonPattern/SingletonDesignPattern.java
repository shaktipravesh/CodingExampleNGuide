package com.java.SingletonPattern;

public class SingletonDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton.getInstance().doSingleton();
	}

}


class Singleton {
	public static Singleton instance;

	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void doSingleton() {
		System.out.println("Do Singleton");
	}

	public Singleton() {
		System.out.println("Singleton Instantiated.");
	}
	
}