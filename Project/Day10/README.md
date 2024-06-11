# 📝 Dia 10: Conceitos Avançados de Programação Orientada a Objetos em Java - `protected`, `abstract` e `final`

No décimo dia do desafio, foquei em estudar `protected`, `abstract` e `final` derivados de POO.

## 🧠 Conceitos Revisados

Durante este dia, revisei os seguintes conceitos:

### ✍🏻 `protected` em Java
Em Java, o modificador `protected` é um nível de acesso que permite que membros (métodos e variáveis) de uma classe sejam acessados por classes dentro do mesmo pacote ou por subclasses (mesmo que estejam em pacotes diferentes).

```java
package com.example;

// Classe pai com membros protegidos
public class Animal {
    protected String nome; // Variável protegida

    protected void emitirSom() { // Método protegido
        System.out.println("Som do animal");
    }
}

// Subclasse que herda da classe pai
public class Cachorro extends Animal {
    public void mostrarNome() {
        System.out.println(nome); // Acesso à variável protegida da superclasse
    }

    public void latir() {
        emitirSom(); // Acesso ao método protegido da superclasse
        System.out.println("Au au");
    }
}
```

### ✍🏻 `abstract` em Java
Em Java, o modificador `abstract` é utilizado para declarar uma classe abstrata ou um método abstrato. Uma classe abstrata não pode ser instanciada diretamente (não pode criar objetos dessa classe), e um método abstrato não possui implementação na classe abstrata (a implementação é fornecida pelas subclasses).

```java
public abstract class Animal {
    protected String nome;

    public abstract void emitirSom(); // Método abstrato
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
```

### ✍🏻 `final` em Java
Em Java, o modificador `final` pode ser aplicado a classes, métodos e variáveis. Quando aplicado a uma classe, indica que a classe não pode ser subclassada. Quando aplicado a um método, indica que o método não pode ser sobrescrito (ou seja, não pode ter uma implementação diferente em subclasses). Quando aplicado a uma variável, indica que o valor da variável não pode ser alterado depois de inicializado (a variável se torna uma "constante").

```java
public class Circulo {
    private final double PI = 3.14; // Variável final

    public double area(double raio) {
        return PI * raio * raio;
    }

    public static void main(String[] args) {
        Circulo c = new Circulo();
        double area = c.area(2.0);
        System.out.println("Área do círculo: " + area); // Saída: Área do círculo: 12.56

        // Tentativa de atribuir um novo valor à variável final (gera erro de compilação)
        // c.PI = 3.14159;
    }
}
```

##

> Esses conceitos (protected, abstract e final) são fundamentais para estruturar e organizar o código em Java, permitindo maior controle sobre o acesso, a herança e a estruturação de classes e métodos.
