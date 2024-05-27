# 📝 Dia 7: Trabalhando com Arrays e Estrutura Switch

No sétimo dia do desafio, foquei em estudar e praticar Arrays e a Estrutura do Switch.

## 🧠 Conceitos Revisados

Durante este dia, revisei os seguintes conceitos:

### ✍🏻 Array em Java
Em Java, um array é uma estrutura de dados que pode ***armazenar múltiplos valores de um mesmo tipo*** em uma única variável. É uma forma eficiente de agrupar e manipular grandes conjuntos de dados. Veja a sintaxe:
```java
// Declaração de um array de inteiros
// tipo[] nomeArray
int[] numeros;
```
Exemplo de uso:
```java
// Declaração de um array de inteiros
int[] numeros;

// Inicialização do array com 5 elementos
numeros = new int[5];

// Outra forma de declarar e inicializar um array
int[] maisNumeros = {1, 2, 3, 4, 5};

// Acessando elementos do array
System.out.println(maisNumeros[0]); // Saída: 1
System.out.println(maisNumeros[3]); // Saída: 4

// Alterando um elemento no array
maisNumeros[2] = 10;
System.out.println(Arrays.toString(maisNumeros)); // Saída: [1, 2, 10, 4, 5]
```

> Diferença de um array para lista:

| Diferenças            | Arrays                                      | Listas (por exemplo, ArrayList)                   |
|-----------------------|---------------------------------------------|---------------------------------------------------|
| **Tamanho**           | Tamanho fixo, definido na criação.          | Tamanho dinâmico, pode crescer ou diminuir.       |
| **Tipos Armazenados** | Podem armazenar tipos primitivos e objetos. | Armazenam apenas objetos, não tipos primitivos.   |
| **Acesso**            | Acesso direto por índice.                   | Acesso através de métodos como `get()`.           |
| **Funcionalidades**   | Funcionalidades limitadas.                  | Oferecem métodos para inserção, remoção, busca, etc. |
| **Eficiência**        | Eficiente em termos de memória e acesso.    | Menos eficiente em termos de memória e acesso.    |


### ✍🏻 Exercícios Implementados
Durante o dia, implementei os seguintes exercícios para de `arrays`:
 - Os programas estão localizados na pasta `src/exercicios/arrays` do projeto.

1. **Somar Elementos do Array**:
    - Este programa percorre todos os elementos de um array de inteiros, soma-os e exibe o resultado na tela. É útil para calcular o total de uma série de números.
2. **Contando Pares e Impares**:
    - Este programa itera sobre os elementos de um array e conta quantos deles são pares e quantos são ímpares. Em seguida, exibe essas contagens na tela.
3. **Obtendo a Média**:
    - Este programa percorre todos os elementos de um array, soma-os e, em seguida, divide a soma pelo número de elementos para calcular a média. O resultado é exibido na tela.
4. **Obtendo Maior e Menor**:
     - Este rograma percorre o array para encontrar e exibir o menor e o maior elemento presente.
5. **Invertendo Array**:
     - Este programa inverte os elementos de um array, trocando os elementos da primeira metade com os da segunda metade. O resultado é exibido na tela.
##

### ✍🏻 Estrutura `switch` em Java
Em Java, a estrutura `switch` permite a execução condicional de código com base no valor de uma expressão. Cada caso no `switch` é comparado com a expressão, e se uma correspondência for encontrada, o código associado é executado. **Sintaxe:**
```java
switch (expressao) {
    case valor1:
        // código
        break;
    case valor2:
        // código
        break;
    // outros casos
    default:
        // código
}
```
Exemplo de Uso:
```java
int escolha = 1; // Pode ser 1 ou 2

        switch (escolha) {
            case 1:
                System.out.println("Iniciar");
                break;
            case 2:
                System.out.println("Parar");
                break;
            default:
                System.out.println("Escolha inválida");
                break;
        }
```
Explicação:
- Declaração da Variável: int escolha = 1; - Aqui, a variável escolha é definida como 1.
- Estrutura switch:
    - Caso 1: Se escolha for 1, imprime "Iniciar".
    - Caso 2: Se escolha for 2, imprime "Parar".
    - Caso Padrão: Se escolha não for nem 1 nem 2, imprime "Escolha inválida".

### ✍🏻 Exercícios Implementados
Durante o dia, implementei os seguintes exercícios para de `switch`:
 - Os programas estão localizados na pasta `src/exercicios/switchs` do projeto.

1. **Verificando dias da semana**:
    - Este programa utiliza a estrutura switch para determinar o nome do dia da semana com base no número fornecido (1 para domingo, 2 para segunda-feira, etc.). 
2. **Verificando meses do ano**:
    - Este programa utiliza switch para determinar o nome do mês com base no número fornecido (1 para janeiro, 2 para fevereiro, etc.).
3. **Classificando Notas**:
    - Este programa usa a estrutura switch para classificar a Nota (A, B, C, D, F).
4. **Calculadora Simples**:
    - Este programa utiliza a estrutura switch para realizar operações aritméticas básicas (adição, subtração, multiplicação e divisão) com base na escolha do usuário.
5. **Menu de Opções**:
    - Este programa apresenta um menu de opções ao usuário, permitindo verificar o saldo, fazer depósitos, saques e sair do programa. Utiliza a estrutura switch para gerenciar as escolhas do usuário.

##

> Os exercícios foram úteis para consolidar meus conhecimentos sobre a estrutura de `switch` e Arrays em Java.
