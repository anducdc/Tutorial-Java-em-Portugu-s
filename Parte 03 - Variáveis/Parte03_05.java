/*IMPRIMINDO VARIÁVEIS

Usamos o método println() para rescrever variáveis, como já vimos no passado.
Em alguns exemplos eu combinei a impressão em tela dessas variáveis com textos,
isso se chama concatenar e basta separarmos as variáveis desses textos usando o
caractere +. Além disso, todo texto deve estar entre aspas.
*/
public class Variaveis_05 {

	public static void main(String[] args) {
		int idade = 33;
		String nomeAluno = "Carlos";
		String nomeProf = "Tom";
		
		System.out.println(idade);	//imprime o valor desta variável
		System.out.println(1 + 1);	//realiza o cálculo matemático em questão
		
		System.out.println("1 + 1");//tudo é tratado como texto e impresso
		System.out.println("1" + "1");//dois textos que serão concatenados
		
		/*
		 Perceba que pode haver a necessidade de adicionar espaços em branco à
		 concatenação para que o resultado seja bem organizado:
		 */
		System.out.println("Olá, meu nome é" + nomeAluno + "e tenho" + idade);
		System.out.println("Olá, meu nome não é " + nomeProf + "! Sou o " + nomeAluno + "!");
	}

}
