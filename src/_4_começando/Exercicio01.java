package _4_come�ando;

import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite os dois numeros da opera��o");
	Double num01 = sc.nextDouble();
	System.out.println();
	Double num02 = sc.nextDouble();
	System.out.println("Escolha uma das ope��os abaixo: ");
	System.out.println("n�mero 1 ser� adi��o, o 2 subtra��o, o 3 multiplica��o e o 4 divis�o");
	System.out.println();
	String opera��o = sc.next();
	Double resultado = null;
	if(opera��o.equals("1")) {
		resultado = num01 + num02;
	}else if(opera��o.equals("2")) {
		if(num01 >= num02) {
			resultado = num01 - num02;
		}else {
			resultado = num02 - num01;
		}
	}else if(opera��o.equals("3")) {
		resultado = num01 * num02;
	}else if (opera��o.equals("4")) {
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
