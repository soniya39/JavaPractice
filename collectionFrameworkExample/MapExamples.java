package com.collectionFrameworkExample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("A",3);
		map.put("BA",303);
		map.put("AZ",343);
		System.out.println(map);
		System.out.println(map.containsKey("AZ"));
		System.out.println(map.containsValue(200));
		System.out.println(map.keySet());
		System.out.println(map.values());
		map.remove("A");
		map.put("BA",333);//it changes the previous value of key value of BA
		System.out.println(map);
		Map<String,Integer> map1 = new Hashtable<String, Integer>(map);
		System.out.println(map1);
		Map<String,Integer> map2 = new LinkedHashMap<String, Integer>();
		map2.put("A",3);
		map2.put("BA",303);
		map2.put("AZ",343);
		System.out.println(map2);
		Map<String,Integer> map3 = new TreeMap<String, Integer>(map2);
		System.out.println(map3);
		
		String sentance = "This is a great thing happened today"+" "+"This is awesome";
		Map<Character, Integer> letterCountMap = new LinkedHashMap<>();
		char[] letters = sentance.toCharArray();
		for(char letter:letters) {
			Integer occurance = letterCountMap.get(letter);
			if(occurance==null) 
				letterCountMap.put(letter, 1);
			else
				letterCountMap.put(letter, occurance+1);
		}
		System.out.println(letterCountMap);
		
		Map<String, Integer> wordsCountMap = new LinkedHashMap<>();
		String[] words = sentance.split(" ");
		for(String word:words) {
			Integer occurance = wordsCountMap.get(word);
			if(occurance==null) 
				wordsCountMap.put(word, 1);
			else
				wordsCountMap.put(word, occurance+1);
		}
		System.out.println(wordsCountMap);


	}

}
