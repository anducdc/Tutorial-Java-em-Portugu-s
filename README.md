Aprendendo Java com Anderson Alves - Janeiro, 2024

-OBJETIVO DO ESTUDO-
Decidi iniciar esse pequeno "tutorial" da linguagem Java com o objetivo de ajudar aqueles que estão começando a se interessar ou tem que aprender por conta da faculdade, emprego ou quaisquer outros motivos. Além disso é uma boa desculpa para poder adicionar alguma coisa ao meu portifólio e voltar a praticar esta linguagem e suas IDEs, coisa que não tenho feito há algum tempo.
Meu objetivo é seguir a lógica da documentação do site W3Schools.com, site inteiramente em inglês, e trazer esses ensinamentos para a linguagem Português do Brasil, porém incluindo meus próprios códigos, exemplos e comentários nos arquivos e sem "plagiar" o que aquele site faz. Gosto da forma como as linguagens são ensinadas por lá e a ordem das coisas, que chega a ser um pouco diferente do que vi em algumas instituições de ensino superior, embora todas as formas que já estudei tenha sido bastante funcionais, independente da metodologia. É importante frisar que eu NÃO sou um profissional da área e sim um estudante, assim como você também provavelmente é.
Sendo assim é mais justo visualizar esses arquivos como se tivessem sido produzidos por um amigo que já está avançado no estudos, não por um Sênior da programação ou coisa do tipo.
Gosto de usar exemplos conhecidos do meio Geek/Nerd para ajudar a visualização de como algumas coisas podem funcionar, mesmo que basicamente, mas você não precisa estar por dentro dessas coisas para prosseguir com o conteúdo que será disponibilizado.

-O QUE EU PRECISO SABER ANTES DE COMEÇAR-
Eu recomendaria aprender algumas coisas antes de seguir o que será ensinado por aqui. Inicialmente Algoritmo e Lógica de Programação são os mandatórios. Em seguida, eu pessoalmente recomendaria o estudo da linguagem C. Com essa bagagem será apenas necessário traduzir o conhecimento para uma linguagem diferente, que no caso é o Java. 
Se você já tiver uma boa base em outras tecnologias de programação, como C#, Python e mais, então provavelmente já estará apto a iniciar este pequeno "curso" também.
Você também precisará de um computador que execute Java. Não há necessidade de conexão com a internet já tendo o quue for necessário na máquina, inclusive se você tiver baixado esses arquivos anteriormente.Eu não recomendaria programar pelo celular por diversos motivos a não ser que você realmente não tenha outra opção e esteja desesperado. Ou seja, apenas em último caso mesmo.
Também gostaria de mencionar a necessidade de entender o que é uma IDE e JDK. Eu realmente não pretendo explicar o que é tudo desde esses pontos básicos, mas sim focar na programação em si. Caso você esteja boiando nesses termos e por onde começar a estudar desenvolvimento e tudo o que eu mencionei antes, bem, a internet está lotada de cursos de todos os tipos e a minha recomendação é iniciar pela documentação (como a do site W3Schools.com e afins) ou acompanhar algum(s) canal(s) no YouTube, como o famoso Curso em Vídeo, que vai te ensinar essa sopa de letrinhas e os primeiros passos de download e instalação na sua máquina antes de finalmente programar e produzir alguma coisa.
Apenas lembre-se de que desenvolver programa depende mais do que tudo de por as mão na massa e fazer acontecer, mesmo aquilo que parecer simples ou óbvio e apenas assistir vídeos ou ler textos não vai te ajudar muito (fora que no dia seguinte você vai esquecer até do mais fácil).
Para quem tiver curiosidade eu estarei trabalhando com a IDE Eclipse (ou NetBeans, caso seja necessário) no Linux Ubuntu, mas você pode usar a que você quiser, como a IntelliJ. Eu não recomendaria o uso da Visual Studio Code para Java.
No final das contas a IDE que você usar ou o Sistema Operacional nã devem fazer diferença para o que vamos começar aqui, ok?

-CONTEÚDO-
Esta é a lista do que o site W3Schools.com ensina de Java em sua ordem, em tradução livre:
01-Introdução
02-Iniciando Java
03-Sintaxe
04-Saídas do Usuário (Métodos de Saída)
05-Comentários
06-Variáveis
07-Tipos da Dados
08-Conversáo de Tipos
09-Operadores
10-Strings (Texto)
11-Cálculos
12-Booleano
13-Estruturas Condicionais If e Else
14-Switch
15-Laços de Repetição com While e Do/While
16-Laços de Repetição com For
17-Laços de Repetição com Break/Continue
18-Arranjo/Vetor (Arrays)
19-Métodos
20-Parâmetros de Métodos
21-Sobrecarga de Métodos
22-Escopo
23-Recursão
24-Programação Orientada a Objeto
25-Classes/Objetos
26-Atributos de Classe
27-Construtores
28-Modificadores
29-Encapsulação
30-Pacotes/API
31-Polimorfismo
32-Classes Internas
33-Abstração
34-Interface
35-Enums
36-Entrada do usuário (Métodos de Entrada)
37-Data
38-ArrayList
39-LinkedList
40-HashMap
41-Iterator
42-Classes Wrapper
43-Exceções
44-RegEX
45-Threads
46-Lambda
+ Alguns outros tópicos.

Para o leigo todos estes tópicos podem parecer muita coisa, mas isso é muito relativo. Você perceberá que na verdade, até certo ponto, o aprendizado de cada um deles é até bem rápido. O que realmente pode ser desafiador é resolver alguns problemas, bugs ou criar soluções de acordo com a demanda. É aí que a Lógica de Programação demonstra a sua importância e como usar as ferramentas que você tem para alcançar o que é necessário. Mas vamos tratando isso ao decorrer do nosso tempo junto.
Uma outra recomendação é ir estudando aos poucos ao invés de sair atropelando tudo, sobretudo quando parecer fácil. Lembre-se: programação é sobre programar, digitar, experimentar com valores diferentes, se perguntar o que aconteceria se você mudasse algo ou até se apagasse. Seu código deu erro? Procure saber porque ele não funciona. Será que você apenas esqueceu de um ponto e vírgula ou digitou algo errado? Os porquês são muito importantes para realmente dominar na programação e saber resolver os tão comuns bugs.
Quando estudar um tópico, procure por exercícios relacionados online ou mesmo pense em criar algo parecido mas com uma função diferente. Se você aprendeu a criar uma calculadora de somar, experimente criar uma de subtrair, multiplicar ou dividir. Procure também tentar burlar a lógica do que você criou e imaginar coisas como "e se o usuário digitasse 0.1 + 0,1 ao invés de 1 + 1?"
Se você criou um programa que conta de 1 até 1000, tente criar um que conte de 100 até 1. Sério, esse tipo de curiosidade é muito importante!

-CONSIDERAÇÕES FINAIS E CONTATO-
Mais uma vez, esse "curso" tem como objetivo ensinar Java de forma simplificada e com exemplos comentados e diretos ao ponto ao mesmo tempo que me desenferruja do tempo longe do Java e do Github/Git. Eu não sei com que frequência novos arquivos serão postados no repositório mas tentarei ao menos o fazer diariamente, visto que pretendo colocar algum capricho em cada conteúdo. Esqueci de mencionar mas todo esse conteúdo é GRATUITO e disponibilizado em https://github.com/anducdc. Se você pagou por ele, você foi enganado!
O Java é uma linguagem que afasta muitos profissionais pela sua verbosidade que deixa as linhas recheadas de palavras aqui e ali e outras coisinhas que os programadores mais "casuais" não gostam tanto. Por conta disso é uma tecnologia com alta demanda e bons salários.
Também é o tipo de coisa para quem quer trabalhar com sistemas e não seria muito interessante perder seu tempo com ela se seu objetivo é trabalhar com desenvolvimento de jogos, por exemplo. Tenha isso em mente! E tenha em mente também os seus objetivos com a programação ao invés de escolher tecnologias ao acaso já que esses estudos podem demandar bastante tempo!
Para finalizar, pode ser que alguns arquivos contenham erros aqui e ali, sobretudo com informações pessoais que eu adicionar (como nos comentários explicativos do conteúdo), então se você achar necessário pode me enviar um e-mail em anducdc@gmail.com
Use também essa forma de contato caso queira tirar dúvidas, pedir umas dicas ou simplesmente conversar. Tentarei responder o mais rápido possível, ok?
Todo o conteúdo disponibilizado nessas aulas é permitido a ser usado com fins didáticos.
Mais uma vez: anducdc@gmail.com

Espero que tenhamos uma ótima jornada de Java pela frente! Vamos nos divertir um pouco? Bons estudos a todos!
