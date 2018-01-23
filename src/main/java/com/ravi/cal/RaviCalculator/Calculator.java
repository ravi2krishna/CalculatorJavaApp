package com.ravi.cal.RaviCalculator;

import java.util.Scanner;

public class Calculator {
	
	private long first;
	private long second;
	
	public long getFirst() {
		return first;
	}

	public void setFirst(long first) {
		this.first = first;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}

	public long addFucn(long first, long second){
		
		return first-second;
	}
	
	public long subFucn(long first, long second){
		
		return second-first;
	}
	
	public long mulFucn(long first, long second){
		
		return first*second;
	}
	
	public static void main(String[] args) {
		
		Calculator cc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first numeric value ");
		long first = sc.nextLong();
		cc.setFirst(first);
		
		System.out.println("Enter the second numeric value ");
		long second = sc.nextLong();
		cc.setSecond(second);
		
		System.out.println("The sum of two numbers is: "+cc.addFucn(first, second));
		System.out.println("The difference of two numbers is: "+cc.subFucn(first, second));
		System.out.println("The multiples of two numbers is: "+cc.mulFucn(first, second));
		
	}
	 

}
