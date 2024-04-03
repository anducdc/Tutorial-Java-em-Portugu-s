/* TIPOS NÃO PRIMITIVOS DO JAVA

Tipos não primitivos são conhecidos como tipos por referência pois eles se referem
a objetos.
As principais diferenças entre tipos de dados primitivos e não primitivos são:

	-Tipos primitivos são pré-definidos em Java. Tipos não primitivos são criados
pelo programador e não definidos pelo Java (com exceção de String).

	-Tipos não primitivos podem ser usados para chamar métodos para executar certas
operações equanto tipos primitivos não podem.

	-Tipo primitivo sempre possui um valor enquanto não primitivos podem ser 
nulos (null).

	-Primitivos sempre se iniciam com letras minúsculas (int, float, char...) 
enquanto não primitivos se iniciam com letra maiúscula (String...).


Exemplos de não primitivos são Strings, Arrays, Classes, Interface etc.
Estudaremos isso no futuro. 
	
 */
public class Parte04_4 {

	public static void main(String[] args) {
		int minhaIdade = 33;
		String meuNome = "Anderson";
		
		System.out.println("Meu nome é " + meuNome + " e eu tenho " + minhaIdade + " anos de idade!");

	}

}
