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