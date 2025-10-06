package com.joao.arrays.exemple;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = {90,100,200,320,83,78,85,91,76,87};
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		System.out.println("Somatório " + total);
	}

}
