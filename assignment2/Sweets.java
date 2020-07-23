package com.task2.maven.mavenproject;

import java.util.Comparator;
import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class Sweets extends Gift {
	static TreeMap<String,Integer> weightmapsweets = new TreeMap<String,Integer>();
	static TreeMap<String,Integer> costmapsweet = new TreeMap<String,Integer>();
	String sweetName;
	static Scanner sc = new Scanner(System.in);
	
	public Sweets() {
		sweetName = "";
		weight = 0;
		price = 0;
	} 
	public Sweets(String sweetName,int weight,int price) {
		super();
		this.sweetName = sweetName;
		this.weight = weight;
		this.price = price;
		cost.add(price);
		items.add(sweetName);
		getweight.add(weight);
		if(!weightmapsweets.containsKey(sweetName)){
			weightmapsweets.put( sweetName,weight);
		}
		else{
			weightmapsweets.put( sweetName,weight+weightmapsweets.get(sweetName));
		}
		
		if(!costmapsweet.containsKey(sweetName)){
			costmapsweet.put( sweetName,price);
		}
		else{
			costmapsweet.put( sweetName,price +costmapsweet.get(sweetName));
		}
	}
	
	public static void sortByPrice() {
		TreeMap<String, Integer> sortedMap = sortByValue(costmapsweet);
		System.out.println(sortedMap);
		
	}
	public static void sortByWeight() {
		TreeMap<String, Integer> sortedMap = sortByValue(weightmapsweets);
		System.out.println(sortedMap);
		
	}
	public static void priceRange(){
		TreeMap<String, Integer> sortedMap = sortByValue(costmapsweet);
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
			TreeMap<String, Integer> sortedMap = sortByValue(weightmapsweets);
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
	class ValueComparator implements Comparator {
		Map map;
	 
		public ValueComparator(Map map) {
			this.map = map;
		}
	 
		public int compare(Object keyA, Object keyB) {
			Comparable valueA = (Comparable) map.get(keyA);
			Comparable valueB = (Comparable) map.get(keyB);
			return valueB.compareTo(valueA);
		}
	}
