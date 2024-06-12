# 📝 Dia 11: Conceitos Avançados de POO em Java - `Interfaces` e `Polimorfismo`

No décimo primeiro dia do desafio, foquei em estudar `Interfaces` e `Polimorfismo` derivados de POO.

## 🧠 Conceitos Revisados

Durante este dia, revisei os seguintes conceitos:

### ✍🏻 `Interfaces` em Java
Interfaces em Java são um tipo especial de classe que é usado para definir métodos que outras classes devem implementar. Elas são usadas para especificar um contrato que uma classe deve seguir. Uma interface só pode conter assinaturas de métodos (sem implementação) e variáveis constantes (final e static).

**🧩 Características das Interfaces:**
- ***Abstração Completa:*** Interfaces não podem ter métodos com implementação (até o Java 8, onde métodos default e static foram introduzidos).
- ***Multipla Herança:*** Uma classe pode implementar várias interfaces, proporcionando uma forma de herança múltipla, o que não é possível com classes.
- ***Constantes:*** Variáveis dentro de uma interface são implicitamente public, static e final.
- ***Métodos:*** Métodos dentro de uma interface são implicitamente public e abstract (a menos que sejam default ou static no Java 8+).

**🧩 Exemplo de Uso:**
```java
interface Veiculo {
    void iniciar();
    void parar();
}

class Carro implements Veiculo {
    @Override
    public void iniciar() {
        System.out.println("Carro iniciado");
    }

    @Override
    public void parar() {
        System.out.println("Carro parado");
    }
}

public class Teste {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        meuCarro.iniciar();
        meuCarro.parar();
    }
}
```

--------------------------------------------------------------------------------------------

### ✍🏻 `Polimorfismo` em Java
Em termos simples, polimorfismo permite que um objeto tome muitas formas. Em Java, isso geralmente significa que uma classe pode ser referenciada como qualquer uma das suas superclasses ou interfaces que implementa. Existem dois tipos principais de polimorfismo em Java:

**🧩 1. Polimorfismo em Tempo de Compilação (Compile-Time Polymorphism):**
- Também conhecido como sobrecarga de métodos (method overloading). Ocorre quando mais de um método na mesma classe tem o mesmo nome, mas diferentes assinaturas (número ou tipo de parâmetros).
```java
class Calculadora {
    int soma(int a, int b) {
        return a + b;
    }
    
    double soma(double a, double b) {
        return a + b;
    }
}

public class Teste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(10, 20));  // Chama soma(int, int)
        System.out.println(calc.soma(10.5, 20.5));  // Chama soma(double, double)
    }
}
```

**🧩 2. Polimorfismo em Tempo de Execução (Runtime Polymorphism):**
- Também conhecido como sobrescrita de métodos (method overriding). Ocorre quando uma subclasse fornece uma implementação específica de um método que já foi declarado em sua superclasse. É comumente utilizado junto com herança.
```java
class Animal {
    void som() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {
    @Override
    void som() {
        System.out.println("O cachorro late");
    }
}

public class Teste {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.som();  // Chama o método sobrescrito em Cachorro
    }
}
```

##

> Os conceitos de polimorfismo e interfaces no código Java permitem um maior controle e flexibilidade, melhorando a estrutura e a reutilização do código.
