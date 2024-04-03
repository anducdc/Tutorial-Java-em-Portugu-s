/*TIPOS DE DADOS (DATA TYPES)
  
  Variáveis devem ser declaradas em algum dos tipos específicos:
 
	int meuNumero = 5;                 integer (número inteiro)
	float numeroFlutuante = 5,99f;     número flutuante/decimal/com ponto
	char minhaLetra = 'D';             caracter único
	boolean meuBool = true;            booleano/verdadeiro ou falso
	String meuTexto = "Olá, Mundo!"    palavra/texto 
*/

public class Parte04 {

	public static void main(String[] args) {
		String meuNome = "Anderson";
		int minhaIdade = 33;
		//int = 10;
		//minhaCidade = Brasília;
		char minhaInicial = 'A';
		
		System.out.println(meuNome);
		System.out.println(minhaIdade);
		System.out.println(minhaInicial);
	}

}

/*Perceba que no programa acima eu criei cinco "variáveis". Entre aspas pois três
delas são válidas: String meuNome = "Anderson"; int minhaIdade = 33 e
char minhaInicial = 'A';
As pseudo-variáveis das linhas 15 e 16 foram declaradas incorretamente, sendo que
int = 10 inclui o tipo e o valor (int e 10) mas não um nome para que possamos
chamá-la e efetivamente usá-la.
Veja que nas linhas de escrever na tela usamos System.out.println + o nome das
variáveis neste exemplo, o que seria impossível se elas não tivessem um nome.
Já em minhaCidade = Brasília não está sendo afirmado o tipo da variável, como
int, String, float, boolean etc, o que também impossibilita de a usar.
Você pode descomentar uma ou duas dessas variáveis e perceber que o programa
retornará um erro.

Mas lembre-se: é possível criar variáveis sem valores declarados e o fazer mais
tarde, como 
	int minhaIdade;
ou
	String meuNome;
 */