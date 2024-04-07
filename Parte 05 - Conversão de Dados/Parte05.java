/*CONVERSÃO DE DADOS

	A conversão de dados acontece quando você designa um valor de um tipo
primitivo para outtro tipo.
	Em Java há dois tipos de conversão:
	
	-Widening Casting (automático) - Conversão de um tipo menor para um maior
		byte -> short -> char -> int -> long -> float -> double
		
	-Narrowing Casting (manual) - conversão de um tipo maior para um menor
		double -> float -> long -> int -> char -> short -> byte

 */
public class Parte05 {

	public static void main(String[] args) {
		/*A conversão do tipo Widening, aumentativa, é feita automaticamente
			quando passamos um tipo de tamanho menor para um tipo de maior:*/
		int minhaIdade = 9;
		double meuDecimal = minhaIdade;
		
		/*A conversão do tipo Narrowing, diminutiva, deve ser feita manualmente
		 	colocando o tipo em parênteses em frente ao valor:*/
		double meuExemplo = 9.78d;
		int meuNumeral = (int) meuExemplo;
		
		System.out.println(minhaIdade);
		System.out.println(meuDecimal);
		System.out.println(meuExemplo);
		System.out.println(meuNumeral);

	}

}
/*Atente-se ao valor de cada variável que foi impressa e não tenha medo de trocar
os valores delas para ver os resultados e entender o que está acontecendo.
Em resumo, a primeira impressão trouxe o valor esperado de um int, a segunda
retornou esse número convertido de int para double. A terceira impressão foi o
double esperado e a quarta foi a sua conversão de double para int, o que ocasionou
na perda do ponto e de tudo o que vier depois dele.
*/