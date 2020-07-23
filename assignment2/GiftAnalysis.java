 package com.task2.maven.mavenproject;
import java.util.*;
public class GiftAnalysis {
	static TreeMap<String,Integer> weightmapsweets = new TreeMap<String,Integer>();
	static TreeMap<String,Integer> costmapsweet = new TreeMap<String,Integer>();
	static TreeMap<String,Integer> weightmapchocs = new TreeMap<String,Integer>();
	static TreeMap<String,Integer> costmapchocs = new TreeMap<String,Integer>();
	static Scanner s = new Scanner(System.in);
	static public void inputSweets(){
		System.out.println("Enter the number of sweets : ");
		int n = s.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter name of sweet : ");
			String name = s.next();
			System.out.println("Enter weight of sweet : ");
			int wgt = s.nextInt();
			System.out.println("Enter cost of sweets : ");
			int cost = s.nextInt();
			
			new Sweets(name,wgt,cost);
		}
	}
	static public void inputChocs(){
		System.out.println("Enter the number of chocolates : ");
		int n = s.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter name of chocolate : ");
			String name = s.next();
			System.out.println("Enter weight of chocolate : ");
			int wgt = s.nextInt();
			System.out.println("Enter cost of chocolate : ");
			int cost = s.nextInt();
			if(!weightmapchocs.containsKey(name)){
				weightmapchocs.put( name,wgt);
			}
			else{
				weightmapchocs.put( name,wgt+weightmapchocs.get(name));
			}
			
			if(!costmapchocs.containsKey(name)){
				costmapchocs.put( name,cost);
			}
			else{
				costmapchocs.put( name,cost+costmapchocs.get(name));
			}
			new Chocolates(name,wgt,cost);
		}
	}
	public static void main(String[] args){
		inputSweets();
		inputChocs();
		
		System.out.println("1.sort chocolates by weight");
		System.out.println("2.sort chocolates by cost");
		System.out.println("3.sort sweets by weight");
		System.out.println("4.sort sweets by cost");
		System.out.println("5.Total weight of Gift");
		System.out.println("6.Total cost of Gift");
		System.out.println("7.Items in Gift");
		System.out.println("8.chocolates with in range of price");
		System.out.println("9.chocolates with in range of weights");
		System.out.println("10.sweets with in range of price");
		System.out.println("11.sweets with in range of weights");
		
		int p = 1;
		while(p==1){
			System.out.println("Please Enter your option:");
			int n = s.nextInt();
			Gift gift = new Gift();
			Chocolates chocolates = new Chocolates();
			Sweets sweets = new Sweets();
			if(n == 1){
				chocolates.sortByWeight();
				
			}
			else if(n == 2){
				chocolates.sortByPrice();
			}
			else if(n == 3){
				sweets.sortByWeight();
			}
			else if(n == 4){
				sweets.sortByPrice();
			}
			else if(n == 5){
				gift.getWeights();
			}
			else if(n == 6){
				gift.getCosts();
			}
			else if(n == 7){
				gift.itemsDisplay();
			}
			else if(n == 8){
				chocolates.priceRange();
			}
			else if(n == 9){
				chocolates.weightRange();
			}
			else if(n == 10){
				sweets.priceRange();
			}
			else if(n == 11){
				sweets.weightRange();
			}
			else{
				System.out.println("Please Enter Valid Option");
			}
			System.out.println("press 1 to continue else 0 to break");
			p = s.nextInt();
		}
			
			
		
		
		
	}

}
