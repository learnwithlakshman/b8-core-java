package com.careerit.cj.collection.mapexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Streams {

	public static void main(String[] args) {
		List<Integer> list = getRandomNumbers();

		System.out.println("------------- using for loop-------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------- using for for-each-----------------");
		for (int ele : list) {
			System.out.println(ele);
		}
		System.out.println("------------- using for iterator-----------------");
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int ele = iterator.next();
			System.out.println(ele);
		}
		System.out.println("------------- using for streams-----------------");
		list.stream().forEach(System.out::println);

		// Get all even numbers from the given list
		List<Integer> evenList = getElements(list, (ele) -> ele % 2 == 0);
		List<Integer> oddList = getElements(list, (ele) -> ele % 2 != 0);
		List<Integer> primeNumber = getElements(list, (ele) -> isPrime(ele));

		// Get element between 30-50
		List<Integer> numbersBetween = getElements(list, (ele) -> ele >= 20 && ele <= 50);

		System.out.println(evenList);
		System.out.println(oddList);
		System.out.println(primeNumber);
		System.out.println(numbersBetween);

	

	}

	private static List<Integer> getElements(List<Integer> list, Predicate<Integer> p) {
		return list.stream().filter(p).collect(Collectors.toList());
	}

	private static boolean isPrime(Integer ele) {

		if (ele < 2)
			return false;
		if (ele % 2 == 0 && ele != 2)
			return false;
		for (int i = 2; i <= ele / 2; i++)
			if (ele % i == 0)
				return false;

		return true;

	}

	private static List<Integer> getRandomNumbers() {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			list.add(ThreadLocalRandom.current().nextInt(1, 100));
		}
		return list;
	}
}
