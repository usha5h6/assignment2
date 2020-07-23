package com.task2.maven.mavenproject;

import java.util.Comparator;
import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class Chocolates extends Gift{
	static TreeMap<String,Integer> weightmapchocs = new TreeMap<String,Integer>();
	static TreeMap<String,Integer> costmapchocs = new TreeMap<String,Integer>();
	String chocolateName;
	static Scanner sc = new Scanner(System.in);
	
	public Chocolates() {
		chocolateName =  "";
		weight = 0;
		price=0;
		
	}
	public Chocolates(String chocolateName,int weight,int price) {
		super();
		this.chocolateName = chocolateName;
		this.weight = weight;
		this.price = price;
		cost.add(price);
		items.add(chocolateName);
		getweight.add(weight);
		if(!weightmapchocs.containsKey(chocolateName)){
			weightmapchocs.put( chocolateName,weight);
		}
		else{
			weightmapchocs.put( chocolateName,weight+weightmapchocs.get(chocolateName));
		}
		
		if(!costmapchocs.containsKey(chocolateName)){
			costmapchocs.put( chocolateName,price);
		}
		else{
			costmapchocs.put( chocolateName,price+costmapchocs.get(chocolateName));
		}
	}
	
	public static void sortByPrice() {
		TreeMap<String, Integer> sortedMap = sortByValue(costmapchocs);
		System.out.println(sortedMap);
		
	}
	public static void sortByWeight() {
		TreeMap<String, Integer> sortedMap = sortByValue(weightmapchocs);
		System.out.println(sortedMap);
		
	}
	public static void priceRange(){
		TreeMap<String, Integer> sortedMap = sortByValue(costmapchocs);
		System.out.println("Enter the lower limit : ");
		int low = sc.nextInt();
		System.out.println("Enter the higher limit : ");
		int high = sc.nextInt();
		for(Map.Entry<String, Integer> entry : sortedMap.entrySet()){
			if(entry.getValue() >= low && entry.getValue() <= high){
				System.out.println(entry.getKey()+":"+entry.getValue()+"\n");
			}
		}
	}
		public static void weightRange(){
			TreeMap<String, Integer> sortedMap = sortByValue(weightmapchocs);
			System.out.println("Enter the lower limit : ");
			int low = sc.nextInt();
			System.out.println("Enter the higher limit : ");
			int high = sc.nextInt();
			for(Map.Entry<String, Integer> entry : sortedMap.entrySet()){
				if(entry.getValue() >= low && entry.getValue() <= high){
					System.out.println(entry.getKey()+":"+entry.getValue()+"\n");
				}
			}
		}
		
	private static TreeMap<String,Integer> sortByValue(TreeMap<String,Integer> unsortedMap) {
		TreeMap<String,Integer> sortedMap = new TreeMap(new ValueComparator(unsortedMap));
		sortedMap.putAll(unsortedMap);
		return sortedMap;
	}
}


	

	


