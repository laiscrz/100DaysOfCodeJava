# 📝 Dia 2: Estrutura Condicionais & Trabalhando com Datas

No segundo dia do desafio, foquei em aprender sobre estruturas condicionais em Java e como trabalhar com datas.

## 🧠 Conceitos Revisados

Durante este dia, revisei os seguintes conceitos:

### 🗒️ Estruturas Condicionais em Java

As estruturas condicionais, como `if`, `else if` e `else`, são utilizadas para tomar decisões com base em condições específicas. A sintaxe básica é:

```java
if (condicao1) {
    // Bloco de código executado se a condição1 for verdadeira
} else if (condicao2) {
    // Bloco de código executado se a condição2 for verdadeira
} else {
    // Bloco de código executado se nenhuma das condições anteriores for verdadeira
}
```
### 📅 Trabalhando com Datas em Java
#### 🏷️ LocalDate
Em Java, podemos usar a classe `LocalDate` do pacote `java.time` para representar uma data específica. 
Essa classe é útil quando precisamos lidar apenas com a data, sem se preocupar com a hora ou o fuso horário. 
Podemos obter a data atual usando o método `now()`.

- Exemplo de obtenção da data atual com `LocalDate`:
```java
LocalDate dataAtual = LocalDate.now();
```

#### 🏷️ Calendar
A classe `Calendar` também pode ser usada para manipular datas em Java. No entanto, a diferença entre `LocalDate` e `Calendar` é que `LocalDate` representa 
apenas uma data, enquanto Calendar representa um ponto no tempo, incluindo data, hora e fuso horário.

- Exemplo de obtenção do ano atual com Calendar:
```java
Calendar calendar = Calendar.getInstance();
int anoAtual = calendar.get(Calendar.YEAR);
```

> Portanto, se precisarmos trabalhar apenas com a data, é mais recomendável usar LocalDate, pois oferece uma interface mais simples e direta para manipulação de datas. 
Por outro lado, se precisarmos lidar com data e hora ou precisarmos de mais flexibilidade com fuso horário, podemos recorrer a Calendar.

## ✍🏻 Exercícios Implementados

Durante o dia, implementei os seguintes exercícios para praticar estruturas condicionais e trabalhar com datas:
- Os programas estão localizados na pasta `src/exercicios` do projeto.

1. **CarroIdade**
   - Este programa determina a idade de um carro com base no ano de compra e classifica como novo, semi novo ou usado.

2. **MaiorNumero**
   - Um programa que solicita três números do usuário e determina o maior deles.

3. **MenorNumero**
   - Este programa solicita três números do usuário e determina o menor deles.

4. **VerificarNumero**
   - Um programa que verifica se um número fornecido é positivo, negativo ou zero.

5. **VotoIdade**
   - Determina se uma pessoa é maior de idade com base no ano de nascimento e no ano atual, para verificar se pode votar.
     
##

> Os exercícios foram úteis para consolidar meus conhecimentos sobre estruturas condicionais e prática na manipulação de datas em Java.
