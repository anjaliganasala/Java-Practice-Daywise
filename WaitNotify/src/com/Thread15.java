package com;

public class Thread15 implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
		System.out.println("T15");
	}
	}
}
