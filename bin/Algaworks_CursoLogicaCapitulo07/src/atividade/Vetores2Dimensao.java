package atividade;

public class Vetores2Dimensao {
	public static void main(String[] args) {
	//	Double faturamentoDia = 1000.0;

		Double[] faturamentoJanairo = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double[] faturamentoFevereiro = new Double[] { 1000.0, 2500.0, 1800.0 };

		Double[][] faturamentoAnual = new Double[][] { faturamentoJanairo, faturamentoFevereiro };

//		System.out.println("Faturamento do dia 1� de Janeiro: " + faturamentoAnual[0][0]);
//		System.out.println("Faturamento do dia 3 de Fevereiro: " + faturamentoAnual[1][2]);
		
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("M�s: "+(i+1));
			
			Double[] mes = faturamentoAnual[i];
			
			for (int y = 0; y < mes.length; y++) {
				Double dia = mes[y];
				System.out.println("Dia "+ (y+1) +": " +dia);
				
			}
		}
		
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("M�s: "+(i+1));
			for(int y = 0; y<faturamentoAnual[i].length; y++) {
				Double dia = faturamentoAnual[i][y];
				System.out.println("Dia "+(y+1)+": "+dia);
			}
		}
	}
}
