package com.joao.arrays.exemple;

import java.util.Random;

public class Rolldie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumbers = new Random();
		int frequency [] = new int [7];
		
		for (int i = 0; i < 10; i++) {
			++frequency[1+randomNumbers.nextInt(6)];
			System.out.printf("%s%10s\n","Face","Frequency");
			
			for (int face = 1; face<frequency.length; face++) {
				System.out.printf("%4d%10d\n", face,frequency[face]);
			}
		}

	}

}
