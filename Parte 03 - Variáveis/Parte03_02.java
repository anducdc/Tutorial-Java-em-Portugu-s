/*Ao declarar (criar) uma variável, é comum que especifiquemos seu tipo, nome e valor:
	tipo nomeVariável = valor;
Perceba:
	int idade = 33;
	String nome = "Anderson"
Quando eu chamar a variável idade, esta palavra seerá substituída pelo seu valor, que
neste caso é 33. Quando eu chamar a variável do tipo String que nomeei nome, o valor
Anderson aparecerá. Veja que Strings tem aspas duplas. Se você se lembrar do exemplo
da Parte01_3 vai saber que caracteres entre aspas s~ao considerados texto e não podem
ser usados para cálculos.
*/
public class Parte03_02 {

	public static void main(String[] args) {
		int idade = 33;
		String nomeAluno = "Carlos";
		String nomeProfessor = "Anderson";
		
		System.out.println("Olá, meu nome é " + nomeProfessor + ", eu tenho " + idade + " anos de idade e dou aula para o " + nomeAluno + "!");

	}

}
/*No programa acima foram criadas três variáveis: idade, nomeAluno e nomeProfessor
Nomear uma variável com palavras comuns pode não ser uma boa ideia e é sempre
	interessante usar termos que fazem sentido mas que não seriam chamado por acidente,
	como idadeProfessor, por exemplo.
Tanto nesse exemplo quanto nas duas variáveis do tipo String acima você percebe que
	os nomes são junções de duas palavras, uma iniciada por letra minúscula e a seguinte
	maiúscula. Essa convenção de chama "camelCase" e ajuda não só a evitar que variáveis
	sejam chamadas por acidente como ainda sinalizam se tratar de variáveis quando
	você ver qualquer coisa do tipo em um documento:
	
		int minhaIdade = 33;
		float valorPassagem = 3.80f;
		char carteiraMotorista = 'B';
		boolean maiorIdade = true;
		String minhaFrase "Seja feliz!"

Não se esqueça de executar o programa acima, trocar as informações pelas suas e tentar 
entender o que está sendo feito.
 */
