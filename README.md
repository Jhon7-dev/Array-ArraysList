## Estudos: Arrays e ArrayLists em Java

Este repositório contém exercícios e anotações do Capítulo sobre Arrays e ArrayLists, focado em consolidar a lógica de programação e manipulação de coleções em Java.

## Objetivos de Aprendizagem

Neste capítulo, os principais objetivos são:

Entender o que são arrays e como utilizá-los.

Declarar, inicializar e percorrer arrays em Java.

Passar arrays como argumentos em métodos.

Trabalhar com arrays multidimensionais.

Utilizar argumentos de comprimento variável (varargs).

Explorar a classe Arrays da API Java.

Introduzir o uso de ArrayLists e suas vantagens sobre arrays.
## CLASSE InitiArray
Exemplo Básico de Inicialização de Array em Java
Este arquivo contém a classe InitArray.java, um exemplo fundamental para demonstrar como um array de inteiros é declarado, alocado e inicializado automaticamente com valores padrão em Java.

# Objetivo
O objetivo principal deste código é ilustrar:

A sintaxe de declaração e alocação de um array de tipo primitivo (int).

O valor padrão (0) atribuído automaticamente a todos os elementos de um array de inteiros quando ele é criado (new int[10]).

O uso do método System.out.printf para formatar e alinhar a saída de dados em colunas.

# Funcionamento da Classe InitArray
A classe executa os seguintes passos:

Declaração: Cria um array de inteiros chamado array com um tamanho de 10 posições.

Inicialização Automática: Devido à natureza dos tipos primitivos em Java, todas as 10 posições são definidas automaticamente com o valor zero (0).

Iteração: Um loop for percorre o array do índice 0 até o 9.

Impressão Formatada: Dentro do loop, o índice (i) e o valor (array[i]) são impressos, usando especificadores de largura (%5d e %8d) para garantir uma tabela organizada.

Ótimo! Este código é uma continuação do exemplo anterior, mostrando como inicializar um array com valores literais.

Aqui está um modelo de README.md que descreve a classe InitArray2 e destaca a principal diferença em relação ao código anterior.

## Exemplo de Inicialização de Array com Valores Literais
Este módulo apresenta a classe InitArray2.java, que demonstra a forma concisa de inicializar um array de inteiros usando uma lista de valores literais no momento da declaração.

# Objetivo
O principal objetivo deste código é:

Ilustrar a sintaxe simplificada para inicializar um array com dados predefinidos (sem precisar do operador new se a lista for fornecida na mesma linha).

Continuar praticando o uso de System.out.printf para formatar e alinhar a saída de dados em colunas.

# Funcionamento da Classe InitArray2
A classe executa os seguintes passos:

Inicialização: O array array é declarado e imediatamente preenchido com dez valores inteiros específicos:

Java

int array[] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
Iteração: Um loop for percorre o array, de 0 até o seu comprimento (array.length).

Impressão Formatada: O índice (i) e o valor armazenado em array[i] são impressos usando especificadores de largura (%5d e %8d) para criar uma tabela organizada.

# Comparação com InitArray
Enquanto o primeiro exemplo (InitArray) dependia da inicialização padrão de Java (preenchendo com zeros), este exemplo demonstra a inicialização explícita. Isso é ideal para arrays que precisam começar com um conjunto de dados fixo ou de teste.

## Exemplo de Inicialização de Array com Cálculo
Este módulo apresenta a classe InitArray3.java, que demonstra como preencher um array de inteiros usando uma fórmula matemática dentro de um loop de repetição, em vez de depender de valores padrão ou literais.

# Objetivo
O principal objetivo deste código é ilustrar:

O uso da palavra-chave final para declarar uma constante (ARRAY_LENGTH), promovendo a legibilidade e a manutenção do código.

A inicialização de cada elemento do array com base em um cálculo sequencial: valor=2+2× 
ı índice.

A impressão formatada dos resultados.

## Simulação de Lançamento de Dado (RollDie)
Este módulo contém a classe Rolldie.java, que simula o lançamento de um dado de seis lados e rastreia a frequência com que cada face aparece.

# Objetivo
O objetivo principal deste código é:

Demonstrar o uso da classe java.util.Random para simular eventos aleatórios.

Utilizar um array para contagem de frequência, onde o índice do array representa a face do dado.

Praticar a impressão formatada de dados usando System.out.printf.

# Funcionamento e Lógica
1. Inicialização
Random randomNumbers = new Random();: Cria um objeto para gerar números pseudoaleatórios.

int frequency [] = new int [7];: Cria um array para armazenar a contagem. O tamanho é 7 para que os índices de 1 a 6 (faces do dado) sejam usados, ignorando o índice 0.

## Análise de Respostas de Alunos (StudentPoll)
Este módulo contém a classe StudentPoll.java, que demonstra como usar arrays para coletar e analisar a frequência de respostas de uma pesquisa simples (notas de 1 a 10).

# Objetivo
O objetivo principal deste código é ilustrar um caso de uso prático para arrays:

Processamento de Dados: Utilizar um array de frequência para consolidar dados brutos (as notas individuais) em um relatório estatístico (a contagem total de cada nota).

Mapeamento de Índice: O array de frequência é criado com um tamanho extra (11) para que cada índice corresponda diretamente ao valor da nota (índices 1 a 10), facilitando a leitura e o acesso.

# Funcionamento da Classe
O código é dividido em três etapas principais:

1. Dados de Entrada
O array responses armazena as 40 notas individuais dadas pelos alunos (valores de 1 a 10).

O array frequency é inicializado com tamanho 11 (new int[11]). As posições frequency[1] a frequency[10] serão usadas para armazenar a contagem de cada nota, enquanto a posição frequency[0] será ignorada

## Soma de Elementos de Array (SumArray)
Este módulo apresenta a classe SumArray.java, que demonstra o processo de cálculo do somatório de todos os valores contidos em um array de inteiros.

# Objetivo
O objetivo principal deste código é ilustrar:

A inicialização de um array com uma lista de valores literais.

O uso de uma variável acumuladora (total) para armazenar o resultado da soma.

O percorrimento de todos os elementos do array utilizando um loop simples (for).

# Funcionamento da Classe
A lógica da soma é realizada em duas etapas:

Inicialização: O array array é declarado com 10 valores predefinidos. A variável total é inicializada como 0.

Acumulação: O loop for itera por cada elemento do array. Em cada iteração, o valor do elemento atual (array[i]) é adicionado à variável total:

## Estudo de Caso: Simulação de Baralho de Cartas (DeckOfCards)
Este projeto implementa o clássico estudo de caso de simulação de um baralho de 52 cartas em Java, utilizando Orientação a Objetos e Arrays para gerenciar as operações de criação, embaralhamento e distribuição de cartas.

# Objetivo
O objetivo principal é demonstrar os seguintes conceitos de programação e estrutura de dados:

Modelagem OO: Criação de classes (Card, DeckOfCards) para representar objetos do mundo real.

Arrays de Objetos: Utilização de um array (deck) para armazenar instâncias da classe Card.

Algoritmo de Embaralhamento: Implementação de um algoritmo de passagem única para randomizar a ordem das cartas.

Simulação: Gerenciamento do estado do baralho (currentCard) para simular a distribuição sequencial de cartas.

# Estrutura do Projeto
O projeto é composto por três classes essenciais, todas localizadas no pacote EstudoDeCasoEmbaralhamento:

1. Card.java (Modelagem do Objeto)
Esta classe representa uma única carta no baralho.

Atributos: face (ex: "Ace", "King") e suit (ex: "Hearts", "Spades").

Método: toString() para formatar a saída da carta (ex: "Ace of Spades").

2. DeckOfCards.java (Lógica Principal)
Esta é a classe que gerencia a coleção das 52 cartas.

Construtor: Inicializa o array deck e o preenche com 52 objetos Card válidos, combinando todas as faces e naipes. A lógica de inicialização usa os operadores módulo (%) e divisão (/) para mapear corretamente os 13 faces e 4 naipes.

shuffle(): Implementa o algoritmo de embaralhamento. ⚠️ Nota: O loop dentro do método shuffle() está incompleto (falta a linha que completa a troca dos valores), o que pode levar a resultados incorretos.

dealCard(): Distribui a próxima carta do topo do baralho e incrementa o índice currentCard.

3. DeckOfCardsTest.java (Execução)
Esta classe é o ponto de entrada da aplicação para testar a funcionalidade do baralho.

Instancia um DeckOfCards.

Chama shuffle() para embaralhar.

Usa um loop para chamar dealCard() 52 vezes (em grupos de 4) para simular a distribuição completa do baralho em 13 rodadas, imprimindo-as em colunas formatadas.
