package com;

public class Test {
	public static void main(String[] args) {
		Potato p = new Potato();
		Tomato t = new Tomato();
		Chiken c = new Chiken();
		
		System.out.println(p.s);
		System.out.println(t.s);
		System.out.println(c.s);
		
		p.tastePotato();
		t.tasteTomato();
		c.tasteChiken();
		t.tastePotato();
		c.tastePotato();
		c.tasteTomato();
		
	}
}
