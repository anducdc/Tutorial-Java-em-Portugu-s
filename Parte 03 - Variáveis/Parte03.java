/*VARIÁVEIS

Variáveis são contêiners usados para guardar valores. No Java existem diferentes tipos
de variáveis:
1) String - guarda texto, como "Hello World"
2) int - guarda números inteiros, como 123 ou -123
3) float - guarda números decimais, como 19.99 ou -19.99
4) char - guarda caracteres únicos como 'a' ou 'B' (letras). Use aspas simples e
	não duplas!
5) boolean - guarda valores booleanos. Ou seja, verdadeiro ou falso

*/
public class Parte03 {

	public static void main(String[] args) {
		int idade = 33;
		System.out.println (idade);
	}

}

/*
No exemplo acima eu criei uma variável chamada idade. Seu tipo é int, então espera-se 
que um valor em número seja atribuído a ela, que no caso foi o 33.
A partir de agora sempre que eu indicar o programa a palavra idade o número 33 será
mostrado.
Vamos explorar variáveis com mais cuidado em breve, mas aproveite este programa para
experimentar:
-Mude o valor 33 para qualquer outro número e execute o programa. Mude também para 
	números decimais ou mesmo palavras e veja o que acontece!
-Na linha de impressão (System.out.println), experimente fazer um cálculo como: 
	idade + 1 ou idade * idade. 
*/