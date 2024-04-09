/*OPERADORES LÓGICOS

Também testamos verdadeiro ou falso com operadores lógicos. Nesse caso os usamos
para determinar a lógica entre dois valores ou variáveis:

OPERADOR	NOME	DESCRIÇÃO									EXEMPLO
&&			e		Retorna true se ambos forem verdadeiros		x < 5 && x < 8
||			ou		Retorna true se um for verdadeiro			x < 5 || x < 4
 !			não		Inverte o resultado, false se for true		!(x < 5 && x < 10) 		
 */
public class Parte06_05 {

	public static void main(String[] args) {
		int salario = 1800;
		int idade = 33;
		int gastos = 1250;
		
		
		System.out.println(salario > 1400 && gastos < 1400);
		//retorna true pois ambos são verdadeiro
		System.out.println(idade > 30 || gastos < 1200);
		//retorna true pois ao menos um é verdadeiro
		System.out.println(!(salario == 1800 && gastos == 1250));
		//retorna false pois normalmente seria true e o ! inverte esse resultado

	}

}

/*Perceba que no programa acima eu fiz três testes com operaddores lógicos e que
eles comparam dois fatores ao invés de apenas um como nos operadores relacionais.
Repare ainda que os testes usam como base os operadores relacionais, como
			>, <, ==, !=, >=, <=
 */
