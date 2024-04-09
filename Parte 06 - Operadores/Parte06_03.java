/*OPERADORES DE ATRIBUIÇÂO

Usamos desses operadores para atribuirmos valores às variáveis. Esse é um dos
operadores mais comuns e já o vimos diversas vezes aqui apenas declarando 
variáveis, como o uso do = para atribuição:
	int x = 10		//não pronunciamos "igual" mas sim "recebe". X recebe 10.
	
Usamos o operador de atribuição de adição (+=) para adicionar valores às variáveis:
	int x = 10;
	int += 5;		//a variável x agora terá o valor de 15
	
Uma lista de operadores de atribuição:

OPERADOR			EXEMPLO			O MESMO QUE
	=				x = 5			x = 5
	+=				x += 3			x = x + 3
	-+				x -+ 3			x = x - 3
	*=				x *= 3			x = x * 3
	/=				x /= 3			x = x / 3
	%=				x %= 3			x = x % 3
	&=				x &= 3			x = x & 3
	|=				x |= 3			x = x | 3
	^=				x ^= 3			x = x ^ 3
	>>=				x >>= 3			x = x >> 3
	<<=				x <<= 3			x = x << 3
 */
public class Parte06_03 {

	public static void main(String[] args) {
		int minhaIdade = 33;
		int idadeBenjaminBurton = 25;
		
		minhaIdade += 3;
		idadeBenjaminBurton -= 3;
		System.out.println(minhaIdade);
		System.out.println(idadeBenjaminBurton);

	}

}
/*
Eu imagino que alguns dos operadores, fora os básicos, não façam muito sentido
agora para iniciantes como |=, ^= ou >>=.
Neste momento o mais importante é entender a lógica do que está sendo feito e você
pode focar na primeira metade daquela tabela para isso.
Eu recomendaria brincar um pouco com esse código acima e entender os resultados
que o console retorna. Mude os operadores += e -= e também os valores já que só
segui o exemplo e adicionei o número 3.
*/