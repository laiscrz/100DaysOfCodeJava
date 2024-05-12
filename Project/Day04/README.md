# 📝 Dia 4: Estrutura de Repetição com `do-while`

No quarto dia do desafio, foquei em estudar e praticar a estrutura de repetição `do-while` em Java.

## 🧠 Conceitos Revisados

Durante este dia, revisei os seguintes conceitos:

### ✍🏻 Estruturas de repetição `do-while` em Java

O `do-while` é uma estrutura de repetição em Java que executa um bloco de código pelo menos uma vez e depois verifica se a condição é verdadeira para continuar a execução. A sintaxe básica do `do-while` é a seguinte:

```java
do {
    // código a ser repetido
} while (condição);
```

- A diferença principal entre o `do-while` e o `while` é que o `do-while` garante que o bloco de código seja executado pelo menos uma vez, mesmo se a condição inicial for falsa.
- A condição é avaliada após cada iteração do loop. Se for verdadeira, o código dentro do loop continua a ser executado. Se for falsa, o loop é encerrado.

Exemplo de uso do `do-while`:

```java
int contador = 0;
do {
    System.out.println("Contagem: " + contador);
    contador++;
} while (contador < 5);

```
Neste exemplo, o loop do-while imprime uma contagem de 0 a 4.

### ✍🏻 Exercícios Implementados

Durante o dia, implementei os seguintes exercícios para praticar a estrutura de repetição `do-while`:
 - Os programas estão localizados na pasta `src/exercicios` do projeto.

1. **Contagem**
   - Este programa solicita ao usuário que digite um número e, em seguida, imprime todos os números de 0 até o número digitado pelo usuário, utilizando um loop `do-while` para fazer essa contagem.

2. **ContagemParImpar**
   - Este programa solicita ao usuário que insira números e conta a quantidade de números pares e ímpares inseridos, utilizando um loop `do-while`.

3. **SomaNumPositivo**
   - Este programa solicita ao usuário que insira números positivos e calcula a soma desses números, utilizando um loop `do-while`.

4. **VerificarPositivoNegativo**
   - Este programa solicita ao usuário que insira números e conta a quantidade de números positivos e negativos inseridos, utilizando um loop `do-while`.

##

> Os exercícios foram úteis para consolidar meus conhecimentos sobre a estrutura de repetição `do-while` em Java.
