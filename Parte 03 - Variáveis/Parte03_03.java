/*É possível criar uma variável sem atribuir um valor e só o fazer depois.
 Um exemplo disso seria algo como pedir para o usuário digitar alguma informação, o seu
 programa então faz algum cálculo em cima dessa informação e então o resultado desse
 cálculo ser salvo em uma variável que até então estava sem valor.
 Você poderia pedir que a pessoa digite o valor de seu salário e então trabalhar em
 cima disso:
 
 */

public class Parte03_03 {

	public static void main(String[] args) {
		int salarioMes;
		int salarioAno = salarioMes * 12;
		
		System.out.println("Seuu salário anual é de " + salarioAno);

	}

}

/*Nesse caso o programa está incompleto pois não foi adicionado ao programa o código
que permite que o usuário digite o seu salário mensal e esse número fosse guardado na
variável que chamei de salarioMes.
Mas se tivesse feito isso, a variável salarioAno auutomaticamente já faria o cálculo dos
ganhos anuais deste usuário.

Vocẽ provavelmente já entendeu a lógica aqui: o valor de salarioAno é simplesmente o
valor dado em salarioMes multiplicado por 12, que é a quantidade de meses de um ano.
Sendo assim ao digitar o valor de uma variável já teríamos automaticamente o valor de
outra. Você poderia até criar algo como salarioDecada para calcular 10 anos de salário
ou qualquer coisa do tipo usando apenas de lógica e criando uma nova variável.
 
Vou encorajar vocễ a mexer um pouco nesse pequeno código acima. Você pode começar
atribuindo um valor à variável salarioMes e executando o programa para descobrir o
quanto voce ganharia num ano.
Isso pode ser feito de duas formas:
	na mesma linha
		int salarioMes = 1200;
		int salarioAno = salarioMes * 12;
		
		System.out.println("Seuu salário anual é de " + salarioAno);
		
	ou numa linha nova, apenas referenciando o nome da variável

		int salarioMes;
		salarioMes = 1200;
		int salarioAno = salarioMes * 12;
		
		System.out.println("Seuu salário anual é de " + salarioAno);

ATENÇÃO: na forma atual o programa retornará um erro pelo fato de salarioMes não ter
um valor atribuído.
 */