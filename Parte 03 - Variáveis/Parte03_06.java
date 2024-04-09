/*DECLARANDO MULTIPLAS VARIAVEIS

É possível declarar várias variáveis do mesmo tipo ao mesmo tempo usando vírgulas.
		Ao invés de usar:
			int x = 5;
			int y = 6;
			int z = 50;
		
		Podemos simplesmente usar:
			int x = 5, y = 6, z = 50;
			
É ainda possível adicionar um valor para múltiplas variáveis:
			int x, y, z;
			x = y = z = 50;
			
 */
public class Variaveis_05_02 {

	public static void main(String[] args) {
		int idade = 33, salario = 5000, ano = 2024;
		
		int salarioProf, salarioCoord, salarioAgente;
		salarioProf = salarioCoord = salarioAgente = 2500;

		System.out.println ("Gastos mensais: " + salarioProf + salarioCoord + salarioAgente);
		

	}

}
/*Aqui eu cogitei criar uma variável chamada gastosMensais que retornaria o valor
 da soma dos três salários:
 
 		int gastosMensais = salarioProf + salarioCoord + salarioAgente;
 		
 Neste caso a variável gastosMensais retornaria o valor 7500, que é a soma dos
 valores destas variáveis, mas optei por deixar o código mais óbvio (e trabalhoso)
 */