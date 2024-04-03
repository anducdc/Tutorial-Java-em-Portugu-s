/*Tipos de Dados podem ser divididos em dois grupos:
	Tipos Primitivos, como byte, short, int, long, float, double, boolean e char
	
	Tipos Não-Primitiivos, como String, Arrays e Classes (estudaremos futuramente)

 */
public class Parte04_2 {

	public static void main(String[] args) {
		byte umByte = 127;
		short doisBytes = 32767;
		int inteiroGrande = 2147483647;
		long inteiroGigante = 9223337203685477580L;
		float quatroBytes = 5.75f;
		double oitoBytes = 6.998562d;
		boolean maiorIdade = false;
		char meuGenero = 'M';
		
		System.out.println (umByte);
		System.out.println (doisBytes);
		System.out.println (inteiroGrande);
		System.out.println (inteiroGigante);
		System.out.println (quatroBytes);
		System.out.println (oitoBytes);
		System.out.println (maiorIdade);
		System.out.println (meuGenero);


	}

}
/*Aqui temos diversos tipos de dados e você deve perceber que muitos deles são
relacionados à números. Mas qual a diferença entre esses tipos e porque não usar
apenas um deles para tudo. Bem, existem motivos mas vamos começar pela quantidade
de bytes necessários para lermos cada um deles. Quanto mais bytes, maior o tempo
de processamento e quanto maior o projeto mais dados para serem processados.
Sendo assim, tentamos utilizar os tipos certos para cada situação e assim
otimizarmos a velocidade dos programas. Vamos a cada um deles:


	byte (1 byte) - Usado para guardar valores de -128 a 127. Que tal tentar 
		criar uma variável do tipo byte com um valor fora desse escopo?
	
	short (2 bytes) - guarda números de -32.768 até 32.767.
	
	int (4 bytes) - um dos tipos de variáveis mais comuns guarda números de
		-2.147.483.648 até 2.147.483.647.
		
	long (8 bytes) - guarda números de -9.233.372.036.854.775.808 até
		9.223.372.036.854.775.807. Por convenção é melhor adicionar a letra "L"
		no final do valor.
	
	float (4 bytes) - guarda números fracionais suficientes para 6 a 7 dígitos
		decimais. Não se esqueça de adicionar a letra "f" ao final dos valores
		como nas que declarei acima!
	
	double (8 bytes) - guarda números fracionais suficientes para 15 dígitos
		decimais. Adicione a letra "d" no final desses valores.
		
	boolean (1 bits) - guarda valores verdadeiros ou falsos (true/false).
	
	char (2 bytes) - guarda um único caractere/letra ou valores ASCII.


Perceba que nas documentações esses números longos costumam usar vírgula como 
separação como 2,147,483,647 ao invés de pontos pois é assim que funciona no
padrão americano. Entretanto quando declaramos uma variável de tipo inteiro não
usamos nenhum dos dois. Ou seja, usamos 9999 e NÃO 9.999 ou 9,999!


Veja também que as variáveis que guardam valores de certo alcance negativo até o
postivo costumam ter números semelhantes em ambas as extremidades, como -128 a
127. Isso se dá pelo alcance dos bytes de cada tipo, que no caso desse exemplo
são os números que podemos representar com apenas 1 byte. Ao tentar guardar o
número -129 ou 128 nesse tipo de variável um erro é retornado pois a partir deles
mais bytes são necessários. Sendo assim o ideal é deixar de usar o tipo "byte" e
usar o tipo "short", que já possui esse alcance.

E porque -128 a 127 ou -32.768 a -32.767 etc e não -127 a 127, por exemplo. Bem,
é a questão dos alcances de bytes que é o mesmo para números positivos e negativos.
É que os números positivos se iniciam pelo zero enquanto os negativos pelo -1!
Então os cinco primeiros números positivos seriam 0, 1, 2, 3 e 4.
Os cinco primeiros negativos são -1, -2, -3, -4 e -5.
*/

