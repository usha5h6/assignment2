package com.task2.maven.mavenproject;
import java.util.*;
public class Gift {
	public int weight,price;
	public static ArrayList<Integer> getweight = new ArrayList<Integer>();
	public static ArrayList<Integer> cost = new ArrayList<Integer>();
	public static ArrayList<String> items = new ArrayList<String>();
	public void itemsDisplay(){
		System.out.println("The Items list in the gift are : ");
		for(int i=0;i<items.size();i++){
			System.out.println(items.get(i));
		}
	}
	public void getWeights(){
		int totalwgt = 0;
		for(int i=0;i<getweight.size();i++){
			totalwgt += getweight.get(i);
		}
		System.out.println("Total Weight : "+totalwgt);
	}
	public void getCosts(){
		int totalcost = 0;
		for(int i=0;i<cost.size();i++){
			totalcost += cost.get(i);
		}
		System.out.println("Total Cost : "+totalcost);
	}

}
