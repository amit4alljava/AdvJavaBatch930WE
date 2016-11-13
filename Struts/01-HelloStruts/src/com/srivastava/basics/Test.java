package com.srivastava.basics;

public class Test {

	public static void main(String[] args) {
		String x = "10+20-40*90";
		String y[] = x.split("//d+");
		System.out.println("Length "+y.length);
		for(String z : y){
			System.out.println(z);
		}

	}

}
