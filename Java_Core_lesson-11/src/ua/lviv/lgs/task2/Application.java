package ua.lviv.lgs.task2;

import java.util.Arrays;
import java.util.Random;

public class Application {

	public static void main(String[] args) {
		

		Car[][] arrayOfCars = {
				{ new Car("Chevrolet", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020), getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Silk"),
						new Car("BMW", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020), getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Rubber"),
						new Car("Renault", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020), getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Glue"),
						new Car("Mercedes", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020), getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Sponge"),
						new Car("Hyundai", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020), getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Pepper"),
						new Car("Mazda", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020), getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Mint"),
						new Car("Audi", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020), getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Blades")} };
		
		System.out.println(Arrays.deepToString(arrayOfCars));
	}
	

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be lower than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

}
