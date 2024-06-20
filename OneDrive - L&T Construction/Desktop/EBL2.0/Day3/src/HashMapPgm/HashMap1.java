package HashMapPgm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;
public class HashMap1 {
	  public static void main(String[] args) 
	    { 
	        HashMap<Integer, Integer>  map = new HashMap<>(); 
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Key and Value ");
	        for(int i=0;i<=5;i++)
	        {
	        	
	        	map.put(sc.nextInt(), sc.nextInt()); 
	        }
	        System.out.println("Enter the Key you want to search ");
	        int checkKey = sc.nextInt(); 
	        System.out.println("HashMap: " + map); 
	  
	        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator(); 
	        boolean isKeyPresent = false; 
	        while (iterator.hasNext()) {  
	            Map.Entry<Integer, Integer> entry = iterator.next(); 
	            if (checkKey == entry.getKey()) { 
	                isKeyPresent = true; 
	            } 
	        } 
	        System.out.println("key  " + checkKey + " Present or Not " + isKeyPresent); 
	    } 
	} 

