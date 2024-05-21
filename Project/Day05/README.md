# 📝 Dia 5: Estrutura de Repetição com `for` e Manipulações de Strings

No quinto dia do desafio, foquei em estudar e praticar manipulações de Strings e a estrutura de repetição `for` em Java.

## 🧠 Conceitos Revisados

Durante este dia, revisei os seguintes conceitos:

### ✍🏻 Estruturas de repetição `for` em Java

O `for` é uma estrutura de repetição em Java que executa um bloco de código um número específico de vezes. A sintaxe básica do `for` é a seguinte:

```java
for (int i = 0; i < limite; i++) {
    // código a ser repetido
} 
```
Nesta estrutura:

- `int i = 0:` inicializa uma variável de controle i com um valor inicial de zero.
- `i < limite:` verifica se a condição é verdadeira para continuar a execução do loop.
- `i++:` incrementa o valor da variável de controle após cada execução do bloco de código.
Dentro do bloco de código do for, você pode colocar as instruções que deseja repetir. O for é útil quando você sabe exatamente quantas vezes deseja repetir um bloco de código.

> - A diferença principal entre `for` e `while` é a sintaxe e a aplicação típica. O `for` é usado quando você sabe exatamente quantas vezes deseja repetir um bloco de código, enquanto o `while` é mais adequado quando você deseja repetir um bloco de código enquanto uma condição específica for verdadeira, mas o número de iterações não é conhecido antecipadamente.

Exemplo de Uso:
```java
for (int i = 1; i <= 5; i++) {
  System.out.println("Número: " + i);
}
```
Neste exemplo, o loop for imprime uma contagem de números de 1 a 5.

### ✍🏻 Exercícios Implementados

Durante o dia, implementei os seguintes exercícios para praticar a estrutura de repetição `for`:
 - Os programas estão localizados na pasta `src/exercicios/loopFor` do projeto.

1. **Contagem de Numeros de 1 até 100**
   - Este programa simplesmente conta de 1 a 100 e imprime cada número. Ele utiliza um loop for para iterar de 1 a 100 e imprimir cada valor.
2. **Soma de Numeros de 1 até 100**
   - Este programa calcula a soma de todos os números de 1 a 100. Ele utiliza um loop for para iterar de 1 a 100 e adiciona cada número à variável de soma. 
3. **Tabuada**
   - Este programa solicita ao usuário um número e imprime a tabuada desse número de 1 a 10. Ele utiliza um loop for para iterar de 1 a 10 e calcula o produto do número fornecido pelo contador do loop em cada iteração.
4. **Fatorial**
   - Este programa calcula o fatorial de um número fornecido pelo usuário. O fatorial de um número é o produto de todos os números inteiros positivos menores ou iguais a ele. Ele utiliza um loop for para iterar de 1 até o número fornecido e calcular o fatorial.
5. **Sequencia Fibonacci**
   - Este programa solicita ao usuário o número de termos da sequência de Fibonacci que deseja visualizar e imprime os primeiros termos dessa sequência. A sequência de Fibonacci é uma sequência de números onde cada número é a soma dos dois números anteriores. Ele utiliza um loop for para iterar até o número de termos especificado pelo usuário e calcular os termos da sequência.
