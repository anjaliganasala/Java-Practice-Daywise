package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>(Arrays.asList('a','b','c','a','b'));
		
		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : list) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}
