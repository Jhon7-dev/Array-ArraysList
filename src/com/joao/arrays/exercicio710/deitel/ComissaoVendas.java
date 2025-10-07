package com.joao.arrays.exercicio710.deitel;

import java.util.Scanner;

public class ComissaoVendas {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int [] contadores = new int[9];
		int array [] = {200-299,300-399,400-499,500-599,600-699,700-799,800-899,900-999,1000}; 
		
		int salario = 200;
		//System.out.print("Digite o valor da venda: ");
		//int valor = scn.nextInt();
	 
		
		for (int i = 0; i < 10; i++) {
			
				double taxa = 0.0;
			//taxa = salario + valor*0.09;
			
			System.out.printf("%5d%8d\n" ,  " salario " , " valores ");
			for (int count = 0; i < array.length; count++) {
				System.out.printf("%5d%8d\\n",count,array[count]);
			}
		}
		
	}
}
