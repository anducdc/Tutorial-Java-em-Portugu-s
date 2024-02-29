//IMPRIMINDO NÚMEROS
//Além de texto cercado por aspas, também é possível imprimir números.
//Neste caso nao há a necessidade de adiccionar aspas, embora também seja possível.
//Números sem aspas serao tratados como números e podem ser usados para cálculos.
//Números com aspas sao tratados como texto, algo que veremos no futuuro com calma.
//Execute o programa abaixo e veja o quue acontece com cada impreessão:


public class Parte01_3 {

	public static void main(String[] args) {
		System.out.println(15);
		System.out.println(150);
		System.out.println(15 + 15);
		System.out.println(150 + 150);
		
		System.out.println("15");
		System.out.println("15" + "15");
		System.out.println("15 + 15");

	}

}

//Perceba que as duas primeiras linhas imprimiram normalmente os números desejados.
//As linhas três e quatro imprimiram o resultado dos cálculos em questao.
//As três últimas linhas são diferentes e trazem esses valores como texto.
//A linha como os valores 15 e "15" são diferentes, sendo que a primeira é um
//numeral e a segunda uum texto, nao podendo servir como base de cálulos.

//Basta imaginar que 15 + 20 são números que trariam o resultado 35 enquanto 
//calcular Jacaré + Urso simplesmente nao faz sentido.

//A penúltima linha entao trará o resultado 1515 pois a soma de dois textos apenas
//os junta, assim como "Jacaré + Urso" resultaria em JacaréUrso.

//A última linha apenas mostra todo o texto entre as aspas, sem cálculos: 15 + 15.
//Esta linha poderia conter uma palavra, uma frase, uma parágrafo etc.
