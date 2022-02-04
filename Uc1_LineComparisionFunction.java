package com.linecomparisionfunction.java;

import java.util.Scanner;

public class Uc1_LineComparisionFunction {
	//static variables
	static double x1,x2,y1,y2;
	static int distance;
	static Scanner sc = new Scanner(System.in);

	//computation for first point
	public static void point1() {
		System.out.println("enter x1 & y1 values of first point");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
	}
	
	//computation for second point
	public static void point2() {
		System.out.println("enter x2 & y2 values of second point");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
	}
	
	//calculating distance for point1 & point2
	public static void distanceBetweenLines() {
		distance = (int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Distance between two points = "+distance);
	}

	public static void main(String[] args) {
		point1();
		point2();
		distanceBetweenLines();
	}

}
