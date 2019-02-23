package com.marlabs.MapRegular;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		//Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		System.out.println("SIZE=====>" +map.size());
		System.out.println("IS EMPTY =====>" +map.isEmpty());
		
/////////  PUT
		int a= 131;
		int b= 102;
		map.put(101, "AAAAAA");
		map.put(131, null);
		map.put(b, "BBBBBB");
		map.put(100, "CCCCCC");
		map.put(99, "MMMMMMM");
		System.out.println(map.put(100, "NNNNNNN"));
		map.put(null, "BBBBBBB");
		map.put(121, null);
		map.put(131, null);
		map.put(a, "PPPPPPP");
		
		
		
//////////
		
		System.out.println(map);
		System.out.println(map.get(100));
		System.out.println(map.containsKey(101));
		System.out.println(map.containsValue("BBBBBBB"));
		System.out.println(map.remove(101));
		System.out.println(map);
		
		Set<Integer> setKeys  = map.keySet();
		System.out.println(setKeys);
		
		Collection<String> setValues  = map.values();
		System.out.println(setValues);
		
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		for(Entry<Integer, String> i : entrySet) {
			System.out.println("Key = "+ i.getKey() + "   Values =" + i.getValue());;
		}
		
	}

}
