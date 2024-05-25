# 📝 Dia 6: Trabalhando com Listas & Estrutura de Repetição com `foreach`

No sexto dia do desafio, foquei em estudar e praticar Listas e a estrutura de repetição `foreach` em Java.

## 🧠 Conceitos Revisados

Durante este dia, revisei os seguintes conceitos:

### ✍🏻 Listas em Java
Em Java, uma `lista` é uma coleção ordenada de elementos que permite armazenar e manipular dados de forma flexível. As listas são amplamente utilizadas devido à sua capacidade de lidar com dados dinâmicos de maneira eficiente.
A interface mais comum para implementações de listas é a `List`, que define o comportamento básico de uma lista. Aqui está a sintaxe para declarar e inicializar uma lista em Java:
```java
import java.util.List;
import java.util.ArrayList; // Importe a classe ArrayList

// Declare e inicialize uma lista de inteiros usando ArrayList
List<Integer> numeros = new ArrayList<>();
```
Neste exemplo, estamos declarando uma lista chamada `numeros` do tipo `List<Integer>`, que pode armazenar números inteiros. Estamos inicializando a lista como um `ArrayList`, que é uma das implementações mais comuns da interface `List` em Java.
Outras implementações populares da interface `List` incluem `LinkedList` e `Vector`. Cada uma dessas implementações tem suas próprias características e é adequada para diferentes cenários de uso.

### ✍🏻 Exercícios Implementados
Durante o dia, implementei os seguintes exercícios para de `listas`:
 - Os programas estão localizados na pasta `src/exercicios/listas` do projeto.

1. **Exibir Elementos da Lista**:
      - Neste programa, declaramos uma `lista` e adicionamos algumas palavras a ela. Em seguida, usamos um loop para percorrer todos os elementos da lista e exibi-los na tela.
    
2. **Ordernar Lista em forma Crescente**:
    - Neste programa, declaramos uma lista de números desordenados e, em seguida, criamos uma nova lista para armazenar os mesmos elementos. Utilizamos o método `Collections.sort()` para ordenar a nova lista em ordem crescente. Por fim, exibimos tanto a lista original quanto a lista ordenada.
   
3. **Soma Elementos da Lista**:
   - Aqui, declaramos uma lista de números e iteramos sobre ela usando um loop. A cada iteração, somamos o valor do elemento atual à variável `sum`. Após percorrer todos os elementos da lista, exibimos a soma total na tela.
   
4. **Maior Numero da Lista**:
   - Neste programa, declaramos uma lista de números e inicializamos uma variável maior com o valor do primeiro elemento da lista. Em seguida, iteramos sobre a lista e, para cada número, verificamos se ele é maior que o valor armazenado em maior. Se for, atualizamos o valor de maior para esse número. No final, exibimos o maior número encontrado na lista.
   
5. **Transformando números negativos da lista em Zero**:
   - Aqui, declaramos uma lista de números e iteramos sobre ela usando um loop for. Em cada iteração, verificamos se o elemento atual é negativo. Se for, substituímos esse número por zero. No final, exibimos a lista atualizada na tela.
   
##

### ✍🏻 Estruturas de repetição `foreach` em Java
A estrutura de repetição `foreach` em Java oferece uma maneira conveniente de percorrer todos os elementos em uma coleção, como uma lista. Sua sintaxe básica é:

```java
for (Tipo elemento : colecao) {
    // Bloco de código a ser executado para cada elemento
}
```

Nesta estrutura:

- `Tipo` : O tipo de dados dos elementos na coleção.
- `elemento` : O nome da variável usada para armazenar temporariamente cada elemento da coleção durante a iteração.
- `colecao` : A coleção sobre a qual você está iterando.

> - A diferença principal entre o `foreach` em Java oferece uma sintaxe simplificada e conveniente para iterar sobre os elementos de uma coleção, eliminando a necessidade de gerenciar índices manualmente. Ele é mais fácil de usar e oferece uma verificação de tipo mais robusta durante a compilação. No entanto, o `foreach` pode não ser adequado para situações em que você precisa acessar índices específicos ou modificar elementos durante a iteração, nesses casos o `for` tradicional pode ser mais apropriado.

Exemplo de uso:
```java
 List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Exibindo cada número usando foreach
        for (int numero : numeros) {
            System.out.println(numero);
        }
```
Neste exemplo, estamos usando o foreach em Java para percorrer uma lista de números e imprimir cada elemento.

### ✍🏻 Exercícios Implementados
Durante o dia, implementei os seguintes exercícios para praticar a estrutura de repetição `foreach`:
 - Os programas estão localizados na pasta `src/exercicios/foreach` do projeto.

1. **Média da Lista**:
      - Neste exercicio, declaramos uma lista de números e a preenchemos com alguns valores. Em seguida, utilizamos um loop foreach para percorrer todos os elementos da lista e somamos cada elemento à variável sum. Depois de percorrer toda a lista, calculamos a média dividindo a soma total (sum) pelo tamanho da lista (lista.size()). Por fim, exibimos a média calculada na tela.

2. **Exibir Números Positivos da Lista**:
      - Neste exercicio, declaramos uma lista de números e percorremos cada elemento usando um loop foreach. Dentro do loop, verificamos se cada número é maior que zero. Se for, imprimimos o número na tela junto com uma mensagem indicando que ele é positivo. Assim, apenas os números positivos da lista são exibidos na saída.

3. **Procura se a lista contém o valor indicado**:
      - Neste exercicio, declaramos uma lista de palavras e um valor a ser procurado. Usando um loop foreach, percorremos cada elemento da lista e verificamos se ele é igual ao valor procurado. Se encontrarmos o valor, definimos uma variável como verdadeira e interrompemos o loop. No final, exibimos uma mensagem indicando se o valor foi encontrado ou não na lista. 
4. **Desestruturando Frase em lista**:
      - Neste exercicio,  uma frase é dada como uma string. Utilizamos o método split(" ") para dividir a frase em uma lista de palavras, onde cada palavra é um elemento da lista. Em seguida, percorremos a lista usando um loop foreach e imprimimos cada palavra na tela. Isso nos permite transformar a frase em uma lista de palavras.
5. **Concatenando Strings da lista**:
      - Neste exercicio, declaramos uma lista de palavras e a preenchemos com várias strings. Usamos um loop foreach para percorrer todos os elementos da lista e, para cada palavra, a concatenamos a uma string chamada frase. No final do loop, a string frase contém todas as palavras concatenadas. Este exemplo demonstra como concatenar strings de uma lista em uma única frase.

##

> Os exercícios foram úteis para consolidar meus conhecimentos sobre a estrutura de repetição `foreach` e Listas em Java.
