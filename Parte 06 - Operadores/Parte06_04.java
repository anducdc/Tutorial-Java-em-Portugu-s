/*OPERADORES RELACIONAIS

Usamos desses operadores para compararmos dois valores (ou variáveis). Isto é 
importante pois ajuda a encontrar respostas e fazer decisões.
O valor retornado de uma comparação sempre será VERDADEIRO ou FALSO, ou valores
booleanos.
		int x = 5;
		int y = 3;
		System.out.println (x > y); 

O programa acima retornará "true" pois é verdadeiro que x é maior que y. Ele
retornaria "false" se o código fosse (y > x) ou (x < y).
Confira a lista de operadores relacionais:

OPERADOR			NOME				EXEMPLO
	==				igual à				x == y
	!=				diferente			x != y
	>				Maior que			x > y
	<				Menor que			x < y
	>=				Maior ou igual à	x >= y
	<=				Menor ou igual à	x <= y

 */
public class Parte06_04 {

	public static void main(String[] args) {
		int minhaIdade = 33;
		int idadePrimo = 16;
		int idadePermitidaFesta = 18;
		
		System.out.println(minhaIdade == idadePrimo);
		System.out.println(idadePrimo != idadePermitidaFesta);
		System.out.println(minhaIdade > idadePermitidaFesta);
		System.out.println(idadePermitidaFesta < idadePrimo);
		System.out.println(idadePrimo >= idadePermitidaFesta);
		System.out.println(idadePrimo <= minhaIdade);

	}

}
/*Veja que este programa retornou diversos valores booleanos, verdadeiro e falso.
Isso porque eu o escrevi para fazer testes comparando valores um pouco aleatórios.
Na linha do == estamos verificando se ambos os valores são estrictamente idênticos,
o que é falso pois a minha idade é 33 e a do primo é 16.

Na linha do != estamos comparando a idade dele com a idade permitida para entrar
na festa com o operador de diferença, o oposto do ==. A idade dele e a idade
permitida são diferentes? Verdadeiro.

Na linha do > entamos verificando se a minha idade é maior do que a permitida para
a festa, o que é verdadeiro pois eu tenho 33 e a festa é a partir dos 18.

Na linha < eu calculei se a idade permitida era menor que a do meu primo, o que
retornou falso pois a idade necessária seria 18 e ele só tem 16. Ou seja, falso!

As linhas >= e <= são bbem interessantes pois elas calculam se os valores são
maior/menor ou igual. Um programador tem que ficar esperto com essas coisas pois
imagine que meu primo tem 18 anos e o meu código só use os operadores < e >. Como
a festa é a partir dos 18 anos, se o código usar > para permitir, isso quer dizer
que apenas pessoas acima dos 18 entrariam e < significaria que abaixo seriam
impedidas. Mas e se eu não for maior nem menor que 18 mas tiver exatamente essa
idade? É aí que entram >= e <=, mas veremos isso melhor no futuro.

 */ 
