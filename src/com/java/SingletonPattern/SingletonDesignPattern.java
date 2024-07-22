package com.java.SingletonPattern;

import java.awt.desktop.ScreenSleepEvent;

public class SingletonDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Singleton.getInstance().doSingleton();
		/*
		 * Singleton obj = new Singleton(); Singleton obj2 = new Singleton();
		 */
		
		/*
		 * Singleton Obj1 = Singleton.getInstance(); Singleton Obj2 =
		 * Singleton.getInstance();
		 */
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton Obj1 =  Singleton.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton Obj2 =  Singleton.getInstance();
			}
		});

		t1.start();
		t2.start();
	}

}


class Singleton {
	public static Singleton instance;

	public static synchronized Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
			
		}
		return instance;
	}
	
	public static void doSingleton() {
		System.out.println("Do Singleton.");
	}

	private Singleton() {
		System.out.println("Singleton Instantiated.");
	}
	
}