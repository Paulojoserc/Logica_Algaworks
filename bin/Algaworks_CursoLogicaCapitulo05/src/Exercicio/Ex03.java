package Exercicio;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite os dia que deseja");
	Integer diasDaSemana = sc.nextInt();
	
	switch(diasDaSemana){
	case 1:
		System.out.println("Domingo");
		break;
	case 2:
		System.out.println("Segunda");
		break;
	case 3:
		System.out.println("Ter�a");
		break;
	case 4:
		System.out.println("Quarta");
		break;
	case 5:
		System.out.println("Quinta");
		break;
	case 6:
		System.out.println("Sexta");
		break;
	case 7:
		System.out.println("Sabado");
		break;

	default: System.err.println("Digite um dia v�lido!");	
	}
	
	System.exit(1);
			sc.close();
}


}
