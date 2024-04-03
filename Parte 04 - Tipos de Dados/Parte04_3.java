/* BOOLEAN, CHAR  E OUTROS ADENDOS

Booleanos só retornam dois tipos de valores, como SIM/NãO, ON/OFF (ligado ou
desligado) ou VERDADEIRO/FALSO (true e false). Esse tipo de variável é muito 
importante para fazermos que o programa responda de diferentes formas de acordo
com cada situação. Você pode fazer com que uma pessoa veja uma mensagem X ao
conseguir uma determinada pontuação num teste ou uma mensagem Y se falhar. 


É possível fazer com que o sistema mande uma mensagem ou que troque de cor num certo
dia caso o programa verifique a data e o valor retornado seja verdadeiro. Ou que
tal conteúdos de certas idades para cima não sejam mostrados para um usuário com
conta infantil? Desligar a TV depois de certa hora? Bem, fica por conta de sua
imaginação e criatividade, mas fazer o programa verificar um dado e agir de certa
forma quando o valor for verdadeiro ou falso é algo muito comum. 
 
 */
public class Parte04_3 {

	public static void main(String[] args) {
		boolean alunoRico = true;
		boolean alunoPobre = false;
		char tamanhoRoupa = 'G';
		char exemploAscii = 190; //experimente digitar outros números
		
		System.out.println(alunoRico);
		System.out.println(tamanhoRoupa);
		System.out.print(exemploAscii);
	}

}
/*Os caracteres são simples mas também muito importantes e podemos, é claro, 
combinar todos os conceitos anteriormente vistos como fazer o programa verificar a
idade de um usuário e designar uma letra para ele, como 'C' para crianças e não
mostrar certos conteúdos para usuários que tem essa letra usando valores booleanos.


De forma alternada é possível criar variáveis booleanas com base na tabela de
ASCII para retornar certos valores. Execute este programa para ver que alguns dos
valores que são maiores que um único caractere na verdade retornam valores em ASCII.
*/
