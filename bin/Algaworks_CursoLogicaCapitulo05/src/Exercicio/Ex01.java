package Exercicio;

//Verificar se a pessoa passou no concurso p�blico
public class Ex01 {
/*
 * Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. Ser�o dois par�metros para receber um para receber a nota de portugu�s e outro para receber as de matem�tica.
 * A prova, no total, vale 200 pontos - 100 para cada mat�ria. A nota m�nima total para passar � igual ou maior que 150. Entretanto, o candidato n�o pode tirar menos do que 60 pontos em qualquer uma das duas mat�rias, ou seja, se tirar 59 em portugu�s e 100 em matem�tica (totalizando uma nota maior do que o total necess�rio que � 150) ele n�o conseguir� a vaga.
 * No final mostre para o candidato se ele conseguiu ou n�o.
 */
	
	public static void main(String[] args) {
		
		int notaPortugues = 75;
		int notaMatematica = 75;
		
		if ((notaMatematica >=60) && (notaPortugues >=60)){
			int total = notaMatematica + notaPortugues;
			
			System.out.println("Parab�ns voc� passou como uma m�dia "+total);
		}else {
			System.out.println("Desculpa sua nota n�o atendeu os requitos para passar ");
		}
	}
	
}
