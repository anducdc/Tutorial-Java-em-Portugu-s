/*O bacana de usar variáveis é justamente poder trabalhar com esses valores de forma
ágil. Se o seu programa repetir centenas de vezes um nome, como o que você dá a um
personagem de videogame, basta guardar esse valor em uma palavra que ele sempre será
chamado corretamente por meio dela, como nomeChar ou qualquer outra coisa. E se você,
por qualquer motivo, optar por trocar essee nome, basta mudar uma vez na criação da
variável que todo o resto do documento automaticamente o trocará.

Sem contar esses cálculos. No caso de um jogo você pode dizer que a força do personagem
é de 30 mas a cada nível ele sobe esse número em +2. Com uma espada X em mão pode-se
dizer que a força agora é dee +10, com a espada Y é de +12. Com a magia de poder a
força do personagem é dobrada, ou seja: multiplicada por 2.

Todos esses valores modificam a variável original, que havia começado em 30, mas
adquirindo determinados equipamentos e os usando fez com que a força do personagem se
tornasse agora 67 ou qualquer coisa que vocễ tenha programado. Mas e se eu não quiser
que um valor seja modifficado?
  
 */
public class Parte03_04 {

	public static void main(String[] args) {
		int idadeAluno = 10;
		idadeAluno = 12;
		final int bolsaEstagio = 800;
		//bolsaEstagio = 900;
		
		System.out.println(idadeAluno);
	}

}

/*Quando declaramos um valor para uma variável, este valor é mutável. No exemplo do
personagem do jogo era possíveel fortalecer o aventureiro conforme ele fosse lutando e
usando diferentes armas. Trocar um valor é simples como no código acima, declarando um
novo valor para o nome da variável. AGora quando chamarmos a variável o valor mostrado
será o último, que no caso é 12.

Já para o caso de você querer um valor imutável, basta usar a palavra "final" antes do
tipo da variável ao fazer a declaração. No código acima foi criada a variável
bolsaEstagio com o valor 800, entretanto já na linha de baixo eu alterei o valor para
900. Entretanto tive que comentar a linha com o novo valor pois só de tentar alterar
um valor que era "final" o programa já retorna um erro, algo que você pode tentar
apenas descomentando a tal linha. Já a alteeração do valor da variável idadeAluno
funciona normalmente, bastando apenas executar o código para verificar. 
 */
