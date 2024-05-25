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
