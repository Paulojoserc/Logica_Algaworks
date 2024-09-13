package Exercicio;

//Verificar se a pessoa passou no concurso público
public class Ex01 {
/*
 * Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
 * A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
 * No final mostre para o candidato se ele conseguiu ou não.
 */
	
	public static void main(String[] args) {
		
		int notaPortugues = 75;
		int notaMatematica = 75;
		
		if ((notaMatematica >=60) && (notaPortugues >=60)){
			int total = notaMatematica + notaPortugues;
			
			System.out.println("Parabêns você passou como uma média "+total);
		}else {
			System.out.println("Desculpa sua nota não atendeu os requitos para passar ");
		}
	}
	
}
