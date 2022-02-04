package com.linecomparisionfunction.java;

import java.util.Scanner;

public class Uc3_LineComparisionUsingComapreToFunction {

	static double x1,x2,y1,y2,x3,x4,y3,y4;
	static int distance1,distance2;
	static Scanner sc = new Scanner(System.in);

	//Computation for point1 & point2
	public static void point1() {
		System.out.println("enter x1 & y1 values of first point");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
	}
	public static void point2() {
		System.out.println("enter x2 & y2 values of second point");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
	}
	public static void distanceBetweenPoint1Point2() {
		distance1 = (int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Distance between two points = "+distance1);
	}

	//Computation for point3 & point4
	public static void point3() {
		System.out.println("enter x3 & y3 values of third point");
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
	}
	public static void point4() {
		System.out.println("enter x2 & y2 values of second point");
		x4 = sc.nextDouble();
		y4 = sc.nextDouble();
	}
	public static void distanceBetweenPoint3Point4() {
		distance2 = (int)Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("Distance between two points = "+distance2);
	}

	//checking for line equality using comapreTo() method
	public static void CompareLinesUsingCompareToMethod() {
		String str1 = Double.toString(distance1);
		String str2 = Double.toString(distance2);
		int check = str1.compareTo(str2);
		if(check == 0)
			System.out.println("Both lines are equal");
		else
			System.out.println("Not both lines are equal");
	}

	public static void main(String[] args) {
		point1();
		point2();
		distanceBetweenPoint1Point2();
		point3();
		point4();
		distanceBetweenPoint3Point4();
		CompareLinesUsingCompareToMethod();
	}
}
