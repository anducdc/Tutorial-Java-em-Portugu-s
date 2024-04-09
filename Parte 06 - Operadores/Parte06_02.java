/*OPERADORES ARITMÉTICOS

Usamos esses operadores para executar cálculos matemáticos.

+	adição			adiciona dois valores juntos
-	subtração		subtrai um valor de outro
*	multiplicação	multiplica dois valores
/	divisão			divide um valor por outro
%	resto			retona o valor restante
++	incrementar		aumenta o valor de uma variável por 1
--	decrementar		diminui o valor de uma variável por 1.	

 */
public class Parte06_02 {

	public static void main(String[] args) {
		int minhaIdade = 33;
		int idadeNamorada = 30;
		
		System.out.println(minhaIdade + idadeNamorada);	//adição
		System.out.println(minhaIdade - 5);				//subtração
		System.out.println(minhaIdade * 2);				//multiplicação
		System.out.println(minhaIdade / 3);				//divisão
		System.out.println(minhaIdade % idadeNamorada);	//resto
		System.out.println(++minhaIdade);				//incremento
		System.out.println(--idadeNamorada);			//decremento
	}

	
}

/*A maioriia desses operadores deve ser simples de entender.
O operador % calcula o valor restante numa divisão, então se dividirmos 5 maçãs 
por 2 pessoas ao invés de retornarmos o valor inteiro 2 para cada ou o decimal 2,5
nós pensamos assim: cada pessoa ficou com 2 maçãs e sobrou uma que não pode ser
dividida. Esse valor restante é o que será retornado.
No exemplo acima é como se dividíssemos 33 por 30, o que retornou 3, o restto que
não pode ser dividido.

Incremento e decremento são simplesmente o que você viu: adicionar ou subtrair um
número. Veremos diversas utilidades para isso no decorrer no tutorial e em breve
em estruturas de repetição. 
 
 */
