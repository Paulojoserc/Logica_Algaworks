package _4_começando;

import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite os dois numeros da operação");
	Double num01 = sc.nextDouble();
	System.out.println();
	Double num02 = sc.nextDouble();
	System.out.println("Escolha uma das opeçãos abaixo: ");
	System.out.println("número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão");
	System.out.println();
	String operação = sc.next();
	Double resultado = null;
	if(operação.equals("1")) {
		resultado = num01 + num02;
	}else if(operação.equals("2")) {
		if(num01 >= num02) {
			resultado = num01 - num02;
		}else {
			resultado = num02 - num01;
		}
	}else if(operação.equals("3")) {
		resultado = num01 * num02;
	}else if (operação.equals("4")) {
		if(num01 >= num02) {
			resultado = num01 / num02;
		}else {
			resultado = num02 / num01;
		}
	}else {
		System.out.println("Operador Invalido");
	}
	System.out.println(resultado);
	
	sc.close();
}
}
