package com.selenium.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collectionType {
	
	public static void  arraylsy(){
	
	List<String> list= new ArrayList<String>();
	list.add("sdgsdg");
	list.add("4");
	list.add("sdgdg");
	list.add("4");
	System.out.println("is empty"+list.isEmpty());
	System.out.println("size of list"+ list.size());
	System.out.println("Contains 4"+list.contains("4"));
	
	List<Integer> list02 =new ArrayList<Integer>();
	list02.add(5);
	list02.add(6);
	list02.add(7);
	list02.add(8);
	
	Iterator<String> it=list.iterator();
	
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
	
	
	Set<String> set01=new HashSet<String>();
	set01.add("sdg");
	set01.add("5");
	set01.add("5");
	set01.add("7");
	
	for(String str:set01)
		System.out.println(str);
	
	Map<String,String> map01=new HashMap<String,String>();
	map01.put("class", "Leo");
    map01.put("Roll", "22");
    map01.put("Name", "Lohitaksh Tiwari");
    
   System.out.println(map01.containsKey("class"));
   System.out.println(map01.containsValue("Leo"));
   
   for(String map02:map01.keySet()){
	   System.out.println(map02+":"+map01.get(map02));
	
			   
   }
	
	}
	
	
	
	public static void main(String args[]){
		arraylsy();
		
	}
	
	

}
