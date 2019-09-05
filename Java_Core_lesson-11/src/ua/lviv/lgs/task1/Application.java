package ua.lviv.lgs.task1;

import java.util.Arrays;
import java.util.Collections;

public class Application {
	
	public static void main(String[] args) {
		
		Integer [] arrayOfIntegers = {1, 24, 33, 21, 5, 22, 91, 102131, 3, 224, 12, 22, 999, 4};
		Arrays.sort(arrayOfIntegers);
		System.out.println("Array in ascending order:" + Arrays.toString(arrayOfIntegers));
		
		Arrays.sort(arrayOfIntegers, Collections.reverseOrder());
		System.out.println("Array in descending order:" + Arrays.toString(arrayOfIntegers));
	}

}
