# 📝 Dia 3: Estrutura de Repetição com `while`

No terceiro dia do desafio, foquei em estudar e praticar a estrutura de repetição `while` em Java.

## 🧠 Conceitos Revisados

Durante este dia, revisei os seguintes conceitos:

### ✍🏻 Estruturas de repetição `while` em Java

O `while` é uma estrutura de repetição em Java que executa um bloco de código enquanto uma condição específica é verdadeira. A sintaxe básica do `while` é:

```java
while (condição) {
    // código a ser repetido
}
```
- A condição é avaliada antes de cada iteração do loop. Se for verdadeira, o código dentro do loop é executado. Se for falsa, o loop é encerrado.
- É importante garantir que a condição seja eventualmente falsa para evitar loops infinitos.

Exemplo de uso do `while`:

```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contagem: " + contador);
    contador++;
}
```

Neste exemplo, o loop while imprime uma contagem de 0 a 4.

### ✍🏻 Exercícios Implementados

Durante o dia, implementei os seguintes exercícios para praticar estrutura de repetição `while`:
 - Os programas estão localizados na pasta `src/exercicios` do projeto.
   
1. **ContagemNumeros**
   - Este programa solicita ao usuário que digite um número inteiro positivo e, em seguida, imprime todos os números de 0 até o número digitado pelo usuário, utilizando um loop `while` para fazer essa contagem.
     
2. **ContagemRegressiva**
    - Neste programa, o usuário é solicitado a inserir um número inteiro. Em seguida, o programa imprime uma contagem regressiva a partir desse número até 0, utilizando um loop `while`.
      
3. **ContagemParImpar**
    - O programa pede ao usuário para inserir um número inteiro. Em seguida, ele conta e imprime a quantidade de números pares e ímpares entre 0 e o número inserido pelo usuário, utilizando um loop `while`.
      
4. **Tabuada**
    - Este programa solicita ao usuário que insira um número para visualizar a tabuada correspondente a esse número. Em seguida, o programa imprime a tabuada do número fornecido pelo usuário, multiplicando-o pelos números de 0 a 10 e exibindo os resultados.

##

> Os exercícios foram úteis para consolidar meus conhecimentos sobre a estrutura de repetição `while` em Java.
